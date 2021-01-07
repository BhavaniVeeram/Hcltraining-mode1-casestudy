package org.hcl.controller;

import javax.validation.Valid;

import org.hcl.entities.Admin;
import org.hcl.entities.User;
import org.hcl.services.AdminService;
import org.hcl.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {
	private AdminService adminService;
	
	public AdminController() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public AdminController(AdminService adminService) {
		super();
		this.adminService = adminService;
	}

	@GetMapping(value = {"/", "/home"})
	public String showHome() {
		return "home";
	}
	@GetMapping("/logout")
	public String Home() {
		return "home";
	}
	//admin registration
	@GetMapping("/adminsignup")
	public String addAdminSignupForm(Model model) {
		Admin admin = new Admin();
		model.addAttribute(admin);
		return "adminsignup";
	}

	@PostMapping("/processadminsignup")
	public String processAdminSignup(@Valid @ModelAttribute("admin") Admin ad, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "adminsignup";
		}
		Integer i = adminService.insertAdmin(ad);
		String url = null;
		if (i != null) {
			 // if successfully inserted we need to show success msg 
			url = "signupsuccess";
		} else {
			  model.addAttribute("msg", "Details are not Submitted"); 
			  url = "adminsignup";
			  }
		return url;
	}
	
	//admin login part
	@GetMapping("/adminlogin")
	public String addAdminLoginForm(Model model) {
		Admin admin = new Admin();
		model.addAttribute(admin);
		return "adminlogin";
	}

	@PostMapping("/processadminlogin")
	public String processAdminSignup(@RequestParam("vendorId") Integer vendorId, @RequestParam("password") String password, Model model) {
		
		Admin admin = new Admin();
		admin.setVendorId(vendorId);
		admin.setPassword(password);
		boolean isValid = adminService.isValidAdmin(vendorId, password);
		String url = null;
		if (isValid) {
			model.addAttribute("msg", "Welcome");
			url = "loggedadmin";
		} else {
			model.addAttribute("msg", "Details are not Valid"); 
			url = "adminlogin";
			  
			  }
		return url;
	}
	
	
}
