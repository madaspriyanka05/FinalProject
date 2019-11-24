package com.lti.Interface;

import java.util.List;

import com.lti.entity.Account;
import com.lti.entity.Transaction;

public interface NEFTServiceInterface 
{
	public void withdraw(int acno, double amount);
	public void deposit(int acno, double amount);
	public void transfer(int fromAcno, int toAcno, double amount);
	public List<Account> getAccountsByType(String type);
	public List<Transaction> miniStatement(int acno);
}
