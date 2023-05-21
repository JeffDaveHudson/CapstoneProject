package com.nguyenhuuhongphuc.bean;

public class AccountType {
	private int id;
	private String roleDetail;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRoleDetail() {
		return roleDetail;
	}
	public void setRoleDetail(String roleDetail) {
		this.roleDetail = roleDetail;
	}
	public AccountType(int id, String roleDetail) {
		this.id = id;
		this.roleDetail = roleDetail;
	}
	
	public AccountType() {
	}
}
