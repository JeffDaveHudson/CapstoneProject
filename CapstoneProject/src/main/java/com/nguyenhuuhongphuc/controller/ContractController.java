package com.nguyenhuuhongphuc.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder.In;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nguyenhuuhongphuc.bean.Contract;
import com.nguyenhuuhongphuc.bean.Customer;
import com.nguyenhuuhongphuc.bean.Problem;
import com.nguyenhuuhongphuc.bean.Processs;
import com.nguyenhuuhongphuc.bean.Staff;
import com.nguyenhuuhongphuc.bean.Step;
import com.nguyenhuuhongphuc.service.ContractService;
import com.nguyenhuuhongphuc.service.CustomerService;
import com.nguyenhuuhongphuc.service.ProblemService;
import com.nguyenhuuhongphuc.service.ProcesssService;
import com.nguyenhuuhongphuc.service.StaffService;
import com.nguyenhuuhongphuc.service.StepProductQuantityService;
import com.nguyenhuuhongphuc.service.StepService;

@Controller
public class ContractController {

	@Autowired
	ContractService contractService;

	@Autowired
	CustomerService customerService;

	@Autowired
	StaffService staffService;

	@Autowired
	ProcesssService processsService;
	
	@Autowired
	ProblemService problemService;
	
	@Autowired
	StepProductQuantityService stepProductQuantityService;
	
	@Autowired
	StepService stepService;

	@RequestMapping("contract")
	public String showContract(Model model) {
		List<Contract> contractList = contractService.getContract();
		model.addAttribute("contractList", contractList);

		List<Customer> customerList = customerService.getCustomer();
		model.addAttribute("customerList", customerList);

		List<Staff> staffList = staffService.getStaffList();
		model.addAttribute("staffList", staffList);

		return "admin/Contract";
	}

	@RequestMapping("contractsearch")
	public String showContractBySearch(Model model, @RequestParam("searchString") String searchString) {
		List<Contract> contractList = contractService.getContractBySearch(searchString);
		model.addAttribute("contractList", contractList);

		List<Customer> customerList = customerService.getCustomer();
		model.addAttribute("customerList", customerList);

		List<Staff> staffList = staffService.getStaffList();
		model.addAttribute("staffList", staffList);

		return "admin/Contract";
	}

	@GetMapping(value = "contractremove")
	public String removeContract(@RequestParam(value = "id", required = true) int id, Model model) {
		// System.out.println("delete: "+id);
		
		List<Step> stepList;
		List<Processs> processsList = processsService.getProcessByIdContract(id);
		for (Processs processs : processsList) {
			stepList = stepService.getStepByIdProcess(processs.getId());
			for (Step step : stepList) {
				stepProductQuantityService.removeStepProductQuantityByIdStep(step.getId());
				stepService.removeStep(step.getId());
			}
			processsService.removeProcess(processs.getId());
		}

		//processsService.removeProcessWhenRemovingContract(id);

		contractService.removeContract(id);

		return "redirect:/contract";
	}

	int idCustomerContract;

	@GetMapping(value = "contractupdateform")
	public String showContractUpdate(@RequestParam("id") int id, Model model) {
		System.out.println("update: " + id);
		List<Contract> contractList = contractService.getContractById(id);
		model.addAttribute("contractList", contractList);

		for (Contract contract : contractList) {
			idCustomerContract = contract.getIdCustomer();
		}

		List<Customer> customerList = customerService.getCustomer();
		model.addAttribute("customerList", customerList);

		List<Staff> staffList = staffService.getStaffList();
		model.addAttribute("staffList", staffList);

		model.addAttribute("contractupdate", new Contract());
		return "admin/ContractUpdate";
	}

	@PostMapping("processupdatecontract")
	public String processUpdateContract(Model model, @ModelAttribute("contractupdate") Contract contract,
			@RequestParam("customerName") String customerName, @RequestParam("phone") String phone,
			@RequestParam("address") String address, @RequestParam("email") String email) {

		// System.out.println("updateContract: "+contract.getId()+" -
		// "+contract.getDetail()+" - "+idCustomerContract+" -
		// "+contract.getSigningDate()+" - "+contract.getPrice()+" -
		// "+contract.getIdStaff());
		// System.out.println("updateContract--: "+customerName+" -
		// "+Integer.parseInt(phone)+" - "+address+" - "+email);

		Customer customerUpdateContract = new Customer();
		customerUpdateContract.setId(idCustomerContract);
		customerUpdateContract.setCustomerName(customerName);
		customerUpdateContract.setPhone(Integer.parseInt(phone));
		customerUpdateContract.setAddress(address);
		customerUpdateContract.setEmail(email);

		// System.out.println("updateContract--:
		// "+customerUpdateContract.getCustomerName()+" -
		// "+customerUpdateContract.getPhone()+" -
		// "+customerUpdateContract.getAddress()+" -
		// "+customerUpdateContract.getEmail());

		customerService.updateCustomerWhenUpdatingContract(customerUpdateContract);

		contractService.updateContract(contract);

		return "redirect:/contract";
	}

