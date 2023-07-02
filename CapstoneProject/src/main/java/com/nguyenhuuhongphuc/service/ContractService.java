package com.nguyenhuuhongphuc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nguyenhuuhongphuc.bean.Contract;
import com.nguyenhuuhongphuc.dao.ContractDAO;

@Service
public class ContractService {
	
	@Autowired
	ContractDAO contractDAO;
	
	public List<Contract> getContract() {
		return contractDAO.getContract();
	}
	
	public List<Contract> getContractBySearch(String searchString){
		return contractDAO.getContractBySearch(searchString);
	}
	
	public List<Contract> getContractById(int id) {
		return contractDAO.getContractById(id);
	}

	public void removeContract(int id) {
		contractDAO.removeContract(id);
	}

	public void updateContract(Contract contract) {
		contractDAO.updateContract(contract);
	}

	public void createContract(Contract contract) {
		contractDAO.createContract(contract);
	}
	
	public List<Contract> getCustomerContract(int searchString) {
		return contractDAO.getCustomerContract(searchString);
	}

	public int getTotalRevenueByMonth(String year, String month) {
		return contractDAO.getTotalRevenueByMonth(year, month);
	}

	public int getRevenueBetween2Time(String startDate, String endDate) {
		return contractDAO.getRevenueBetween2Times(startDate, endDate);
	}

	public int getTotalRevenueByQuarter1(String year) {
		return contractDAO.getTotalRevenueByQuarter1(year);
	}
	
	public int getTotalRevenueByQuarter2(String year) {
		return contractDAO.getTotalRevenueByQuarter2(year);
	}
	
	public int getTotalRevenueByQuarter3(String year) {
		return contractDAO.getTotalRevenueByQuarter3(year);
	}
	
	public int getTotalRevenueByQuarter4(String year) {
		return contractDAO.getTotalRevenueByQuarter4(year);
	}

	public List<Contract> getRevenueDetailByCurrentMonth(String year, String month) {
		return contractDAO.getRevenueDetailByCurrentMonth(year, month);
	}

	public List<Contract> getRevenueDetailByQuarter1(String year) {
		return contractDAO.getRevenueDetailByQuarter1(year);
	}

	public List<Contract> getRevenueDetailByQuarter2(String year) {
		return contractDAO.getRevenueDetailByQuarter2(year);
	}
	
	public List<Contract> getRevenueDetailByQuarter3(String year) {
		return contractDAO.getRevenueDetailByQuarter3(year);
	}
	
	public List<Contract> getRevenueDetailByQuarter4(String year) {
		return contractDAO.getRevenueDetailByQuarter4(year);
	}

	public List<Contract> getRevenueDetailBetween2Times(String startDate, String endDate) {
		return contractDAO.getRevenueDetailBetween2Times(startDate, endDate);
	}
	
	public int getIdContractByIdProcess(int idProcess) {
		return contractDAO.getIdContractByIdProcess(idProcess);
	}

	public void updatePrice(int cost, int idProcess) {
		contractDAO.updatePrice(cost, idProcess);
	}

	public void updateContractPriceWhenRemovingStep(int cost, int staticIdContract) {
		contractDAO.updateContractPriceWhenRemovingStep(cost, staticIdContract);
	}
}
