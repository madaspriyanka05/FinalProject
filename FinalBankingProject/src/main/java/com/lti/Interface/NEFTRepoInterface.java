package com.lti.Interface;

import java.util.List;

import com.lti.entity.Account;
import com.lti.entity.Transaction;

public interface NEFTRepoInterface 
{
	public void newWithdraw(int acno, double amount);
	public void newDeposit(int acno, double amount);
	public void newTransfer(int fromAcno, int toAcno, double amount);
	public List<Account> getNewAccountsByType(String type);
	public List<Transaction> newMiniStatement(int acno);
}
