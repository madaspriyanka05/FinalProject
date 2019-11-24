package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.Interface.CustomerServiceInterface;
import com.lti.entity.Customer;
import com.lti.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerServiceInterface customerServiceInterface;
	
	@RequestMapping(path = "register.lti", method = RequestMethod.POST)
	public String register(Customer cust)
	{
		customerServiceInterface.register(cust);
		
		return "index.jsp";
	}

	@RequestMapping(path = "login.lti", method = RequestMethod.POST)
	public String login(@RequestParam("emialId") String username, @RequestParam("password") String password) {

		boolean i= customerServiceInterface.checkLogin(username,password);
		if(i)
		{
			return "index.jsp";
		}
		else
		{
			return null;
		}
		
	}
	
}
