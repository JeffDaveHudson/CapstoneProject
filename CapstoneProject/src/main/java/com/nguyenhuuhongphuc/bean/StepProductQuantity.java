package com.nguyenhuuhongphuc.bean;

public class StepProductQuantity {
	private int id;
	private int quantity;
	private int idStep;
	private int cost;
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
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
	public int getIdStep() {
		return idStep;
	}
	public void setIdStep(int idStep) {
		this.idStep = idStep;
	}
	public StepProductQuantity(int id, int quantity, int idStep, int cost) {
		this.id = id;
		this.quantity = quantity;
		this.idStep = idStep;
		this.cost = cost;
	}
	
	public StepProductQuantity() {
		// TODO Auto-generated constructor stub
	}
}
