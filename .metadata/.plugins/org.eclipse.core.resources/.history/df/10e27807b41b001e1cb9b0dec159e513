package com.nguyenhuuhongphuc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nguyenhuuhongphuc.bean.Cost;
import com.nguyenhuuhongphuc.bean.Processs;
import com.nguyenhuuhongphuc.dao.ProcesssDAO;

@Service
public class ProcesssService {
	
	@Autowired
	ProcesssDAO processsDAO;
	
	public List<Processs> showProcess(int id){
		return processsDAO.showProcess(id);
	}

	public void createNewProcess(Processs processs) {
		processsDAO.createNewProcess(processs);
	}

	public void removeProcess(int id) {
		processsDAO.removeProcess(id);
	}
	
	public List<Processs> getProcessById(int id){
		return processsDAO.getProcessById(id);
	}

	public void updateProcess(Processs processs) {
		processsDAO.updateProcess(processs);
	}

	public void removeProcessWhenRemovingContract(int id) {
		processsDAO.removeProcessWhenRemovingContract(id);
	}
	
//	public List<Cost> getProcessCost(int idProcess){
//		return processsDAO.getProcessCost(idProcess);
//	}
	
	public int getProcessCost(int idProcess) {
		return processsDAO.getProcessCost(idProcess);
	}

	public void updateProcessCost(int cost, int idProcess) {
		processsDAO.updateProcessCost(cost, idProcess);
	}

	public void updateProcessCostWhenRemovingStep(int cost, int staticIdProcess) {
		processsDAO.updateProcessCostWhenRemovingStep(cost, staticIdProcess);
	}

	public void updateCostWhenUpdatingStep(int staticOldStepCost, int newCost, int staticIdProcess) {
		processsDAO.updateCostWhenUpdatingStep (staticOldStepCost, newCost, staticIdProcess);
	}
}
