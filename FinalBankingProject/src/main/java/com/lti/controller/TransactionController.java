package com.lti.controller;

import org.springframework.stereotype.Controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.CannotCreateTransactionException;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lti.entity.NetBankAccount;
import com.lti.entity.Transaction;
import com.lti.service.TransactionService;

@Controller
public class TransactionController 
{
	@Autowired
	private TransactionService transactionService;
	
	@RequestMapping(path="/f_NEFT.lti")
	private String neftTransfer(Transaction data, Map model, HttpServletRequest request) 
	{	
		try
		{
			NetBankAccount customer = (NetBankAccount)request.getSession().getAttribute("customer");
			Transaction tx = transactionService.transferAmount(data,customer);
			model.put("transaction", tx);
			return "mini_statement.jsp";
		}
		catch(CannotCreateTransactionException ex) {
			model.put("error", ex.getMessage());
			return "neft.jsp";
		}
		catch(Exception e) {
			model.put("error", "Transaction unsuccessful");
			return "neft.jsp";
		}
	}
}
