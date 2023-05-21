package com.nguyenhuuhongphuc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InventoryController {
	
	@RequestMapping("inventory")
	public String showInventory() {
		return "admin/Inventory";
	}
}
