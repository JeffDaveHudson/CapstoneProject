package com.nguyenhuuhongphuc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nguyenhuuhongphuc.bean.Supplier;
import com.nguyenhuuhongphuc.bean.SupplierType;
import com.nguyenhuuhongphuc.service.SupplierService;

@Controller
public class SupplierController {
	 
	@Autowired
	SupplierService supplierService;
	
	
	@RequestMapping("supplier")
	public String showSupplierList(Model model) {
		
		List<Supplier> supplierList = supplierService.getSupplier();
		model.addAttribute("supplierList", supplierList);
		
		List<SupplierType> supplierTypeList = supplierService.getSupplierType();
		model.addAttribute("supplierTypeList", supplierTypeList);
		
		return "admin/Supplier";
	}
}
