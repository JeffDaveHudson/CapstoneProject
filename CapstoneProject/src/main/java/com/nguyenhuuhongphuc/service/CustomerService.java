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

	public void updateCustomerWhenUpdatingContract(Customer customerUpdateContract) {
		customerDAO.updateCustomerWhenUpdatingContract(customerUpdateContract);
	}

	public void createCustomerWhenUpdatingContract(Customer customerCreateContract) {
		customerDAO.createCustomerWhenUpdatingContract(customerCreateContract);
	}
	
	public List<Customer> getLastestCustomer() {
		return customerDAO.getLastestCustomer();
	}

	public void createCustomerIsNotSigned(Customer customer) {
		customerDAO.createCustomerIsNotSigned(customer);
	}
	
	public List<Customer> getIsNotSignedCustomer(){
		return customerDAO.getIsNotSignedCustomer();
	}

	public List<Customer> getCustomerWithContract(int id) {
		return customerDAO.getCustomerWithContract(id);
	}

	public void updateIsSignedCustomer(int idExistedCustomer) {
		customerDAO.updateIsSignedCustomer(idExistedCustomer);
	}

	public void removeIsNotSignCustomer(int id) {
		customerDAO.removeIsNotSignCustomer(id);
	}
}
