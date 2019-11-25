package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.Interface.NetBankingServiceInterface;
import com.lti.entity.NetBankAccount;
import com.lti.service.NetBankingService;

@Controller
public class NetBankingController 
{
	@Autowired
	private NetBankingServiceInterface netBankingServiceInterface;
	
	@RequestMapping(path = "f_AddNetBankingAcc.lti", method = RequestMethod.POST)
	public String register(NetBankAccount netbank)
	{
		netBankingServiceInterface.registerAdd(netbank);
		return "f_paymentMode.jsp";
	}

	@RequestMapping(path = "f_NetBankingLogin.lti", method = RequestMethod.POST)
	public String login(@RequestParam("username") String username, @RequestParam("password") String password)
	{

		/*String role = netBankingService.checkLogin(username,password);

		System.out.println(role);
		return "Confirm.jsp";*/
		
		boolean i= netBankingServiceInterface.checkLogin(username,password);
		if(i)
		{
			return "f_Index.jsp";
		}
		else
		{
			return null;
		}

	}
	
}
