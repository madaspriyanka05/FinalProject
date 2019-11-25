package com.lti.controller;


import java.util.List;
import java.util.Map;

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
	
	@SuppressWarnings("unchecked")
	@RequestMapping(path="f_NEFT.lti",method=RequestMethod.POST)
	private String neftTransfer(Transaction data, Map m, @RequestParam(name="accountId")NetBankAccount accid,@RequestParam(name="bAccountId") Beneficiary baccid ,@RequestParam(name="amount") Transaction transaction) 
	{	
		try
		{
//			NetBankAccount fromAccountId = (NetBankAccount)request.getSession().getAttribute("fromAccountId");
//			Account toAccountId = (Account)request.getSession().getAttribute("toAccountId");
			Transaction tx = transactionServiceInterface.transfer(accid, baccid, transaction);
			m.put("Transaction Completed Successfully",tx);
			return "f_paymentMode.jsp";
		}
		catch(CannotCreateTransactionException ex) {
			m.put("error", ex.getMessage());
			return "f_Index.jsp";
		}
		catch(Exception e) {
			m.put("error", "Transaction unsuccessful");
			return "f_Index.jsp";
		}
	}

	}
