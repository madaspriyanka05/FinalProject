package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.entity.NetBankAccount;
import com.lti.service.NetBankingService;

@Controller
public class NetBankingController 
{
	@Autowired
	private NetBankingService netBankingService;
	
	@RequestMapping(path = "AddNetBanking.lti", method = RequestMethod.POST)
	public String register(NetBankAccount netbank)
	{
		netBankingService.registerAdd(netbank);
		return "f_IMPS.jsp";
	}

	/*@RequestMapping(path = "login.lti", method = RequestMethod.POST)
	public String login(@RequestParam("username") String username, @RequestParam("password") String password) {

		String role = regservice.checkLogin(username,password);

		System.out.println(role);
		return "Confirm.jsp";

	}*/
	
}
