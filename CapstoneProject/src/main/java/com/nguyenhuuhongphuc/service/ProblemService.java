package com.nguyenhuuhongphuc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nguyenhuuhongphuc.bean.Problem;
import com.nguyenhuuhongphuc.dao.ProblemDAO;

@Service
public class ProblemService {
	
	@Autowired
	ProblemDAO problemDAO;
	
	public void createProblem(Problem problem) {
		problemDAO.createProblem(problem);
	}
	
	public List<Problem> getProblemIsNotSigned(){
		return problemDAO.getProblemIsNotSigned();
	}

	public List<Problem> getProblemByIdCustomer(int id) {
		return problemDAO.getProblemByIdCustomer(id);
	}
}
