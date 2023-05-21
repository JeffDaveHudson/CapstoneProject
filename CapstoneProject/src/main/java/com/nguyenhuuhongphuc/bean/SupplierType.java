package com.nguyenhuuhongphuc.bean;

public class SupplierType {
	private int id;
	private String supplierType;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSupplierType() {
		return supplierType;
	}
	public void setSupplierType(String supplierType) {
		this.supplierType = supplierType;
	}
	public SupplierType(int id, String supplierType) {
		super();
		this.id = id;
		this.supplierType = supplierType;
	}
	
	public SupplierType() {
		// TODO Auto-generated constructor stub
	}
}
