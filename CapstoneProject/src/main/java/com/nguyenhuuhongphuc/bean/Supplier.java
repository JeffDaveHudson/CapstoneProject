package com.nguyenhuuhongphuc.bean;

public class Supplier {
	private int id;
	private String supplierName;
	private int idSupplierType;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public int getIdSupplierType() {
		return idSupplierType;
	}
	public void setIdSupplierType(int idSupplierType) {
		this.idSupplierType = idSupplierType;
	}
	public Supplier(int id, String supplierName, int idSupplierType) {
		this.id = id;
		this.supplierName = supplierName;
		this.idSupplierType = idSupplierType;
	}
	
	public Supplier() {
		// TODO Auto-generated constructor stub
	}
}
