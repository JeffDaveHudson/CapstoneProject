package com.nguyenhuuhongphuc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nguyenhuuhongphuc.service.SupplierService;

@Controller
public class SupplierController {
	 
	@Autowired
	SupplierService supplierService;
	
	
}
