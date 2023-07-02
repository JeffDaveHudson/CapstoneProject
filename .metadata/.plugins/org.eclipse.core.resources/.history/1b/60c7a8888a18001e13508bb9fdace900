package com.nguyenhuuhongphuc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nguyenhuuhongphuc.bean.State;
import com.nguyenhuuhongphuc.dao.StateDAO;

@Service
public class StateService {
	
	@Autowired
	StateDAO stateDAO;
	
	public List<State> getStateList(){
		return stateDAO.getStateList();
	}
}
