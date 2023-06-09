package com.nguyenhuuhongphuc.bean;

import java.util.Date;

public class BillDetail {
	private int id;
	private int idProduct;
	private int idBill;
	private int price;
	private int quantity;
	private Date transferDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}
	public int getIdBill() {
		return idBill;
	}
	public void setIdBill(int idBill) {
		this.idBill = idBill;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Date getTransferDate() {
		return transferDate;
	}
	public void setTransferDate(Date transferDate) {
		this.transferDate = transferDate;
	}
	public BillDetail(int id, int idProduct, int idBill, int price, int quantity, Date transferDate) {
		this.id = id;
		this.idProduct = idProduct;
		this.idBill = idBill;
		this.price = price;
		this.quantity = quantity;
		this.transferDate = transferDate;
	}
	
	public BillDetail() {
		// TODO Auto-generated constructor stub
	}
}
