package com.nguyenhuuhongphuc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nguyenhuuhongphuc.bean.Customer;
import com.nguyenhuuhongphuc.dao.CustomerDAO;

@Service
public class CustomerService {
	
	@Autowired
	CustomerDAO customerDAO;
	
	public List<Customer> getCustomer() {
		return customerDAO.getCustomer();
	}
}