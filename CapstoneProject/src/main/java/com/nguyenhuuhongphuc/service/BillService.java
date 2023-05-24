package com.nguyenhuuhongphuc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nguyenhuuhongphuc.bean.Bill;
import com.nguyenhuuhongphuc.bean.BillDetail;
import com.nguyenhuuhongphuc.dao.BillDAO;

@Service
public class BillService {
	
	@Autowired
	BillDAO billDAO;
	
	public List<Bill> getBillList(){
		return billDAO.getBillList(); 
	}
	
	public List<Bill> getBillSearch(String searchString){
		return billDAO.getBillSearch(searchString);
	}

	public void createNewBill(Bill bill) {
		billDAO.createNewBill(bill);
		
	}
	
	public List<Bill> getTheLastestBill(){
		return billDAO.getTheLastestBill();
	}

	public void createNewBillDetail(BillDetail billDetail) {
		billDAO.createNewBillDetail(billDetail);
		
	}
	
	public List<BillDetail> getBillDetail() {
		return billDAO.getBillDetail();
	}
	
	public List<BillDetail> getBillDetailWhenCreating(int idBill) {
		return billDAO.getBillDetailWhenCreating(idBill);
	}

	public List<Bill> getTotalInBill(int idBill) {
		return billDAO.getTotalInBill(idBill);
	}
	
	public void updateProductStock(int newQuantity, int idProduct) {
		billDAO.updateProductStock(newQuantity, idProduct);
	}
}