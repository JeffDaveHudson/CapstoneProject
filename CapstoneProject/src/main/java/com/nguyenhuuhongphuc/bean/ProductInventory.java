package com.nguyenhuuhongphuc.bean;

public class ProductInventory {
	private int id;
	private int quantity;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public ProductInventory(int id, int quantity) {
		this.id = id;
		this.quantity = quantity;
	}
	
	public ProductInventory() {
		// TODO Auto-generated constructor stub
	}
}
