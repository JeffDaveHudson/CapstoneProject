package com.nguyenhuuhongphuc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
