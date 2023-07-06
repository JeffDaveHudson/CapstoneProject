package com.nguyenhuuhongphuc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nguyenhuuhongphuc.service.StepProductQuantityService;

@Controller
public class StepProductQuantityController {
	
	@Autowired
	StepProductQuantityService stepProductQuantityService;
	
	
}
