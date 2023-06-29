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
import com.nguyenhuuhongphuc.bean.Problem;
import com.nguyenhuuhongphuc.service.CustomerService;
import com.nguyenhuuhongphuc.service.ProblemService;

@Controller
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	ProblemService problemService;
	
	@GetMapping("home")
	public String showIsNotSignCustomer(Model model) {
		
		List<Customer> customerList = customerService.getIsNotSignedCustomer();
		model.addAttribute("customerList", customerList);
		
		List<Problem> problemList = problemService.getProblemIsNotSigned();
		model.addAttribute("problemList", problemList);
		
		return "admin/index";
	}
	
	//String problem ;
	@RequestMapping("customerschedule")
	public String customerShedule(Model model, @ModelAttribute("customer") Customer customer, @RequestParam("problem") String problemm) {
		System.out.println("show:: "+problemm);
		customerService.createCustomerIsNotSigned(customer);
		
		List<Customer> customers = customerService.getLastestCustomer();
		Problem problem = new Problem();
		problem.setDetail(problemm);
		for (Customer customer2 : customers) {
			problem.setIdCustomer(customer2.getId());
		}
		
		problemService.createProblem(problem);
		
		return "customer/ScheduleSuccessfully";
	}
	
	@RequestMapping("customerisnotsignedsearch")
	public String customerIsNotSignedSearch(Model model, @RequestParam("searchString") String searchString) {
				
		List<Customer> customerList = customerService.searchCustomerIsNotSigned(searchString);
		model.addAttribute("customerList", customerList);
		//model.addAttribute("problem", problem);
		
		return "admin/index";
	}
	
	@GetMapping("customerisnotsignedremove")
	public String removeIsNotSignCustomer(Model model, @RequestParam("id") int id) {
		
		customerService.removeIsNotSignCustomer(id);
		
		return "redirect:/home";
	}
	
//	@GetMapping("schedulesuccessfully")
//	public String scheduleSuccessfully(Model model) {
//				
//		return "customer/ScheduleSuccessfully";
//	}
}
