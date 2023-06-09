package com.nguyenhuuhongphuc.controller;

import java.util.List;

//import javax.servlet.http.HttpSession;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nguyenhuuhongphuc.bean.Account;
import com.nguyenhuuhongphuc.bean.Customer;
import com.nguyenhuuhongphuc.service.AccountService;
import com.nguyenhuuhongphuc.service.CustomerService;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class AccountController {

	@Autowired
	AccountService accountService;
	
	@Autowired		
	CustomerService customerService;
	
//	@RequestMapping("login")
//	public String loginMain(@ModelAttribute("account") Account account, Model model) {
//		Account a = accountService.loginAccount2(account.getUserName(), account.getPass());
//		if(account.getUserName().equals(a.getUserName()) && account.getPass().equals(a.getUserName())) {
//			return "admin/index";
//		}
//		else {
//			return"customer/Login";
//		}
//	}
	
	// ---------------------------------------------------------------------------------
	
//	@RequestMapping(value="login")
//	public String index(Model model, HttpSession session, HttpServletRequest request) {
//		Account account = checkCookie(request);
//		if (account != null) {
//			if (accountService.loginAccount(account.getUserName(), account.getPass()) == 1) {
//				session.setAttribute("username", account.getUserName());
//				account = accountService.getAccount(account.getUserName());
//				return "admin/index";
//			} 
//		}
//		return "customer/Login";
//	}
	
	@RequestMapping(value="login", method = RequestMethod.GET)
	public String login(Model model, HttpSession session, HttpServletRequest request) {
		Account account = checkCookie(request);
		if (account == null) {
			model.addAttribute("account", new Account());
			return "customer/Login";
		} else {
			if (accountService.loginAccount(account.getUserName(), account.getPass()) == 1) {
				session.setAttribute("username", account.getUserName());
				account = accountService.getAccount(account.getUserName());
				return "admin/index";
			}
			return "customer/Login";
		}
	}
	
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(@ModelAttribute("account") Account account, Model model, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		if (accountService.loginAccount(account.getUserName(), account.getPass()) == 1) {
			session.setAttribute("username", account.getUserName());
			System.out.println("re: "+session.getAttribute("username"));
//			if (request.getParameter("remember") == null) {
				Cookie ckUsername = new Cookie("username", account.getUserName());
				ckUsername.setMaxAge(3);
				response.addCookie(ckUsername);
			//}
			/* return "redirect:/"; */
				List<Customer> customerList = customerService.getIsNotSignedCustomer();
				model.addAttribute("customerList", customerList);
				return "admin/index";
		} else if (accountService.loginAccount(account.getUserName(), account.getPass()) == -1) {
			System.out.println("sai mk");
			model.addAttribute("error", "Bạn nhập sai mật khẩu.");
		} else {
			System.out.println("ko tt");
			model.addAttribute("error", "Tên tài khoản không tồn tại.");
		}
		model.addAttribute("account", account);
		return "customer/Login";
	}
	
	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public String logout(HttpSession session, HttpServletRequest request, HttpServletResponse response, Model model) {
		session.removeAttribute("username");
		System.out.println("session: "+session.getAttribute("username"));
		model.addAttribute("account", new Account());
		//model.addAttribute(null, );
		
		for (Cookie cookie : request.getCookies()) {
			if (cookie.getName().equalsIgnoreCase("username")) {
				cookie.setMaxAge(0);
				response.addCookie(cookie);
			}
		}
		/* return "redirect:/"; */
		return "customer/Login";
	}
	
	public Account checkCookie(HttpServletRequest request) {
		Account account = null;
		Cookie[] cookies = request.getCookies();
		String username = "";
		
		if (cookies.length != 0) {
			for(Cookie cookie : cookies) {
				if (cookie.getName().equalsIgnoreCase("username")) {
					username = cookie.getValue();
				}
			}
			if(!username.isEmpty()) {
				account = accountService.getAccount(username);
			}
		}
		
		return account;
	}
	
	// ---------------------------------------------------------------------------------

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
	public String schedule(Model model) {
		model.addAttribute("customer", new Customer());
		return "customer/Schedule";
	}

	@RequestMapping("loginPage")
	public String loginPage(Model model) {
		model.addAttribute("account", new Account());
		return "customer/Login";
	}

	@RequestMapping("processPage")
	public String processPage(Model model) {
		model.addAttribute("customer", new Customer());
		return "customer/Process";
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
