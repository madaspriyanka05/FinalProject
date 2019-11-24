package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.Interface.NEFTServiceInterface;
import com.lti.entity.Account;
import com.lti.entity.Customer;
import com.lti.entity.Transaction;
import com.lti.service.NEFTservice;

@Controller
public class NEFTcontroller
{
	
	@Autowired
	private NEFTServiceInterface neftServiceInterface;
	
	/*@RequestMapping(path = "f_NEFT.lti", method = RequestMethod.POST)
	public String register(Transaction t)
	{
		neftServiceInterface.deposit(7707, 1212);
		
		return "f_paymentMode.jsp";
		
	}*/
}
