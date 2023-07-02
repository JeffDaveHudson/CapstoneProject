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
	}
	
//	public Account loginAccount(String userName, String passWord) {
//		Account a = accountDAO.loginAccount2(userName, passWord);
//		System.out.println("login22: "+a.getUserName()+" - "+a.getPass());
//		return a;
//	}
	
	public int loginAccount(String username, String password) {
		Account account;
		try {
			account = accountDAO.getAccount(username);
		} catch (Exception e) {
			account = null;
		}
		int check = 0;
		if (account != null) {
			try {
				if (account.getPass().equals(password) || account.getPass().equals(null)) {
					check = 1;
				} 
				else check = -1;
			} catch (Exception e) {
				// TODO: handle exception
			}
		} 
		return check;
	}
}
