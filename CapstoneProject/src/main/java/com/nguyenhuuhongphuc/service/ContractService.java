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
}
