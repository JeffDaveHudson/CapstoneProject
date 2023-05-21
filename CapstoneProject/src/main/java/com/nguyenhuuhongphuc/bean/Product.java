package com.nguyenhuuhongphuc.bean;

public class Product {
	private int id;
	private String productName;
	private int idProductType;
	private int idSupplier;
	private int price;
	private int idProductInventory;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getIdProductType() {
		return idProductType;
	}
	public void setIdProductType(int idProductType) {
		this.idProductType = idProductType;
	}
	public int getIdSupplier() {
		return idSupplier;
	}
	public void setIdSupplier(int idSupplier) {
		this.idSupplier = idSupplier;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getIdProductInventory() {
		return idProductInventory;
	}
	public void setIdProductInventory(int idProductInventory) {
		this.idProductInventory = idProductInventory;
	}
	public Product(int id, String productName, int idProductType, int idSupplier, int price, int idProductInventory) {
		this.id = id;
		this.productName = productName;
		this.idProductType = idProductType;
		this.idSupplier = idSupplier;
		this.price = price;
		this.idProductInventory = idProductInventory;
	}
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
}
