package com.nguyenhuuhongphuc.bean;

import java.sql.Date;

public class Bill {
	private int id;
	private String billName;
	private int idSupplier;
	private int idStaff;
	private int total;
	private Date dateTransfer;
	
	public Date getDateTransfer() {
		return dateTransfer;
	}
	public void setDateTransfer(Date dateTransfer) {
		this.dateTransfer = dateTransfer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBillName() {
		return billName;
	}
	public void setBillName(String billName) {
		this.billName = billName;
	}
	public int getIdSupplier() {
		return idSupplier;
	}
	public void setIdSupplier(int idSupplier) {
		this.idSupplier = idSupplier;
	}
	public int getIdStaff() {
		return idStaff;
	}
	public void setIdStaff(int idStaff) {
		this.idStaff = idStaff;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public Bill(int id, String billName, int idSupplier, int idStaff, int total) {
		this.id = id;
		this.billName = billName;
		this.idSupplier = idSupplier;
		this.idStaff = idStaff;
		this.total = total;
	}
	
	public Bill(int id, String billName, int idSupplier, int idStaff, int total, Date dateTransfer) {
		super();
		this.id = id;
		this.billName = billName;
		this.idSupplier = idSupplier;
		this.idStaff = idStaff;
		this.total = total;
		this.dateTransfer = dateTransfer;
	}
	public Bill() {
		// TODO Auto-generated constructor stub
	}
}
