package com.nguyenhuuhongphuc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nguyenhuuhongphuc.bean.Step;
import com.nguyenhuuhongphuc.bean.StepProductQuantity;
import com.nguyenhuuhongphuc.dao.StepProductQuantityDAO;

@Service
public class StepProductQuantityService {
	
	@Autowired
	StepProductQuantityDAO stepProductQuantityDAO;

	public void createStepProductQuantity(StepProductQuantity stepProductQuantity) {
		stepProductQuantityDAO.createStepProductQuantity(stepProductQuantity);
	}
	
	public List<StepProductQuantity> getStepProductQuantity() {
		return stepProductQuantityDAO.getStepProductQuantity();
	}

	public int getCostProductByIdStep(int idStep) {
		return stepProductQuantityDAO.getCostProductByIdStep(idStep);
	}

	public void removeStepProductQuantity(int idStep) {
		stepProductQuantityDAO.removeStepProductQuantity(idStep);
	}

	public void updateStepProductQuantityCost(StepProductQuantity stepProductQuantity, int staticOldStepProductQuantityCost) {
		stepProductQuantityDAO.updateStepProductQuantityCost(stepProductQuantity, staticOldStepProductQuantityCost);
	}

	public void removeStepProductQuantityByIdStep(int idStep) {
		stepProductQuantityDAO.removeStepProductQuantityByIdStep(idStep);
	}

}
