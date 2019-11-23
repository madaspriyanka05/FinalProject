package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.entity.Customer;
import com.lti.entity.Transaction;
import com.lti.service.NEFTservice;

@Controller
public class NEFTcontroller 
{
	
	@Autowired
	private NEFTservice neftservice;
	
	@RequestMapping(path = "neft.lti", method = RequestMethod.POST)
	public String register(Transaction t)
	{
		neftservice.deposit(7707, 10008);
		
		return "f_paymentMode.jsp";
		
	}

}
