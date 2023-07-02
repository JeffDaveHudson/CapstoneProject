package com.nguyenhuuhongphuc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	static int staticIdProcess;
	static int staticIdContract;
	@GetMapping("processshowstep")
	public String showStepOfProcess(Model model, @RequestParam("id") int idProcess) {
		staticIdProcess = idProcess;
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

		staticIdContract = contractService.getIdContractByIdProcess(idProcess);
		//contractService.updatePrice(cost, idContract);
		
		model.addAttribute("step", new Step());
		
		return "admin/Step";
	}
	
	@PostMapping("stepaddnewstep")
	public String stepAddNewStep(Model model, @ModelAttribute("step") Step step) {
		step.setIdProcess(staticIdProcess);
		step.setIdProcess(staticIdProcess);
		//System.out.println("step:: "+step.getDetail()+" - "+step.getIdProduct()+" - "+step.getCost()+" - "+step.getIdState());
		
		stepService.createStep(step);
		processsService.updateProcessCost(step.getCost(), staticIdProcess);
		contractService.updatePrice(step.getCost(), staticIdContract);
		
		List<Product> productList = inventoryService.getInventory();
		model.addAttribute("productList", productList);
		
		List<State> stateList = stateService.getStateList();
		model.addAttribute("stateList", stateList);
		
		List<Processs> processList = processsService.getProcessById(staticIdProcess);
		model.addAttribute("processList", processList);
		
		List<Step> stepList = stepService.getStepByIdProcess(staticIdProcess);
		model.addAttribute("stepList", stepList);
		
		
		
		
		return "admin/Step";
	}
	
	@GetMapping("stepremove")
	public String stepRemove(Model model, @RequestParam("idStep") int idStep) {
		
		int cost = stepService.getCostByIdStep(idStep);
		processsService.updateProcessCostWhenRemovingStep(cost, staticIdProcess);
		contractService.updateContractPriceWhenRemovingStep(cost, staticIdContract);
		stepService.removeStep(idStep);
		
		List<Product> productList = inventoryService.getInventory();
		model.addAttribute("productList", productList);
		
		List<State> stateList = stateService.getStateList();
		model.addAttribute("stateList", stateList);
		
		List<Processs> processList = processsService.getProcessById(staticIdProcess);
		model.addAttribute("processList", processList);
		
		List<Step> stepList = stepService.getStepByIdProcess(staticIdProcess);
		model.addAttribute("stepList", stepList);
		
		model.addAttribute("step", new Step());
		
		return "admin/Step";
	}
	
	static int staticOldStepCost;
	@GetMapping("stepupdateform")
	public String stepUpdateForm(Model model, @RequestParam("id") int idStep) {
		
		List<Step> stepList = stepService.getStepByIdStep(idStep);
		model.addAttribute("stepList", stepList);
		
		for (Step step : stepList) {
			staticOldStepCost = step.getCost();
		}
		
		List<Product> productList = inventoryService.getInventory();
		model.addAttribute("productList", productList);
		
		List<State> stateList = stateService.getStateList();
		model.addAttribute("stateList", stateList);
		
//		List<Processs> processList = processsService.getProcessById(staticIdProcess);
//		model.addAttribute("processList", processList);
		
//		List<Step> stepList = stepService.getStepByIdProcess(staticIdProcess);
//		model.addAttribute("stepList", stepList);
		
		model.addAttribute("stepupdate", new Step());
		
		return "admin/StepUpdate";
	}
	
	@PostMapping("stepupdatestep")
	public String updateStep(Model model, @ModelAttribute("stepupdate") Step step) {
		step.setIdProcess(staticIdProcess);
		//System.out.println("step:: "+step.getDetail()+" - "+step.getIdProduct()+" - "+step.getCost()+" - "+step.getIdState()+" - "+step.getIdProcess());
		
		
		stepService.updateStep(step, staticOldStepCost);
		processsService.updateCostWhenUpdatingStep (staticOldStepCost, step.getCost(), staticIdProcess);
		contractService.updatePriceWhenUpdatingStep(staticOldStepCost, step.getCost(), staticIdContract);
		
		List<Product> productList = inventoryService.getInventory();
		model.addAttribute("productList", productList);
		
		List<State> stateList = stateService.getStateList();
		model.addAttribute("stateList", stateList);
		
		List<Processs> processList = processsService.getProcessById(staticIdProcess);
		model.addAttribute("processList", processList);
		
		List<Step> stepList = stepService.getStepByIdProcess(staticIdProcess);
		model.addAttribute("stepList", stepList);
		
		
		model.addAttribute("step", new Step());
		
		return "admin/Step";
	}
}
