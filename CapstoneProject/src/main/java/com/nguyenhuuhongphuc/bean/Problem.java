package com.nguyenhuuhongphuc.bean;

public class Problem {
	private int id;
	private String detail;
	private int idCustomer;
	private boolean isSigned;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public int getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}
	public boolean isSigned() {
		return isSigned;
	}
	public void setSigned(boolean isSigned) {
		this.isSigned = isSigned;
	}
	public Problem(int id, String detail, int idCustomer, boolean isSigned) {
		this.id = id;
		this.detail = detail;
		this.idCustomer = idCustomer;
		this.isSigned = isSigned;
	}
	public Problem() {
		
	}
	
	
}
