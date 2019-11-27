package com.lti.Interface;

import java.time.LocalDate;
import java.util.List;

import com.lti.entity.Transaction;

public interface TransactionServiceInterface 
{
	// public List<Transaction> transferAmount(Transaction txdata, NetBankAccount netBankAccountId , Account accountId);
	public void  transfer(int accid, int baccid, double amount, String type);
	public List<Transaction> fetch(int accId, LocalDate startDate, LocalDate endDate);	
}