	@GetMapping(value = "contractcreateform")
	public String showContractCreate(Model model) {
		List<Staff> staffList = staffService.getStaffList();
		model.addAttribute("staffList", staffList);

		model.addAttribute("contract", new Contract());
		return "admin/ContractCreate";
	}

	@PostMapping("contractcreate")
	public String processCreateContract(Model model, @ModelAttribute("contract") Contract contract,
			@RequestParam("customerName") String customerName, @RequestParam("phone") String phone,
			@RequestParam("address") String address, @RequestParam("email") String email) {

		Customer customerCreateContract = new Customer();
		customerCreateContract.setId(idCustomerContract);
		customerCreateContract.setCustomerName(customerName);
		customerCreateContract.setPhone(Integer.parseInt(phone));
		customerCreateContract.setAddress(address);
		customerCreateContract.setEmail(email);

		customerService.createCustomerWhenUpdatingContract(customerCreateContract);

		List<Customer> customerList = customerService.getLastestCustomer();
		for (Customer customer : customerList) {
			contract.setIdCustomer(customer.getId());
		}

		contractService.createContract(contract);

		return "redirect:/contract";
	}

	static int idExistedCustomer;

	@GetMapping(value = "createcontractwithcustomerform")
	public String showContractFormWithCustomer(@RequestParam("id") int id, Model model) {
		idExistedCustomer = id;

		List<Customer> customerWithContract = customerService.getCustomerWithContract(id);
		model.addAttribute("customerList", customerWithContract);

		List<Staff> staffList = staffService.getStaffList();
		model.addAttribute("staffList", staffList);
		
		List<Problem> problemList = problemService.getProblemByIdCustomer(id);
		for (Problem problem : problemList) {
			System.out.println("ohyeah: "+problem.getId()+" - "+problem.getIdCustomer()+" - "+problem.getDetail()+" - "+problem.isSigned());
		}
		model.addAttribute("problemList", problemList);

		model.addAttribute("contract", new Contract());

		return "admin/ContractCreate2";
	}

	@PostMapping("contractcreatewithexistedcustomer")
	public String processCreateContractWithExistedCustomer(Model model, @ModelAttribute("contract") Contract contract) {
		contract.setIdCustomer(idExistedCustomer);
		contractService.createContract(contract);
		customerService.updateIsSignedCustomer(idExistedCustomer);

		return "redirect:/contract";
	}

	// -customer
	@PostMapping("customercontract")
	public String showCustomerContract(Model model, @RequestParam("phone") String phone) {

		List<Customer> customerByPhone = customerService.getCustomerContractByPhone(Integer.parseInt(phone));
		model.addAttribute("customerList", customerByPhone);

		List<Contract> contractByCustomer = contractService.getCustomerContract(Integer.parseInt(phone));
		model.addAttribute("contractList", contractByCustomer);

		List<Staff> staffList = staffService.getStaffList();
		model.addAttribute("staffList", staffList);

		return "customer/ProcessContractFrame";
	}

	@GetMapping("revenue")
	public String getRevenue(Model model) {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDateTime now = LocalDateTime.now();

		String[] date = dtf.format(now).toString().split("/", 3);
		String year = date[0];
		String month = date[1];
		String day = date[2];
		int revenueByMonth = contractService.getTotalRevenueByMonth(year, month);
		model.addAttribute("revenueByMonth", revenueByMonth);

		int quarter1 = contractService.getTotalRevenueByQuarter1(year);
		int quarter2 = contractService.getTotalRevenueByQuarter2(year);
		int quarter3 = contractService.getTotalRevenueByQuarter3(year);
		int quarter4 = contractService.getTotalRevenueByQuarter4(year);
		model.addAttribute("quarter1", quarter1);
		model.addAttribute("quarter2", quarter2);
		model.addAttribute("quarter3", quarter3);
		model.addAttribute("quarter4", quarter4);

		return "admin/Revenue";
	}
	
