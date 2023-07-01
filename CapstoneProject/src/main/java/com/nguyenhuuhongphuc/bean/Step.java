package com.nguyenhuuhongphuc.bean;

public class Step {
	private int id;
	private String detail;
	private int idProcess;
	private int idProduct;
	private int cost;
	private int idState;
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
	public int getIdProcess() {
		return idProcess;
	}
	public void setIdProcess(int idProcess) {
		this.idProcess = idProcess;
	}
	public int getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}
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
	public Step(int id, String detail, int idProcess, int idProduct, int cost, int idState) {
		this.id = id;
		this.detail = detail;
		this.idProcess = idProcess;
		this.idProduct = idProduct;
		this.cost = cost;
		this.idState = idState;
	}
	
	public Step() {
		// TODO Auto-generated constructor stub
	}
}
