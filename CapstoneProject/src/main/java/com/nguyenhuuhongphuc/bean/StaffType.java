package com.nguyenhuuhongphuc.bean;

public class StaffType {
	private int id;
	private String staffType;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStaffType() {
		return staffType;
	}
	public void setStaffType(String staffType) {
		this.staffType = staffType;
	}
	public StaffType(int id, String staffType) {
		super();
		this.id = id;
		this.staffType = staffType;
	}
	
	public StaffType() {
		// TODO Auto-generated constructor stub
	}
}
