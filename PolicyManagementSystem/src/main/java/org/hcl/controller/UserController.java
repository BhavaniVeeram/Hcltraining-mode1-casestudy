package org.hcl.controller;

import javax.validation.Valid;

import org.hcl.entities.User;
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
public class UserController {
	UserService userService;
	public UserController() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	/**
	 * @return the userService
	 */
	public UserService getUserService() {
		return userService;
	}
	/**
	 * @param userService the userService to set
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	// user registration
		@GetMapping("/usersignup")
		public String addUserSignupForm(Model model) {
			User user = new User();
			model.addAttribute(user);
			return "usersignup";
		}

		@PostMapping("/processusersignup")
		public String processUserSignup(@Valid @ModelAttribute("user") User us, BindingResult result, Model model) {
			if(result.hasErrors()) {
				return "usersignup";
			}
			Integer i = userService.insertUser(us);
			String url = null;
			if (i != null) {
				 // if successfully inserted we need to show success msg 
				url = "signupsuccess";
			} else {
				  model.addAttribute("msg", "Details are not Submitted"); 
				  url = "usersignup";
				  }
			return url;
		}
		
		//user login part
		@GetMapping("/userlogin")
		public String addUserLoginForm(Model model) {
			User user = new User();
			model.addAttribute(user);
			return "userlogin";
		}

		@PostMapping("/processuserlogin")
		public String processUserSignup(@RequestParam("userId") Integer userId, @RequestParam("password") String password, Model model) {
			
			User user = new User();
			user.setUserId(userId);
			user.setPassword(password);
			boolean isValid = userService.isValidUser(userId, password);
			String url = null;
			if (isValid) {
				model.addAttribute("msg", "Welcome"+user.getFirstName()+" "+user.getLastName());
				url = "loggeduser";
			} else {
				model.addAttribute("msg", "Details are not Valid"); 
				url = "userlogin";
				  
				  }
			return url;
		}
				
}
