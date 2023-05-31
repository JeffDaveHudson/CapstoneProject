package com.nguyenhuuhongphuc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
public class ProcesssController {
	
	@Autowired
	ContractService contractService;
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	StaffService staffService;
	
	@Autowired
	ProcesssService processsService;
	
	Processs processsId = new Processs();
	
	
	@RequestMapping("contractshowprocess")
	public String showProcess(Model model,
			@RequestParam("id") int idContract/* , @ModelAttribute("process") Processs processs */) {
		List<Contract> contractList = contractService.getContractById(idContract);
		model.addAttribute("contractList", contractList);
		
		processsId.setIdContract(idContract);
		
		List<Customer> customerList = customerService.getCustomer();
		model.addAttribute("customerList", customerList);
		
		List<Staff> staffList = staffService.getStaffList();
		model.addAttribute("staffList", staffList);
		
		List<Processs> processsList = processsService.showProcess(idContract);
		model.addAttribute("processList", processsList);
		
		model.addAttribute("process", new Processs());
		
		return "admin/ContractShowProcess";
	}
	

	@RequestMapping("processaddnewprocess")
	public String processProcess(Model model, @ModelAttribute("process") Processs processs) {
		processs.setIdContract(processsId.getIdContract());
		//System.out.println("what: "+processsId.getIdContract());
		System.out.println("lhllss: "+processs.getDetail()+processs.getStartDate()+processs.getEndDate()+"==="+processs.getIdContract());
		
		List<Contract> contractList = contractService.getContractById(processsId.getIdContract());
		model.addAttribute("contractList", contractList);
		
		List<Customer> customerList = customerService.getCustomer();
		model.addAttribute("customerList", customerList);
		
		List<Staff> staffList = staffService.getStaffList();
		model.addAttribute("staffList", staffList);
		
		
		
		processsService.createNewProcess(processs);
		
		List<Processs> processsList = processsService.showProcess(processsId.getIdContract());
		model.addAttribute("processList", processsList);
		
		return "admin/ContractShowProcess";
	}
}
