package com.lti.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.Interface.CustomerServiceInterface;
import com.lti.entity.NetBankAccount;

@Controller
public class TransactionPasswordController 
{
	@Autowired
	private CustomerServiceInterface customerServiceInterface;
	
	@RequestMapping(path="f_TransactionPassword.lti",method=RequestMethod.POST)
	private String neftTransfer(
			@RequestParam(name="transcationPassword") String transactionPass,
			Map m)
	{	
		try 
		{
			NetBankAccount login = customerServiceInterface.checkTransactionPassword(transactionPass);
			System.out.println("okkk");
			return "AccountSummary.jsp";

		}

		catch (Exception e) {
			System.out.println("not okk");
			m.put("message", "invalid transaction password");
			return "u_index.jsp";

		}
	}

}
