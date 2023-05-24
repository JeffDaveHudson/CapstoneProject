package com.nguyenhuuhongphuc.controller;

import java.awt.Dialog.ModalExclusionType;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nguyenhuuhongphuc.bean.Bill;
import com.nguyenhuuhongphuc.bean.BillDetail;
import com.nguyenhuuhongphuc.bean.Product;
import com.nguyenhuuhongphuc.bean.Staff;
import com.nguyenhuuhongphuc.bean.Supplier;
import com.nguyenhuuhongphuc.service.BillService;
import com.nguyenhuuhongphuc.service.InventoryService;
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
	
	@Autowired
	InventoryService inventoryService;
	
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
	
	@RequestMapping("billcreate")
	public String showBillCreateForm(Model model) {
		
		List<Staff> staffList = staffService.getStaffList();
		model.addAttribute("staffList", staffList);
		
		List<Supplier> supplierList = supplierService.getSupplier();
		model.addAttribute("supplierList", supplierList);
		
		model.addAttribute("bill", new Bill());
		return "admin/BillCreate";
	}
	
	public Bill bill = new Bill();
	
	
	
	@RequestMapping("billdetailcreate")
	public String billCreate(@ModelAttribute("bill") Bill bill, Model model) {
		//System.out.println("=="+bill.getBillName()+"-"+bill.getIdStaff()+"-"+bill.getIdSupplier()+"-"+bill.getDateTransfer());
		
		List<Staff> staffList = staffService.getStaffList();
		model.addAttribute("staffList", staffList);
		
		List<Supplier> supplierList = supplierService.getSupplier();
		model.addAttribute("supplierList", supplierList);
		
		List<Product> productList = inventoryService.getInventory();
		model.addAttribute("productList", productList);
		
		billService.createNewBill(bill);
		
		List<Bill> lastestBill = billService.getTheLastestBill();
		for (Bill bill2 : lastestBill) {
			this.bill = bill2;
		}
		
		
		
		model.addAttribute("lastestBill", lastestBill);
		model.addAttribute("billDetail", new BillDetail());
		return "admin/BillDetailCreate";
	}
	
	@RequestMapping("processbillcreate")
	public String billDetailCreate(@ModelAttribute("billDetail") BillDetail billDetail, Model model) {
		billDetail.setIdBill(bill.getId());
		
		List<Staff> staffList = staffService.getStaffList();
		model.addAttribute("staffList", staffList);
		
		List<Supplier> supplierList = supplierService.getSupplier();
		model.addAttribute("supplierList", supplierList);
		
		List<Bill> lastestBill = billService.getTheLastestBill();
		model.addAttribute("lastestBill", lastestBill);
		
		List<Product> productList = inventoryService.getInventory();
		model.addAttribute("productList", productList);
		
		billService.createNewBillDetail(billDetail);
		
		billService.updateProductStock(billDetail.getQuantity(), billDetail.getIdProduct());
		
		List<BillDetail> billDetailListWhenCreating = billService.getBillDetailWhenCreating(bill.getId());
		
		List<Bill> getTotelBill = billService.getTotalInBill(bill.getId());
		int total = 0;
		for (Bill bill2 : getTotelBill) {
			total = bill2.getTotal();
		}
		model.addAttribute("total", total);
		
		model.addAttribute("billDetailListWhenCreating", billDetailListWhenCreating);
		model.addAttribute("bill", bill);
		model.addAttribute("billDetail", new BillDetail());
		return "admin/BillDetailCreate";
	}
	
	
}