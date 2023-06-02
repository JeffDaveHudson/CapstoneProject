package com.nguyenhuuhongphuc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nguyenhuuhongphuc.bean.Customer;
import com.nguyenhuuhongphuc.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping("home")
	public String showIsNotSignCustomer(Model model) {
		
		List<Customer> customerList = customerService.getIsNotSignedCustomer();
		model.addAttribute("customerList", customerList);
		
		return "admin/index";
	}
	
	@RequestMapping("customerschedule")
	public String customerShedule(Model model, @ModelAttribute("customer") Customer customer) {
				
		customerService.createCustomerIsNotSigned(customer);
		
		return "customer/Schedule";
	}
	
	@RequestMapping("customerisnotsignedsearch")
	public String customerIsNotSignedSearch(Model model, @RequestParam("searchString") String searchString) {
				
		List<Customer> customerList = customerService.searchCustomerIsNotSigned(searchString);
		model.addAttribute("customerList", customerList);
		
		return "admin/index";
	}
	
	@GetMapping("customerisnotsignedremove")
	public String removeIsNotSignCustomer(Model model, @RequestParam("id") int id) {
		
		customerService.removeIsNotSignCustomer(id);
		
		return "redirect:/home";
	}
}
