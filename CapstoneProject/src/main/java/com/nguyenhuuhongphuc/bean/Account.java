package com.nguyenhuuhongphuc.bean;

public class Account {
	private String userName;
	private String pass;
	private int idAccountType;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public int getIdAccountType() {
		return idAccountType;
	}
	public void setIdAccountType(int idAccountType) {
		this.idAccountType = idAccountType;
	}
	public Account(String userName, String pass, int idAccountType) {
		this.userName = userName;
		this.pass = pass;
		this.idAccountType = idAccountType;
	}
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
}
