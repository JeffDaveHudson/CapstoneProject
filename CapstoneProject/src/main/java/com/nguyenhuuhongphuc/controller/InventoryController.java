package com.nguyenhuuhongphuc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nguyenhuuhongphuc.bean.Product;
import com.nguyenhuuhongphuc.bean.ProductType;
import com.nguyenhuuhongphuc.bean.Staff;
import com.nguyenhuuhongphuc.bean.StaffType;
import com.nguyenhuuhongphuc.bean.Supplier;
import com.nguyenhuuhongphuc.service.InventoryService;
import com.nguyenhuuhongphuc.service.SupplierService;

@Controller
public class InventoryController {
	
	@Autowired
	InventoryService inventoryService;
	
	@Autowired
	SupplierService supplierService;
	
	@RequestMapping("inventory")
	public String showInventory(Model model) {
		
		List<Product> productList = inventoryService.getInventory();
		model.addAttribute("productList", productList);
		
		for (Product product : productList) {
			System.out.println("String: "+product.getId()+" *** "+product.getProductName()+" *** "+product.getIdProductType()+" *** "+product.getIdSupplier()+" *** "+product.getPrice()+" *** "+product.getStock());
		}
		
		List<ProductType> productTypeList = inventoryService.getProductType();
		model.addAttribute("productTypeList", productTypeList);
		
		List<Supplier> supplierList = supplierService.getSupplier();
		model.addAttribute("supplierList", supplierList);
		
		/*
		 * List<ProductInventory> productInventoryList =
		 * productInventoryService.getProductInventory();
		 * model.addAttribute("productInventoryList", productInventoryList);
		 */
		
		
		
		return "admin/Inventory";
	}
	


	@RequestMapping("inventorysearch")
	public String showInventorySearch(Model model, @RequestParam("searchInventoryString") String searchInventoryString) {
		
		List<Product> productList = inventoryService.getInventorySearch(searchInventoryString);
		model.addAttribute("productList", productList);
		
		//-------
		
		List<ProductType> productTypeList = inventoryService.getProductType();
		model.addAttribute("productTypeList", productTypeList);
		
		List<Supplier> supplierList = supplierService.getSupplier();
		model.addAttribute("supplierList", supplierList);
		
		/*
		 * List<ProductInventory> productInventoryList =
		 * productInventoryService.getProductInventory();
		 * model.addAttribute("productInventoryList", productInventoryList);
		 */
		
		return "admin/Inventory";
	}


	@RequestMapping("inventorysearchbyattribute")
	public String showInventoryByAttribute(Model model, @RequestParam("inventoryProductTypeClicked") String inventoryProductTypeClicked, 
			@RequestParam("inventorySupplierClicked") String inventorySupplierClicked) {
		
		List<Product> productList = inventoryService.getInventoryByAttribute(Integer.parseInt(inventoryProductTypeClicked), Integer.parseInt(inventorySupplierClicked));
		model.addAttribute("productList", productList);
		//-------
		
		List<ProductType> productTypeList = inventoryService.getProductType();
		model.addAttribute("productTypeList", productTypeList);
		
		List<Supplier> supplierList = supplierService.getSupplier();
		model.addAttribute("supplierList", supplierList);
		
		/*
		 * List<ProductInventory> productInventoryList =
		 * productInventoryService.getProductInventory();
		 * model.addAttribute("productInventoryList", productInventoryList);
		 */
		
		return "admin/Inventory";
	}
	
	@RequestMapping("productcreateform")
	public String showPproductCreateForm(Model model) {
		List<ProductType> productTypeList = inventoryService.getProductType();
		model.addAttribute("productTypeList",productTypeList);
		model.addAttribute("product", new Product());
		return "admin/InventoryCreate";
	}
	
	@PostMapping("productcreate")
	public String processStaffCreate(Model model, @ModelAttribute("product") Product product, @RequestParam("productTypeClicked") String productTypeClicked) {
		int idProductType = Integer.parseInt(productTypeClicked);
		product.setIdProductType(idProductType);
		inventoryService.createProduct(product);
		
		return "redirect:/inventory";
		
	}
	
}
