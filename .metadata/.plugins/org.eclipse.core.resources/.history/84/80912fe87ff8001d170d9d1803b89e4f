package com.nguyenhuuhongphuc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nguyenhuuhongphuc.bean.Bill;
import com.nguyenhuuhongphuc.dao.BillDAO;

@Service
public class BillService {
	
	@Autowired
	BillDAO billDAO;
	
	public List<Bill> getBillList(){
		
		List<Bill> billList = billDAO.getBillList();
		
		return billList;
	}

}
