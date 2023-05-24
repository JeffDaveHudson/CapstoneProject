package com.nguyenhuuhongphuc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nguyenhuuhongphuc.bean.Supplier;
import com.nguyenhuuhongphuc.dao.SupplierDAO;

@Service
public class SupplierService {
	
	@Autowired
	SupplierDAO supplierDAO;
	
	public List<Supplier> getSupplier(){
		return supplierDAO.getSupplier();
	}
}
