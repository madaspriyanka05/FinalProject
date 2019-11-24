package com.lti.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.CannotCreateTransactionException;

import com.lti.Interface.GenericRepositoryInterface;
import com.lti.entity.Account;
import com.lti.entity.NetBankAccount;
import com.lti.entity.Transaction;

@Service
public class TransactionService 
{
	private static final double MINIMUM_BALANCE = 1000;
	private double charge = 0;
	
	@Autowired
	private GenericRepositoryInterface genericRepo;
	
	public Transaction transferAmount(Transaction data, NetBankAccount customer)
	{
		Transaction transaction = new Transaction();
		
		String ttype = data.getTtype();
		
		long fromAccNo = customer.getAccountNo();
		Account fromAccount =  (Account)genericRepo.fetchById(Account.class, fromAccNo);
		
		long toAccNo = data.getTOACCOUNTID();
		Account toAccount = (Account)genericRepo.fetchById(Account.class, toAccNo);
		
		double amount = data.getAmount();
		
		//NEFT
		if(ttype.equals("neft") || ttype.equals("NEFT"))
		{
			if(amount > 200000)
				throw new CannotCreateTransactionException("Maximum limit for NEFT transfer is Rs. 2 Lacs");
			else if(amount <=10000)
				charge = 1.18;
			else if(amount<10000 && amount>100000)
				charge= 2.36;
			else if(amount<100000 && amount>200000)
				charge= 3.54;
		}
		
		if(fromAccount.getBalance() < amount) 
		{
			throw new CannotCreateTransactionException("Insufficient Balance to transfer");
		}
		else
		{
			double balance = fromAccount.getBalance() - (amount + charge);
			if(balance < MINIMUM_BALANCE)
				throw new CannotCreateTransactionException("Minimum account balance has to maintained");
			else
			{
				try
				{
					fromAccount.setBalance(balance);
					toAccount.setBalance(toAccount.getBalance()+amount);
					transaction.setFromAccount(fromAccount);
					transaction.setToAccount(toAccount);
					transaction.setTtype(data.getTtype());
					transaction.setAmount(amount);
					transaction.setDATEANDTIME(LocalDateTime.now());
					
					genericRepo.upsert(transaction);
					
					return transaction;
				}
				catch(Exception e)
				{
					
				}
			}
		}
		
		return transaction;
	}
}
