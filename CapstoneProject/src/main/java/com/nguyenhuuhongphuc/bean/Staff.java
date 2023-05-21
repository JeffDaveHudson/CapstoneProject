package com.nguyenhuuhongphuc.bean;

public class Staff {
	private int id;
	private String staffName;
	private int salary;
	private int idStaffType;
	private String userName;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getIdStaffType() {
		return idStaffType;
	}

	public void setIdStaffType(int idStaffType) {
		this.idStaffType = idStaffType;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Staff(int id, String staffName, int salary, int idStaffType, String userName) {
		this.id = id;
		this.staffName = staffName;
		this.salary = salary;
		this.idStaffType = idStaffType;
		this.userName = userName;
	}
	
	public Staff() {
		// TODO Auto-generated constructor stub
	}
	
}
