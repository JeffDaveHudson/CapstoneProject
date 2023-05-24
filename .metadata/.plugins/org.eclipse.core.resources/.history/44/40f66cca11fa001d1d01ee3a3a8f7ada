package com.nguyenhuuhongphuc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nguyenhuuhongphuc.bean.ProductInventory;
import com.nguyenhuuhongphuc.dao.ProductInventoryDAO;

@Service
public class ProductInventoryService {
	
	@Autowired
	ProductInventoryDAO productInventoryDAO;
	
	public List<ProductInventory> getProductInventory(){
		return productInventoryDAO.getProductInventory();
	}
}
