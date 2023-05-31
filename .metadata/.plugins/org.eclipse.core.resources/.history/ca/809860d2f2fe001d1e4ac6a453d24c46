package com.nguyenhuuhongphuc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nguyenhuuhongphuc.bean.Processs;
import com.nguyenhuuhongphuc.dao.ProcesssDAO;

@Service
public class ProcesssService {
	
	@Autowired
	ProcesssDAO processsDAO;
	
	public List<Processs> showProcess(int id){
		return processsDAO.showProcess(id);
	}
}
