package com.nguyenhuuhongphuc.bean;

import java.sql.Date;

public class Processs {
	private int id;
	private String detail;
	private Date startDate;
	private Date endDate;
	private int idContract;
	private int idState;
	private int cost;
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getIdState() {
		return idState;
	}
	public void setIdState(int idState) {
		this.idState = idState;
	}
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
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getIdContract() {
		return idContract;
	}
	public void setIdContract(int idContract) {
		this.idContract = idContract;
	}
	public Processs(int id, String detail, Date startDate, Date endDate, int idContract, int idState, int cost) {
		this.id = id;
		this.detail = detail;
		this.startDate = startDate;
		this.endDate = endDate;
		this.idContract = idContract;
		this.idState = idState;
		this.cost = cost;
	}
	
	public Processs() {
		// TODO Auto-generated constructor stub
	}
}
