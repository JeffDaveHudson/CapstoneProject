package com.nguyenhuuhongphuc.bean;

public class Customer {
	private int id;
	private String customerName;
	private int phone;
	private String address;
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(int id, String customerName, int phone, String address, String email) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.phone = phone;
		this.address = address;
		this.email = email;
	}
	
	
}
