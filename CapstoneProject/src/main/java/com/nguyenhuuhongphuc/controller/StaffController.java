package com.nguyenhuuhongphuc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nguyenhuuhongphuc.bean.Staff;
import com.nguyenhuuhongphuc.bean.StaffType;
import com.nguyenhuuhongphuc.service.AccountService;
import com.nguyenhuuhongphuc.service.StaffService;

@Controller
public class StaffController {
	
	@Autowired
	StaffService staffService;
	
	@Autowired
	AccountService accountService;
	
	@GetMapping("stafflist")
	public String showStaffList(Model model) {
		List<Staff> staffList = staffService.getStaffList();
		List<StaffType> staffTypeList = staffService.getStaffTypeList();
//		for (Staff staff : staffList) {
//			System.out.println(staff.getId()+" - "+staff.getStaffName()+" - "+staff.getSalary()+" - "+staff.getIdStaffType()+" - "+staff.getUserName());
//		}
//		for (StaffType staffType : staffTypeList) {
//			System.out.println(staffType.getId()+"==="+staffType.getStaffType());
//		}
		model.addAttribute("staffList", staffList);
		model.addAttribute("staffTypeList", staffTypeList);
		
		return "admin/Staff";
	}
	
	@PostMapping("staffsearch")
	public String showStaffSearch(Model model, @RequestParam("searchString") String searchString) {
		List<Staff> staffSeach = staffService.getStaffSearch(searchString);
		List<StaffType> staffTypeList = staffService.getStaffTypeList();
		model.addAttribute("staffList", staffSeach);
		model.addAttribute("staffTypeList", staffTypeList);
		return "admin/Staff";
	}
	
	@PostMapping("staffbydepartment")
	public String processStaffByDepartment(Model model, @RequestParam("staffTypeClicked") String staffTypeClicked) {
		int idStaffType = Integer.parseInt(staffTypeClicked);
//		System.out.println("lllll: "+idStaffType);		
		List<Staff> staffList = staffService.getStaffByIdStaffType(idStaffType);
		List<StaffType> staffTypeList = staffService.getStaffTypeList();
		model.addAttribute("staffList", staffList);
		model.addAttribute("staffTypeList", staffTypeList);
		return "admin/Staff";
	}
	
	@RequestMapping("staffcreateform")
	public String showStaffCreateForm(Model model) {
		System.out.println("!!!!!!!!!!!!!");
		List<StaffType> staffTypeList = staffService.getStaffTypeList();
//		List<StaffType> staffTypeNameList = new ArrayList<StaffType>();
//		for (StaffType staffType : staffTypeList) {
//			staffTypeNameList.add(staffType.getStaffType());
//			System.out.println(staffType.getStaffType());
//		}
		model.addAttribute("staffTypeList",staffTypeList);
		model.addAttribute("staff", new Staff());
		return "admin/StaffCreate";
	}
	
	@PostMapping("staffcreate")
	public String processStaffCreate(Model model, @ModelAttribute("staff") Staff staff, @RequestParam("staffTypeClicked") String staffTypeClicked) {
		int idStaffType = Integer.parseInt(staffTypeClicked);
		staff.setIdStaffType(idStaffType);
//		System.out.println("---------------------");
//		System.out.println(staff.getUserName());
		accountService.createAccountThroughAddNewStaff(staff.getUserName());
		//contractService.createContract();
		//List<Contracts> contractList = contractService.getTheLastContract();
		//staff.setIdContract(contractList.get(0).getId());
		//System.out.println(staff.getStaffName()+"-"+staff.getSalary()+"-"+staff.getIdStaffType()+"-"+staff.getUserName());
		staffService.createStaff(staff);
		
		return "redirect:/stafflist";
		
	}
	
	@GetMapping( value =  "staffupdateform")
	public String showStaffUpdate(@RequestParam("id") int id, Model model) {
		//System.out.println("update: "+id);
		List<Staff> staffById = staffService.getStaffById(id);
		List<StaffType> staffTypeList = staffService.getStaffTypeList();
		model.addAttribute("staffList",staffById);
		model.addAttribute("staffTypeList", staffTypeList);
		model.addAttribute("staffupdate", new Staff());
		return "admin/StaffUpdate";
	}
	
	@PostMapping("processupdatestaff")
	public String processUpdateStaff(Model model, @ModelAttribute("staffupdate") Staff staff, @RequestParam("staffTypeClicked") String staffTypeClicked) {
		staff.setIdStaffType(Integer.parseInt(staffTypeClicked));
		staffService.updateStaff(staff);
		return "redirect:/stafflist";
	}
	
	@GetMapping(value = "staffdelete")
	public String deleteStaff(@RequestParam("id") int id) {
		//System.out.println("delete: "+id);
		
		List<Staff> staffList = staffService.getStaffById(id);
		Staff staff = new Staff();
		for (Staff stafflist : staffList) {
			staff.setUserName(stafflist.getUserName());
		}
		//System.out.println("getUsername: "+staff.getUserName());
		staffService.deleteStaff(id);
		accountService.deleteAccountThroughDeleteStaff(staff.getUserName());
		return "redirect:/stafflist";
	}
}
