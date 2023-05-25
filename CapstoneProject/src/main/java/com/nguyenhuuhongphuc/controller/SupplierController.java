package com.nguyenhuuhongphuc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nguyenhuuhongphuc.bean.Product;
import com.nguyenhuuhongphuc.bean.Staff;
import com.nguyenhuuhongphuc.bean.StaffType;
import com.nguyenhuuhongphuc.bean.Supplier;
import com.nguyenhuuhongphuc.bean.SupplierType;
import com.nguyenhuuhongphuc.service.InventoryService;
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
	
	@GetMapping( value =  "supplierupdateform")
	public String showStaffUpdate(@RequestParam("id") int id, Model model) {
		System.out.println("update: "+id);
		
		List<Supplier> supplierList = supplierService.getSupplierById(id);
		for (Supplier supplier : supplierList) {
			System.out.println("--"+supplier.getId()+"-"+supplier.getSupplierName()+"-"+supplier.getIdSupplierType());
		}
		
		List<SupplierType> supplierTypeList = supplierService.getSupplierType();
		
		model.addAttribute("supplierList",supplierList);
		model.addAttribute("supplierTypeList", supplierTypeList);
		/* model.addAttribute("staffList",staffById); */
		/* model.addAttribute("staffTypeList", staffTypeList); */
		model.addAttribute("supplierupdate", new Supplier());
		
		return "admin/SupplierUpdate";
	}
	
	@PostMapping("processupdatesupplier")
	public String processUpdateSupplier(Model model, @ModelAttribute("supplierupdate") Supplier supplier, @RequestParam("supplierTypeClicked") String supplierTypeClicked) {
		supplier.setIdSupplierType(Integer.parseInt(supplierTypeClicked));
		supplierService.updateSupplier(supplier);
		return "redirect:/supplier";
	}
	
	@RequestMapping("suppliercreateform")
	public String showSupplierCreateForm(Model model) {
		List<SupplierType> supplierTypeList = supplierService.getSupplierType();
		model.addAttribute("supplierTypeList",supplierTypeList);
		model.addAttribute("supplier", new Supplier());
		return "admin/SupplierCreate";
	}
	
	@PostMapping("suppliercreate")
	public String processStaffCreate(Model model, @ModelAttribute("supplier") Supplier supplier, @RequestParam("supplierTypeClicked") String supplierTypeClicked) {
		int idSupplierType = Integer.parseInt(supplierTypeClicked);
		supplier.setIdSupplierType(idSupplierType);
		supplierService.createSupplier(supplier);
		
		return "redirect:/supplier";
		
	} 
	
	@PostMapping("suppliersearch")
	public String showSupplierSearch(Model model, @RequestParam("searchString") String searchString) {
		List<Supplier> supplierSeach = supplierService.getSupplierSearch(searchString);
		List<SupplierType> supplierTypeList = supplierService.getSupplierType();
		model.addAttribute("supplierList", supplierSeach);
		model.addAttribute("supplierTypeList", supplierTypeList);
		return "admin/Supplier";
	}
	
	
	
}
