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

import com.lti.Interface.TransactionServiceInterface;
import com.lti.entity.Account;
import com.lti.entity.Beneficiary;
import com.lti.entity.NetBankAccount;
import com.lti.entity.Transaction;

@Controller
public class TransactionController  
{
	@Autowired
	private TransactionServiceInterface transactionServiceInterface;
	

	@RequestMapping(path="f_NEFT.lti",method=RequestMethod.POST)
	private String neftTransfer(Transaction data, Map m, @RequestParam(name="fromaccountId") int accid,@RequestParam(name="ToaccountId") int baccid ,@RequestParam(name="amount") double amount, HttpServletRequest request) 
	{	
		try
		{
			//Account fromAccountId = (Account)request.getSession().getAttribute("fromaccountId");
			//Account toAccountId = (Account)request.getSession().getAttribute("ToaccountId");
			transactionServiceInterface.transfer(accid, baccid, amount);
			//m.put("Transaction Completed Successfully");
			return "f_MiniStatement.jsp";
		}
		
		catch(Exception e) {
			m.put("error", "Transaction unsuccessful");
			return "Login.jsp";
		}
	}

	}
