package org.hcl.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.hcl.entities.Admin;
import org.hcl.entities.Policy;
import org.hcl.services.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PolicyController {
	private PolicyService policyService;
	public PolicyController() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
	public PolicyController(PolicyService policyService) {
		super();
		this.policyService = policyService;
	}
	/**
	 * @return the policyService
	 */
	public PolicyService getPolicyService() {
		return policyService;
	}
	/**
	 * @param policyService the policyService to set
	 */
	public void setPolicyService(PolicyService policyService) {
		this.policyService = policyService;
	}
	//policy creation
		@GetMapping("/createpolicy")
		public String addCreatePolicyForm(Model model) {
			Policy policy = new Policy();
			model.addAttribute(policy);
			return "createpolicy";
		}

		@PostMapping("/processcreatepolicy")
		public String processCreatePolicy(@ModelAttribute("policy") Policy policy, Model model) {
			
			Integer i = policyService.createPolicy(policy);
			String url = null;
			if (i != null) {
				 // if successfully inserted we need to show success policy id 
				model.addAttribute("msg", "The Policy Id is "+policy.getPolicyId());
				url = "loggedadmin";
			} else {
				  model.addAttribute("msg", "Policy is not created"); 
				  url = "loggedadmin";
				  }
			return url;
		}
		// to navigate to edit policy page
		@GetMapping("/editpolicy")
		public String display(Model model) {
			List<Policy> p = policyService.getPolicies();
			model.addAttribute("policies", p);
			return "editpolicy";
		}
		// to navigate to edit form of the policy page
		@RequestMapping(value="/edit", method = RequestMethod.GET)
		public ModelAndView editPolicy(HttpServletRequest request) {
			Integer policyId = Integer.parseInt(request.getParameter("policyId"));
			Policy policy = policyService.getPolicyId(policyId);
			ModelAndView model = new ModelAndView("editpolicyform");
			model.addObject("policy", policy);
			return model;
		}
		@RequestMapping(value="/processeditpolicy", method = RequestMethod.POST)
		public ModelAndView processEditPolicy(@ModelAttribute("policy") Policy policy) {
			policyService.updatePolicy(policy);
			ModelAndView model = new ModelAndView("redirect:/editpolicy");
			return model;
		}
		
		//to search 
		@RequestMapping(value = "/searchpolicy")
		public String searchPolicy(Model model, HttpSession session, @RequestParam("freetext") String freetext) {
			//Integer policyId = (Integer) session.getAttribute("policyId");
			model.addAttribute("policy", policyService.findPolicy(freetext));
			return "displaysearchedpolicies";
		}
		
		
}
