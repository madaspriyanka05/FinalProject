package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

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
		return password;/*

		try {
			Registration login = loginservice.checkLoginUser(username, password);

			model.put("user", login);
			System.out.println("okkk");
			return "STEP_Dashboard.jsp";

		}

		catch (Exception e) {
			System.out.println("not okk");
			model.put("message", "invalid username/password");
			return "UserLogin.jsp";

		}*/
		
		/*String role = netBankingService.checkLogin(username,password);

		System.out.println(role);
		return "Confirm.jsp";*/
		
		/*boolean i= netBankingServiceInterface.checkLogin(username,password);
		if(i)
		{
			return "f_Index.jsp";
		}
		else
		{
			return null;
		}*/

	}
	
}
