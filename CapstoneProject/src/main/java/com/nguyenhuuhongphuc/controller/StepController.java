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
import com.nguyenhuuhongphuc.bean.StepProductQuantity;
import com.nguyenhuuhongphuc.dao.StepDAO;
import com.nguyenhuuhongphuc.service.ContractService;
import com.nguyenhuuhongphuc.service.InventoryService;
import com.nguyenhuuhongphuc.service.ProcesssService;
import com.nguyenhuuhongphuc.service.StateService;
import com.nguyenhuuhongphuc.service.StepProductQuantityService;
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
	
	@Autowired
	StepProductQuantityService stepProductQuantityService;
	
	static int staticIdProcess;
	static int staticIdContract;
	static int staticIdStep;
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
		
		List<StepProductQuantity> stepProductQuantityList = stepProductQuantityService.getStepProductQuantity();
		model.addAttribute("stepProductQuantityList", stepProductQuantityList);
//		for (StepProductQuantity stepProductQuantity : stepProductQuantityList) {
//			System.out.println("CON: "+stepProductQuantity.getId()+" - "+stepProductQuantity.getQuantity()+" - "+stepProductQuantity.getIdStep());
//		}
		
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
	public String stepAddNewStep(Model model, @ModelAttribute("step") Step step, @RequestParam("quantity") String quantityTemp) {
		step.setIdProcess(staticIdProcess);
		step.setIdProcess(staticIdProcess);
		int quantity = Integer.parseInt(quantityTemp);
		int price = 1;
		StepProductQuantity stepProductQuantity = new StepProductQuantity();
		
		
		stepService.createStep(step);
		
		
		List<Step> lastestSteplist = stepService.getLastestStep();
		for (Step step2 : lastestSteplist) {
			stepProductQuantity.setIdStep(step2.getId());
			
		}
			
		List<Product> productList = inventoryService.getInventory();
		model.addAttribute("productList", productList);
		for (Product product : productList) {
			if(product.getId()==step.getIdProduct()) {
				price = product.getPrice() * quantity;
			}
		}
		stepProductQuantity.setQuantity(quantity);
		stepProductQuantity.setCost(price);
		
		processsService.updateProcessCost(step.getCost()+price, staticIdProcess);
		contractService.updatePrice(step.getCost()+price, staticIdContract);
		
		stepProductQuantityService.createStepProductQuantity(stepProductQuantity);
		
		
		List<State> stateList = stateService.getStateList();
		model.addAttribute("stateList", stateList);
		
		List<Processs> processList = processsService.getProcessById(staticIdProcess);
		model.addAttribute("processList", processList);
		
		List<Step> stepList = stepService.getStepByIdProcess(staticIdProcess);
		model.addAttribute("stepList", stepList);
		
		List<StepProductQuantity> stepProductQuantityList = stepProductQuantityService.getStepProductQuantity();
		model.addAttribute("stepProductQuantityList", stepProductQuantityList);
		
		
		return "admin/Step";
	}
	
	@GetMapping("stepremove")
	public String stepRemove(Model model, @RequestParam("idStep") int idStep) {
		
		int cost = stepService.getCostByIdStep(idStep);
		int costStepProduct = stepProductQuantityService.getCostProductByIdStep(idStep);
		processsService.updateProcessCostWhenRemovingStep(cost+costStepProduct, staticIdProcess);
		contractService.updateContractPriceWhenRemovingStep(cost+costStepProduct, staticIdContract);
		stepProductQuantityService.removeStepProductQuantity(idStep);
		stepService.removeStep(idStep);
		
		List<Product> productList = inventoryService.getInventory();
		model.addAttribute("productList", productList);
		
		List<State> stateList = stateService.getStateList();
		model.addAttribute("stateList", stateList);
		
		List<Processs> processList = processsService.getProcessById(staticIdProcess);
		model.addAttribute("processList", processList);
		
		List<Step> stepList = stepService.getStepByIdProcess(staticIdProcess);
		model.addAttribute("stepList", stepList);
		
		List<StepProductQuantity> stepProductQuantityList = stepProductQuantityService.getStepProductQuantity();
		model.addAttribute("stepProductQuantityList", stepProductQuantityList);
		
		model.addAttribute("step", new Step());
		
		return "admin/Step";
	}
	
	static int staticOldStepCost;
	static int staticOldStepProductQuantityCost;
	@GetMapping("stepupdateform")
	public String stepUpdateForm(Model model, @RequestParam("id") int idStep) {
		
		List<Step> stepList = stepService.getStepByIdStep(idStep);
		model.addAttribute("stepList", stepList);
		
		for (Step step : stepList) {
			staticOldStepCost = step.getCost();
		}
		
		staticOldStepProductQuantityCost = stepProductQuantityService.getCostProductByIdStep(idStep);
		
		List<Product> productList = inventoryService.getInventory();
		model.addAttribute("productList", productList);
		
		List<State> stateList = stateService.getStateList();
		model.addAttribute("stateList", stateList);
		
		List<StepProductQuantity> stepProductQuantityList = stepProductQuantityService.getStepProductQuantity();
		model.addAttribute("stepProductQuantityList", stepProductQuantityList);
		
//		List<Processs> processList = processsService.getProcessById(staticIdProcess);
//		model.addAttribute("processList", processList);
		
//		List<Step> stepList = stepService.getStepByIdProcess(staticIdProcess);
//		model.addAttribute("stepList", stepList);
		
		model.addAttribute("stepupdate", new Step());
		
		return "admin/StepUpdate";
	}
	
	@PostMapping("stepupdatestep")
	public String updateStep(Model model, @ModelAttribute("stepupdate") Step step, @RequestParam("quantity") int quantity) {
		step.setIdProcess(staticIdProcess);
		//System.out.println("step:: "+step.getDetail()+" - "+step.getIdProduct()+" - "+step.getCost()+" - "+step.getIdState()+" - "+step.getIdProcess());
		System.out.println("quantity: "+quantity);
		int price = 1;
		List<Product> productList = inventoryService.getInventory();
		model.addAttribute("productList", productList);
		
		for (Product product : productList) {
			if(product.getId()==step.getIdProduct()) {
				price = product.getPrice() * quantity;
			}
		}
		//System.out.println("staticOldStepProductQuantityCost: "+staticOldStepProductQuantityCost);
		StepProductQuantity stepProductQuantity = new StepProductQuantity();
		stepProductQuantity.setIdStep(step.getId());
		stepProductQuantity.setQuantity(quantity);
		stepProductQuantity.setCost(price);
		
		stepProductQuantityService.updateStepProductQuantityCost(stepProductQuantity, staticOldStepProductQuantityCost);
		stepService.updateStep(step, staticOldStepCost);
		processsService.updateCostWhenUpdatingStep (staticOldStepCost, step.getCost(), staticOldStepProductQuantityCost, stepProductQuantity.getCost(), staticIdProcess);
		contractService.updatePriceWhenUpdatingStep(staticOldStepCost, step.getCost(), staticOldStepProductQuantityCost, stepProductQuantity.getCost(), staticIdContract);
//		
//		List<Product> productList = inventoryService.getInventory();
//		model.addAttribute("productList", productList);
		
		List<State> stateList = stateService.getStateList();
		model.addAttribute("stateList", stateList);
		
		List<Processs> processList = processsService.getProcessById(staticIdProcess);
		model.addAttribute("processList", processList);
		
		List<Step> stepList = stepService.getStepByIdProcess(staticIdProcess);
		model.addAttribute("stepList", stepList);
		
		List<StepProductQuantity> stepProductQuantityList = stepProductQuantityService.getStepProductQuantity();
		model.addAttribute("stepProductQuantityList", stepProductQuantityList);
		
		model.addAttribute("step", new Step());
		
		return "admin/Step";
	}
	
	@GetMapping("customerpage-processshowstep")
	public String showStepCustomerPage(Model model, @RequestParam("id") int idProcess) {
		//staticIdProcess = idProcess;
		List<Product> productList = inventoryService.getInventory();
		model.addAttribute("productList", productList);
		
		List<State> stateList = stateService.getStateList();
		model.addAttribute("stateList", stateList);
		
		List<Processs> processList = processsService.getProcessById(idProcess);
		model.addAttribute("processList", processList);
		
		List<Step> stepList = stepService.getStepByIdProcess(idProcess);
		model.addAttribute("stepList", stepList);
		
		List<StepProductQuantity> stepProductQuantityList = stepProductQuantityService.getStepProductQuantity();
		model.addAttribute("stepProductQuantityList", stepProductQuantityList);
		
//		List<Cost> costList = processsService.getProcessCost(idProcess);
//		model.addAttribute("costList",costList);
		
//		int cost = processsService.getProcessCost(idProcess);
//		model.addAttribute("cost", cost);

		//staticIdContract = contractService.getIdContractByIdProcess(idProcess);
		//contractService.updatePrice(cost, idContract);
		
		//model.addAttribute("step", new Step());
		
		return "customer/ProcessContractStepDetailFrame";
	}
}
