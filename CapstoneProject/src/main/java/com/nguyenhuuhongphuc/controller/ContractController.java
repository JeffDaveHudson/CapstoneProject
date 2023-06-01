package com.nguyenhuuhongphuc.controller;

import java.util.List;

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
import com.nguyenhuuhongphuc.bean.Processs;
import com.nguyenhuuhongphuc.bean.Staff;
import com.nguyenhuuhongphuc.service.ContractService;
import com.nguyenhuuhongphuc.service.CustomerService;
import com.nguyenhuuhongphuc.service.ProcesssService;
import com.nguyenhuuhongphuc.service.StaffService;

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
	public String removeContract(@RequestParam(value = "id", required=true) int id, Model model) {
		//System.out.println("delete: "+id);

		processsService.removeProcessWhenRemovingContract(id);
		
		contractService.removeContract(id);
		
		
		return "redirect:/contract";
	}
	
	int idCustomerContract;
	
	@GetMapping( value =  "contractupdateform")
	public String showContractUpdate(@RequestParam("id") int id, Model model) {
		System.out.println("update: "+id);
		List<Contract> contractList = contractService.getContractById(id);
		model.addAttribute("contractList",contractList);
		
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
			@RequestParam("customerName") String customerName, 
			@RequestParam("phone")        String phone       , 
			@RequestParam("address")      String address     , 
			@RequestParam("email")        String email        ) {
		
		//System.out.println("updateContract: "+contract.getId()+" - "+contract.getDetail()+" - "+idCustomerContract+" - "+contract.getSigningDate()+" - "+contract.getPrice()+" - "+contract.getIdStaff());
		//System.out.println("updateContract--: "+customerName+" - "+Integer.parseInt(phone)+" - "+address+" - "+email);
		
		Customer customerUpdateContract = new Customer();
		customerUpdateContract.setId(idCustomerContract);
		customerUpdateContract.setCustomerName(customerName);
		customerUpdateContract.setPhone(Integer.parseInt(phone));
		customerUpdateContract.setAddress(address);
		customerUpdateContract.setEmail(email);
		
		//System.out.println("updateContract--: "+customerUpdateContract.getCustomerName()+" - "+customerUpdateContract.getPhone()+" - "+customerUpdateContract.getAddress()+" - "+customerUpdateContract.getEmail());

		customerService.updateCustomerWhenUpdatingContract(customerUpdateContract);
		
		contractService.updateContract(contract);
		
		
		return "redirect:/contract";
	}
	
	@GetMapping( value =  "contractcreateform")
	public String showContractCreate( Model model) {
		List<Staff> staffList = staffService.getStaffList();
		model.addAttribute("staffList", staffList);
		
		model.addAttribute("contract", new Contract());
		return "admin/ContractCreate";
	}
	
	@PostMapping("contractcreate")
	public String processCreateContract(Model model, @ModelAttribute("contract") Contract contract,
			@RequestParam("customerName") String customerName, 
			@RequestParam("phone")        String phone       , 
			@RequestParam("address")      String address     , 
			@RequestParam("email")        String email        ) {
		
		//System.out.println("Contract: "+contract.getDetail()+" - "+contract.getSigningDate()+" - "+contract.getPrice()+" - "+contract.getIdStaff());
		//System.out.println("Contract--: "+customerName+" - "+Integer.parseInt(phone)+" - "+address+" - "+email);
		
		Customer customerCreateContract = new Customer();
		customerCreateContract.setId(idCustomerContract);
		customerCreateContract.setCustomerName(customerName);
		customerCreateContract.setPhone(Integer.parseInt(phone));
		customerCreateContract.setAddress(address);
		customerCreateContract.setEmail(email);
		
		//System.out.println("cContract--: "+customerCreateContract.getCustomerName()+" - "+customerCreateContract.getPhone()+" - "+customerCreateContract.getAddress()+" - "+customerCreateContract.getEmail());

		customerService.createCustomerWhenUpdatingContract(customerCreateContract);
		
		List<Customer> customerList = customerService.getLastestCustomer();
		for (Customer customer : customerList) {
			contract.setIdCustomer(customer.getId());
		}
		
		contractService.createContract(contract);
		
		
		return "redirect:/contract";
	}
	
	
	/*
	 * @RequestMapping("contractshowprocess") public String showProcess(Model
	 * model, @RequestParam("id") int idContract, @ModelAttribute("process")
	 * Processs processs) { List<Contract> contractList =
	 * contractService.getContractById(idContract);
	 * model.addAttribute("contractList", contractList);
	 * 
	 * List<Customer> customerList = customerService.getCustomer();
	 * model.addAttribute("customerList", customerList);
	 * 
	 * List<Staff> staffList = staffService.getStaffList();
	 * model.addAttribute("staffList", staffList);
	 * 
	 * List<Processs> processsList = processsService.showProcess(idContract);
	 * model.addAttribute("processList", processsList);
	 * 
	 * return "admin/ContractShowProcess"; }
	 */
}
