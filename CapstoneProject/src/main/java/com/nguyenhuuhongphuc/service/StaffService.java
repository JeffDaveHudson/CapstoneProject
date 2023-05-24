package com.nguyenhuuhongphuc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nguyenhuuhongphuc.bean.Staff;
import com.nguyenhuuhongphuc.bean.StaffType;
import com.nguyenhuuhongphuc.dao.StaffDAO;

@Service
public class StaffService {
	
	@Autowired
	StaffDAO staffDAO;
	
	public List<Staff> getStaffList(){
		return staffDAO.getStaffList();
	}
	
	public List<StaffType> getStaffTypeList(){
		return staffDAO.getStaffTypeList();
	}
	
	public List<Staff> getStaffSearch(String searchString){
		return staffDAO.getStaffSearch(searchString);
	}
	
	public List<Staff> getStaffByIdStaffType(int idStaffType){
		return staffDAO.getStaffByIdStaffType(idStaffType);
	}

	public void createStaff(Staff staff) {
		staffDAO.createStaff(staff);
	}

	public List<Staff> getStaffById(int id) {
		return staffDAO.getStaffById(id);
	}

	public void updateStaff(Staff staff) {
		staffDAO.updateStaff(staff);
		
	}

	public void deleteStaff(int id) {
		staffDAO.deleteStaff(id);
		
	}
	
	public Staff getStaffById1Row(int id) {
		return staffDAO.getStaffById1Row(id);
	}
}