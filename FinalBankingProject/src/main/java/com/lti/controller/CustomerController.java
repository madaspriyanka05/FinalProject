package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.entity.Customer;
import com.lti.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(path = "register.lti", method = RequestMethod.POST)
	public String register(Customer cust)
	{
		customerService.register(cust);
		
		return "index.jsp";
}

	@RequestMapping(path = "register.lti", method = RequestMethod.POST)
	public String login(@RequestParam("username") String username, @RequestParam("password") String password) {

		String role = customerService.checkLogin(username,password);

		System.out.println(role);
		return "index.jsp";

	}
	
}
