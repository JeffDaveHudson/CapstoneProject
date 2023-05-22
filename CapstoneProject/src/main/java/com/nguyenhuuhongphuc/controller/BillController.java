package com.nguyenhuuhongphuc.controller;

import java.awt.Dialog.ModalExclusionType;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nguyenhuuhongphuc.bean.Bill;
import com.nguyenhuuhongphuc.bean.Staff;
import com.nguyenhuuhongphuc.bean.Supplier;
import com.nguyenhuuhongphuc.service.BillService;
import com.nguyenhuuhongphuc.service.StaffService;
import com.nguyenhuuhongphuc.service.SupplierService;

@Controller
public class BillController {
	
	@Autowired
	BillService billService;
	
	@Autowired
	SupplierService supplierService;
	
	@Autowired
	StaffService staffService;
	
	@RequestMapping("bill")
	public String showBillList(Model model) {
		
		List<Bill> billList = billService.getBillList();
		model.addAttribute("billList", billList);
		
		List<Supplier> supplierList = supplierService.getSupplier();
		model.addAttribute("supplierList", supplierList);
		
		List<Staff> staffList = staffService.getStaffList();
		model.addAttribute("staffList", staffList);
		
		return "admin/Bill";
	}
	
	@RequestMapping("billsearch")
	public String getBillSearch(Model model, @RequestParam("searchString") String searchString) {
		
		List<Bill> billList = billService.getBillSearch(searchString);
		model.addAttribute("billList", billList);
		
		List<Supplier> supplierList = supplierService.getSupplier();
		model.addAttribute("supplierList", supplierList);
		
		List<Staff> staffList = staffService.getStaffList();
		model.addAttribute("staffList", staffList);
		
		return "admin/Bill";
	}
}
