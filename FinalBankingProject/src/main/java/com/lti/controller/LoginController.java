package com.lti.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lti.Interface.CustomerServiceInterface;
import com.lti.entity.Customer;
import com.lti.entity.NetBankAccount;;

@Controller
@SessionAttributes("user")
public class LoginController 
{
	@Autowired
	private CustomerServiceInterface customerServiceInterface;
	
	@RequestMapping(path = "Login.lti", method = RequestMethod.POST)
	public String login(@RequestParam("emailId") String username, @RequestParam("password") String password, ModelMap model, HttpSession session) 
	{
		try
		{

		Customer login = customerServiceInterface.checkLogin(username, password);

		model.put("user", login);
		return "LoginConf.jsp";
		}
		catch(Exception e)
		{
			model.put("message", "Invalid Username/Password");
			return "Login.jsp";
		}
		
	}
	//In Progress
	@RequestMapping(path = "f_NetBankingLogin.lti", method = RequestMethod.POST)
	public String loginNetBanking(@RequestParam("username") String username, @RequestParam("netPassword") String password,
			ModelMap model) 
	{

		try 
		{
			NetBankAccount login = customerServiceInterface.checkNetLogin(username, password);
			model.put("user", login);
			return "f_paymentMode.jsp";

		}catch (Exception e) {
		
			model.put("message", "invalid username/password");
			return "u_index.jsp";

		}
	}
}
