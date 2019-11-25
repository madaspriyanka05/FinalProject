package com.lti.Interface;

import java.util.List;

import com.lti.entity.Account;
import com.lti.entity.Beneficiary;
import com.lti.entity.NetBankAccount;
import com.lti.entity.Transaction;

public interface TransactionServiceInterface 
{
	 public List<Transaction> transferAmount(Transaction txdata, NetBankAccount netBankAccountId , Account accountId);
	 public  Transaction transfer(NetBankAccount accid, Beneficiary baccid, Transaction transaction);
		
}
