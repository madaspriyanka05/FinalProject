package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.Interface.NEFTServiceInterface;
import com.lti.entity.Account;
import com.lti.entity.Customer;
import com.lti.entity.Transaction;
import com.lti.service.NEFTservice;

@Controller
public class NEFTcontroller implements NEFTServiceInterface 
{
	
	@Autowired
	private NEFTServiceInterface neftServiceInterface;
	
	@RequestMapping(path = "f_NEFT.lti", method = RequestMethod.POST)
	public String register(Transaction t)
	{
		neftServiceInterface.deposit(7707, 1000);
		
		return "f_paymentMode.jsp";
		
	}

	public void withdraw(int acno, double amount) {
		// TODO Auto-generated method stub
		
	}

	public void deposit(int acno, double amount) {
		// TODO Auto-generated method stub
		
	}

	public void transfer(int fromAcno, int toAcno, double amount) {
		// TODO Auto-generated method stub
		
	}

	public List<Account> getAccountsByType(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Transaction> miniStatement(int acno) {
		// TODO Auto-generated method stub
		return null;
	}

}
