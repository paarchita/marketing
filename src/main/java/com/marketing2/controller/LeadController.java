package com.marketing2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class LeadController {

	
	@RequestMapping("/viewCreate")
	public String viewCreatePage() {
		return "create_lead";
	}
	
}
