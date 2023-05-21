package com.nguyenhuuhongphuc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nguyenhuuhongphuc.bean.Account;
import com.nguyenhuuhongphuc.dao.AccountDAO;

@Service
public class AccountService {
	
	@Autowired
	private AccountDAO accountDAO;
	
	public Account getAccount(String userName) {
		return accountDAO.getAccount(userName);
	}
	
	public void createAccountThroughAddNewStaff(String string) {
		accountDAO.createAccountThroughAddNewStaff(string);
	}
	
	public void deleteAccountThroughDeleteStaff(String userName) {
		accountDAO.deleteAccountThroughDeleteStaff(userName);
		System.out.println("s: "+userName);
	}
}
