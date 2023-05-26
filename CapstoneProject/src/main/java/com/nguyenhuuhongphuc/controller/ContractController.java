package com.nguyenhuuhongphuc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nguyenhuuhongphuc.bean.Contract;
import com.nguyenhuuhongphuc.bean.Customer;
import com.nguyenhuuhongphuc.bean.Staff;
import com.nguyenhuuhongphuc.service.ContractService;
import com.nguyenhuuhongphuc.service.CustomerService;
import com.nguyenhuuhongphuc.service.StaffService;

@Controller
public class ContractController {
	
	@Autowired
	ContractService contractService;
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	StaffService staffService;
	
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
}