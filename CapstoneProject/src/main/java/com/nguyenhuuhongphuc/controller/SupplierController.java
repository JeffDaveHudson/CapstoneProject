package com.nguyenhuuhongphuc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nguyenhuuhongphuc.bean.Staff;
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
	
	@GetMapping(value = "supplierdelete")
	public String deleteStaff(@RequestParam("id") int id) {
		//System.out.println("delete: "+id);
		
		List<Supplier> supplierList = supplierService.getSupplierById(id);
		Supplier supplier = new Supplier();
		for (Supplier supplierlist : supplierList) {
			supplier.setSupplierName(supplierlist.getSupplierName());
		}
		//System.out.println("getUsername: "+staff.getUserName());
		supplierService.deleteSupplier(id);
		//accountService.deleteAccountThroughDeleteStaff(staff.getUserName());
		return "redirect:/supplier";
	}
}