	static String startDateTemp;
	static String endDateTemp;
	@RequestMapping("revenuebetween2times")
	public String getRevenueBetween2Time(Model model, @RequestParam("startDate") String startDate,
			@RequestParam("endDate") String endDate) {
		
		startDateTemp = startDate;
		endDateTemp   = endDate;

		model.addAttribute("endDate", endDate);
		model.addAttribute("startDate", startDate);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDateTime now = LocalDateTime.now();

		String[] date = dtf.format(now).toString().split("/", 3);
		String year = date[0];
		String month = date[1];
		String day = date[2];
		int revenueByMonth = contractService.getTotalRevenueByMonth(year, month);
		model.addAttribute("revenueByMonth", revenueByMonth);

		int quarter1 = contractService.getTotalRevenueByQuarter1(year);
		int quarter2 = contractService.getTotalRevenueByQuarter2(year);
		int quarter3 = contractService.getTotalRevenueByQuarter3(year);
		int quarter4 = contractService.getTotalRevenueByQuarter4(year);
		model.addAttribute("quarter1", quarter1);
		model.addAttribute("quarter2", quarter2);
		model.addAttribute("quarter3", quarter3);
		model.addAttribute("quarter4", quarter4);

		int revenueBetween2Times = contractService.getRevenueBetween2Time(startDate, endDate);
		model.addAttribute("revenueBetween2Times", revenueBetween2Times);

		return "admin/Revenue";
	}

	@GetMapping("revenuedetailbycurrentmonth")
	public String getRevenueDetailByCurrentMonth(Model model) {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDateTime now = LocalDateTime.now();

		String[] date = dtf.format(now).toString().split("/", 3);
		String year = date[0];
		String month = date[1];
		String day = date[2];
		List<Contract> contractList = contractService.getRevenueDetailByCurrentMonth(year, month);
		model.addAttribute("contractList", contractList);

		List<Customer> customerList = customerService.getCustomer();
		model.addAttribute("customerList", customerList);

		List<Staff> staffList = staffService.getStaffList();
		model.addAttribute("staffList", staffList);

		return "admin/RevenueDetail";
	}

	@GetMapping("revenuedetailbyquarter1")
	public String getRevenueDetailByQuarter1(Model model) {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDateTime now = LocalDateTime.now();

		String[] date = dtf.format(now).toString().split("/", 3);
		String year = date[0];
		String month = date[1];
		String day = date[2];

		List<Contract> contractList = contractService.getRevenueDetailByQuarter1(year);
		model.addAttribute("contractList", contractList);

		List<Customer> customerList = customerService.getCustomer();
		model.addAttribute("customerList", customerList);

		List<Staff> staffList = staffService.getStaffList();
		model.addAttribute("staffList", staffList);

		return "admin/RevenueDetail";
	}
	
	@GetMapping("revenuedetailbyquarter2")
	public String getRevenueDetailByQuarter2(Model model) {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDateTime now = LocalDateTime.now();

		String[] date = dtf.format(now).toString().split("/", 3);
		String year = date[0];
		String month = date[1];
		String day = date[2];

		List<Contract> contractList = contractService.getRevenueDetailByQuarter2(year);
		model.addAttribute("contractList", contractList);

		List<Customer> customerList = customerService.getCustomer();
		model.addAttribute("customerList", customerList);

		List<Staff> staffList = staffService.getStaffList();
		model.addAttribute("staffList", staffList);

		return "admin/RevenueDetail";
	}
	
	@GetMapping("revenuedetailbyquarter3")
	public String getRevenueDetailByQuarter3(Model model) {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDateTime now = LocalDateTime.now();

		String[] date = dtf.format(now).toString().split("/", 3);
		String year = date[0];
		String month = date[1];
		String day = date[2];

		List<Contract> contractList = contractService.getRevenueDetailByQuarter3(year);
		model.addAttribute("contractList", contractList);

		List<Customer> customerList = customerService.getCustomer();
		model.addAttribute("customerList", customerList);

		List<Staff> staffList = staffService.getStaffList();
		model.addAttribute("staffList", staffList);

		return "admin/RevenueDetail";
	}
	
	@GetMapping("revenuedetailbyquarter4")
	public String getRevenueDetailByQuarter4(Model model) {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDateTime now = LocalDateTime.now();

		String[] date = dtf.format(now).toString().split("/", 3);
		String year = date[0];
		String month = date[1];
		String day = date[2];

		List<Contract> contractList = contractService.getRevenueDetailByQuarter4(year);
		model.addAttribute("contractList", contractList);

		List<Customer> customerList = customerService.getCustomer();
		model.addAttribute("customerList", customerList);

		List<Staff> staffList = staffService.getStaffList();
		model.addAttribute("staffList", staffList);

		return "admin/RevenueDetail";
	}
	
	@GetMapping("revenuedetailbetween2times")
	public String getRevenueDetailBetween2Times(Model model) {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDateTime now = LocalDateTime.now();

		String[] date = dtf.format(now).toString().split("/", 3);
		String year = date[0];
		String month = date[1];
		String day = date[2];

		List<Contract> contractList = contractService.getRevenueDetailBetween2Times(startDateTemp, endDateTemp);
		model.addAttribute("contractList", contractList);
		
		List<Customer> customerList = customerService.getCustomer();
		model.addAttribute("customerList", customerList);

		List<Staff> staffList = staffService.getStaffList();
		model.addAttribute("staffList", staffList);

		return "admin/RevenueDetail";
	}
}
