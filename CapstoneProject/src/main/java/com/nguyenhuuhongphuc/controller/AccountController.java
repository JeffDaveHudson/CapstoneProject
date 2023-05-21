package com.nguyenhuuhongphuc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nguyenhuuhongphuc.bean.Account;
import com.nguyenhuuhongphuc.service.AccountService;

@Controller
public class AccountController {
	
	@Autowired
	AccountService accountService;
	
	@RequestMapping("login")
	public String loginMain(@ModelAttribute("account") Account account, Model model) {
		Account a = accountService.getAccount(account.getUserName());
		if(account.getUserName().equals(a.getUserName()) && account.getPass().equals(a.getUserName())) {
			return "admin/index";
		}
		else {
			return"customer/Login";
		}
	}
	
	@RequestMapping("home")
	public String home() {
		return "admin/index";
	}
	
	@RequestMapping("/")
	public String index() {
		return "customer/homepage";
	}
	
	@RequestMapping("homepage")
	public String index2() {
		return "customer/homepage";
	}
	
	@RequestMapping("information")
	public String information() {
		return "customer/Information";
	}
	
	@RequestMapping("control")
	public String control() {
		return "customer/Control";
	}
	
	@RequestMapping("schedule")
	public String schedule() {
		return "customer/Schedule";
	}
	
	@RequestMapping("loginPage")
	public String loginPage(Model model) {
		model.addAttribute("account", new Account());
		return "customer/Login";
	}
	
//	-----------------------------------------------------information detail------------------------------------------------
	
	@RequestMapping("informationdragonfly")
	public String informationDragonfly() {
		return "customer/InformationDragonfly";
	}
	
	@RequestMapping("informationant")
	public String informationAnt() {
		return "customer/InformationAnt";
	}
	
	@RequestMapping("informationmouse")
	public String informationMouse() {
		return "customer/InformationMouse";
	}
	
	@RequestMapping("informationcockroach")
	public String informationCockroach() {
		return "customer/InformationCockroach";
	}
	
	@RequestMapping("informationfly")
	public String informationFly() {
		return "customer/InformationFly";
	}
	
	@RequestMapping("informationmosquito")
	public String informationMosquito() {
		return "customer/InformationMosquito";
	}
	
	@RequestMapping("informationgrasshopper")
	public String informationGrasshopper() {
		return "customer/InformationGrasshopper";
	}
	
	@RequestMapping("informationbee")
	public String informationBee() {
		return "customer/InformationBee";
	}
	
	@RequestMapping("informationcricket")
	public String informationCricket() {
		return "customer/InformationCricket";
	}
	
	@RequestMapping("informationspider")
	public String informationSpider() {
		return "customer/InformationSpider";
	}
	
	@RequestMapping("informationsnake")
	public String informationSnake() {
		return "customer/InformationSnake";
	}
	
	@RequestMapping("informationtermite")
	public String informationTermite() {
		return "customer/InformationTermite";
	}
	
	@RequestMapping("informationwoodborer")
	public String informationWoodborer() {
		return "customer/InformationWoodborer";
	}
	
	@RequestMapping("informationbug")
	public String informationBug() {
		return "customer/InformationBug";
	}
	
	@RequestMapping("informationflea")
	public String informationFlea() {
		return "customer/InformationFlea";
	}
	
//	-----------------------------------------------------Control detail------------------------------------------------
	
	@RequestMapping("controldragonfly")
	public String controlDragonfly() {
		return "customer/ControlDragonfly";
	}
	
	@RequestMapping("controlant")
	public String controlAnt() {
		return "customer/ControlAnt";
	}
	
	@RequestMapping("controlmouse")
	public String controlMouse() {
		return "customer/ControlMouse";
	}
	
	@RequestMapping("controlcockroach")
	public String controlCockroach() {
		return "customer/ControlCockroach";
	}
	
	@RequestMapping("controlfly")
	public String controlFly() {
		return "customer/ControlFly";
	}
	
	@RequestMapping("controlmosquito")
	public String controlMosquito() {
		return "customer/ControlMosquito";
	}
	
	@RequestMapping("controlgrasshopper")
	public String controlGrasshopper() {
		return "customer/ControlGrasshopper";
	}
	
	@RequestMapping("controlbee")
	public String controlBee() {
		return "customer/ControlBee";
	}
	
	@RequestMapping("controlcricket")
	public String controlCricket() {
		return "customer/ControlCricket";
	}
	
	@RequestMapping("controlspider")
	public String controlSpider() {
		return "customer/ControlSpider";
	}
	
	@RequestMapping("controlsnake")
	public String controlSnake() {
		return "customer/ControlSnake";
	}
	
	@RequestMapping("controltermite")
	public String controlTermite() {
		return "customer/ControlTermite";
	}
	
	@RequestMapping("controlwoodborer")
	public String controlWoodborer() {
		return "customer/ControlWoodborder";
	}
	
	@RequestMapping("controlbug")
	public String controlBug() {
		return "customer/ControlBug";
	}
	
	@RequestMapping("controlflea")
	public String controlFlea() {
		return "customer/ControlFlea";
	}
	
}
