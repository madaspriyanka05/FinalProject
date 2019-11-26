package com.lti.controller;


import java.util.List;
import java.util.Map;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.CannotCreateTransactionException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.Interface.CustomerServiceInterface;
import com.lti.Interface.TransactionServiceInterface;
import com.lti.entity.Account;

import com.lti.entity.NetBankAccount;
import com.lti.entity.Transaction;

@Controller
public class TransactionController  
{
	@Autowired
	private TransactionServiceInterface transactionServiceInterface;
	

	@RequestMapping(path="f_NEFT.lti",method=RequestMethod.POST)
	private String neftTransfer(
			@RequestParam(name="fromAccountId") int accid,
			@RequestParam(name="toAccountId") int baccid,
			@RequestParam(name="amount") double amount,
			@RequestParam(name="tType") String type,
			Map m)
	{	
		try
		{
			transactionServiceInterface.transfer(accid, baccid, amount, type);
			//m.put("Transaction Completed Successfully");
			return "f_TransactionPassword.jsp";
		}
		
		catch(Exception e) {
			m.put("error", "Transaction unsuccessful");
			return "u_index.jsp";
		}
	}
}
