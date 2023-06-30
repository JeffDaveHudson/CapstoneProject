package com.nguyenhuuhongphuc.controller;

import java.util.Collection;
import java.util.List;
import java.util.Map;

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
import com.nguyenhuuhongphuc.bean.StaffType;
import com.nguyenhuuhongphuc.bean.State;
import com.nguyenhuuhongphuc.service.ContractService;
import com.nguyenhuuhongphuc.service.CustomerService;
import com.nguyenhuuhongphuc.service.ProcesssService;
import com.nguyenhuuhongphuc.service.StaffService;
import com.nguyenhuuhongphuc.service.StateService;

@Controller
public class ProcesssController {
	
	@Autowired
	ContractService contractService;
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	StaffService staffService;
	
	@Autowired
	ProcesssService processsService;
	
	@Autowired
	StateService stateService;
	
	
	Processs processsIdContract = new Processs();
	
	
	@RequestMapping("contractshowprocess")
	public String showProcess(Model model, @RequestParam("id") int idContract) {
		List<Contract> contractList = contractService.getContractById(idContract);
		model.addAttribute("contractList", contractList);
		
		processsIdContract.setIdContract(idContract);
		
		List<Customer> customerList = customerService.getCustomer();
		model.addAttribute("customerList", customerList);
		
		List<Staff> staffList = staffService.getStaffList();
		model.addAttribute("staffList", staffList);
		
		List<Processs> processsList = processsService.showProcess(idContract);
		model.addAttribute("processList", processsList);
		
		List<State> stateList = stateService.getStateList();
		model.addAttribute("stateList", stateList);
		
		model.addAttribute("process", new Processs());
		
		return "admin/Process";
	}
	
	
	@RequestMapping("processaddnewprocess")
	public String processProcess(Model model, @ModelAttribute("process") Processs processs) {
		processs.setIdContract(processsIdContract.getIdContract());
		//System.out.println("what: "+processsId.getIdContract());
		//System.out.println("lhllss: "+processs.getDetail()+processs.getStartDate()+processs.getEndDate()+"==="+processs.getIdContract());
		
		List<Contract> contractList = contractService.getContractById(processsIdContract.getIdContract());
		model.addAttribute("contractList", contractList);
		
		List<Customer> customerList = customerService.getCustomer();
		model.addAttribute("customerList", customerList);
		
		List<Staff> staffList = staffService.getStaffList();
		model.addAttribute("staffList", staffList);
		
		List<State> stateList = stateService.getStateList();
		model.addAttribute("stateList", stateList);
		
		processsService.createNewProcess(processs);
		
		List<Processs> processsList = processsService.showProcess(processsIdContract.getIdContract());
		model.addAttribute("processList", processsList);
		
		return "admin/Process";
	}
	
	@GetMapping(value = "processremove")
	public String removeProcess(@RequestParam(value = "idProcess", required=true) int idd, Model model) {
		//System.out.println("delete: "+id);
		
		processsService.removeProcess(idd);
		List<Contract> contractList = contractService.getContractById(processsIdContract.getIdContract());
		model.addAttribute("contractList", contractList);
		
		
		List<Customer> customerList = customerService.getCustomer();
		model.addAttribute("customerList", customerList);
		
		List<Staff> staffList = staffService.getStaffList();
		model.addAttribute("staffList", staffList);
		
		List<Processs> processsList = processsService.showProcess(processsIdContract.getIdContract());
		model.addAttribute("processList", processsList);
		
		model.addAttribute("process", new Processs());
		
		return "admin/Process";
	}
	
	@GetMapping( value =  "processupdateform")
	public String showStaffUpdate(@RequestParam("id") int id, Model model) {
		System.out.println("update: "+id);
		List<Processs> processsList = processsService.getProcessById(id);
		model.addAttribute("processList",processsList);
		
		List<State> stateList = stateService.getStateList();
		model.addAttribute("stateList", stateList);
		
		model.addAttribute("processupdate", new Processs());
		return "admin/ProcessUpdate";
	}
	
	@PostMapping("processupdateprocess")
	public String processUpdateProcess(Model model, @ModelAttribute("processupdate") Processs processs) {
		processsService.updateProcess(processs);

		List<Contract> contractList = contractService.getContractById(processsIdContract.getIdContract());
		model.addAttribute("contractList", contractList);
		
		
		List<Customer> customerList = customerService.getCustomer();
		model.addAttribute("customerList", customerList);
		
		List<Staff> staffList = staffService.getStaffList();
		model.addAttribute("staffList", staffList);
		
		List<State> stateList = stateService.getStateList();
		model.addAttribute("stateList", stateList);
		
		List<Processs> processsList = processsService.showProcess(processsIdContract.getIdContract());
		model.addAttribute("processList", processsList);
		
		model.addAttribute("process", new Processs());
		
		return "admin/Process";
		//staff
	}
	
	@RequestMapping("customerpage-contractshowprocess")
	public String showProcessCustomerPage(Model model, @RequestParam("id") int idContract) {
		List<Contract> contractList = contractService.getContractById(idContract);
		model.addAttribute("contractList", contractList);
		
		processsIdContract.setIdContract(idContract);
		
		List<Customer> customerList = customerService.getCustomer();
		model.addAttribute("customerList", customerList);
		
		List<Staff> staffList = staffService.getStaffList();
		model.addAttribute("staffList", staffList);
		
		List<Processs> processsList = processsService.showProcess(idContract);
		model.addAttribute("processList", processsList);
		
		List<State> stateList = stateService.getStateList();
		model.addAttribute("stateList", stateList);
		
		model.addAttribute("process", new Processs());
		
		return "customer/ProcessContractDetailFrame";
	}
	
	/*
	 * @RequestMapping("customerprocess") public String showCustomerProcess(Model
	 * model, @RequestParam("phone") String phone) {
	 * 
	 * 
	 * return "customer/Process"; }
	 */
}
