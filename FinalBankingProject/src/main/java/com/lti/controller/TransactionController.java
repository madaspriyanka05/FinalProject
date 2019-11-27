package com.lti.controller;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lti.Interface.TransactionServiceInterface;
import com.lti.entity.Customer;
import com.lti.entity.Transaction;

@Controller
@SessionAttributes("user")
public class TransactionController  
{
	@Autowired
	private TransactionServiceInterface transactionServiceInterface;
	
	//Fund transferring
	@RequestMapping(path="f_NEFT.lti",method=RequestMethod.POST)
	private String neftTransfer(Transaction transaction,
			@RequestParam(name="fromAccountId") int accid,
			@RequestParam(name="toAccountId") int baccid,
			@RequestParam(name="amount") double amount,
			@RequestParam(name="tType") String type,
			Map m,HttpSession session)
	{	
		try
		{
			transactionServiceInterface.transfer(accid, baccid, amount, type);
			session.setAttribute("accountId", transaction.getFromAccount());
			return "TransactionDone.jsp";
		}
		
		catch(Exception e) {
			m.put("error", "Transaction unsuccessful");
			return "u_index.jsp";
		}
	}
	
	//FetchStatement
	@RequestMapping(path="FetchStatement.lti", method=RequestMethod.POST)
	private String fetchStatement(@RequestParam("startDate") String startDate, @RequestParam("endDate") String endDate, ModelMap model) {
		Customer customer = (Customer) model.get("user");
		int accId = customer.getCustomeraccount().getAccountId();
		
		LocalDate start = LocalDate.parse(startDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		LocalDate end = LocalDate.parse(endDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));				

		List<Transaction> tx = transactionServiceInterface.fetch(accId, start, end);
		model.put("transactions", tx);		
				
		return "AccountStatement.jsp";
	}
}
