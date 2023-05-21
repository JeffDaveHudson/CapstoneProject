package com.nguyenhuuhongphuc.bean;

public class ProductType {
	private int id;
	private String productType;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public ProductType(int id, String productType) {
		this.id = id;
		this.productType = productType;
	}
	
	public ProductType() {
		// TODO Auto-generated constructor stub
	}
}
