package com.nguyenhuuhongphuc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nguyenhuuhongphuc.bean.Step;
import com.nguyenhuuhongphuc.dao.StepDAO;

@Service
public class StepService {
	
	@Autowired
	StepDAO stepDAO;
	
	public List<Step> getStepList() {
		return stepDAO.getStepList();
	}

	public List<Step> getStepByIdProcess(int idProcess) {
		return stepDAO.getStepByIdProcess(idProcess);
	}

	public void createStep(Step step) {
		stepDAO.createStep(step);
	}

	public void removeStep(int idStep) {
		stepDAO.removeStep(idStep);
	}

	public int getCostByIdStep(int idStep) {
		return stepDAO.getCostByIdStep(idStep);
	}
}
