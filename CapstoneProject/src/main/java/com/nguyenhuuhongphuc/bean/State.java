package com.nguyenhuuhongphuc.bean;

public class State {
	private int id;
	private String detail;
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
	public State(int id, String detail) {
		this.id = id;
		this.detail = detail;
	}
	
	public State() {
	}
}
