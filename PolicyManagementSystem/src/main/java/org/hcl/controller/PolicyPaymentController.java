package org.hcl.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hcl.entities.PolicyPayment;
import org.hcl.services.PolicyPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PolicyPaymentController {
	PolicyPaymentService service;

	public PolicyPaymentController() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public PolicyPaymentController(PolicyPaymentService service) {
		super();
		this.service = service;
	}

	/**
	 * @return the service
	 */
	public PolicyPaymentService getService() {
		return service;
	}

	/**
	 * @param service the service to set
	 */
	public void setService(PolicyPaymentService service) {
		this.service = service;
	}
	//to pay
	@GetMapping("/paypolicy")
			public String displaypolicies(Model model) {
				List<PolicyPayment> p = service.getPolicies();
				model.addAttribute("policies", p);
				return "paypoliciespage";
			}

	@RequestMapping(value = "/pay", method = RequestMethod.GET)
	public String displaypolicies(HttpServletRequest request, Model model) {
		Integer policyId = Integer.parseInt(request.getParameter("policyId"));
		PolicyPayment policy = service.getPolicyId(policyId);
		model.addAttribute("policy", policy);
		return "paymentform";
	}
	@GetMapping("/proceedpayment")
	public String showPaymentForm(@RequestParam("policyId") Integer policyId, Model model) {
		model.addAttribute("policyId", policyId);
		return "paymentform";
	}
	@PostMapping("/upi")
	public String showUpi(@RequestParam("policyId") Integer policyId, Model model) {

		model.addAttribute("policyId", policyId);
		return "upiform";
	}
	@PostMapping("/netbanking")
	public String showNetbanking(@RequestParam("policyId") Integer policyId, Model model) {
		
		model.addAttribute("policyId", policyId);
		return "netbankingform";
	}
	@PostMapping("/debitcard")
	public String showDebitcard(@RequestParam("policyId") Integer policyId, Model model) {
		model.addAttribute("policyId", policyId);
		return "debitcardform";
	}
	@PostMapping("/creditcard")
	public String showCreditcard(@RequestParam("policyId") Integer policyId, Model model) {
		model.addAttribute("policyId", policyId);
		return "creditcardform";
	}
	@PostMapping("/continue")
	public String showContinue(@RequestParam("policyId") Integer policyId, Model model) {

		boolean value = service.update(policyId);
		if(value)
		return "continue";
		return "paymentform";
	}
}
