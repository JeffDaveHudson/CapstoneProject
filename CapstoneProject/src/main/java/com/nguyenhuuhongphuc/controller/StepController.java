package com.nguyenhuuhongphuc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nguyenhuuhongphuc.bean.Cost;
import com.nguyenhuuhongphuc.bean.Processs;
import com.nguyenhuuhongphuc.bean.Product;
import com.nguyenhuuhongphuc.bean.State;
import com.nguyenhuuhongphuc.bean.Step;
import com.nguyenhuuhongphuc.dao.StepDAO;
import com.nguyenhuuhongphuc.service.ContractService;
import com.nguyenhuuhongphuc.service.InventoryService;
import com.nguyenhuuhongphuc.service.ProcesssService;
import com.nguyenhuuhongphuc.service.StateService;
import com.nguyenhuuhongphuc.service.StepService;

@Controller
public class StepController {
	
	@Autowired
	InventoryService inventoryService;
	
	@Autowired
	StateService stateService;
	
	@Autowired
	ProcesssService processsService;
	
	@Autowired
	StepService stepService;
	
	@Autowired
	ContractService contractService;
	
	@GetMapping("processshowstep")
	public String showStepOfProcess(Model model, @RequestParam("id") int idProcess) {
		
		List<Product> productList = inventoryService.getInventory();
		model.addAttribute("productList", productList);
		
		List<State> stateList = stateService.getStateList();
		model.addAttribute("stateList", stateList);
		
		List<Processs> processList = processsService.getProcessById(idProcess);
		model.addAttribute("processList", processList);
		
		List<Step> stepList = stepService.getStepByIdProcess(idProcess);
		model.addAttribute("stepList", stepList);
		
//		List<Cost> costList = processsService.getProcessCost(idProcess);
//		model.addAttribute("costList",costList);
		
//		int cost = processsService.getProcessCost(idProcess);
//		model.addAttribute("cost", cost);

//		int idContract = contractService.getIdContractByIdProcess(idProcess);
//		contractService.updatePrice(cost, idContract);
		
		return "admin/Step";
	}
}
