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
}
