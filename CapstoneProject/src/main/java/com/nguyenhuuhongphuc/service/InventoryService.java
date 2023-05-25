package com.nguyenhuuhongphuc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nguyenhuuhongphuc.bean.Product;
import com.nguyenhuuhongphuc.bean.ProductType;
import com.nguyenhuuhongphuc.dao.InventoryDAO;

@Service
public class InventoryService {
	
	@Autowired
	InventoryDAO inventoryDAO;
	
	public List<Product> getInventory(){
		return inventoryDAO.getInventory();
	}
	
	public List<ProductType> getProductType(){
		return inventoryDAO.getProductType();
	}
	
	public List<Product> getInventorySearch(String searchInventoryString){
		return inventoryDAO.getInventorySearch(searchInventoryString);
	}

	public List<Product> getInventoryByAttribute(int idProductType, int idSupplier) {
		return inventoryDAO.getInventoryByAttribute(idProductType, idSupplier);
	}

	public void createProduct(Product product) {
		inventoryDAO.createProduct(product);
	}

	public List<Product> getProductById(int id) {
		return inventoryDAO.getProductById(id);
	}

	public void updateProduct(Product product) {
		inventoryDAO.updateProduct(product);
		
	}
}
