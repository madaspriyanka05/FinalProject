package com.lti.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.CannotCreateTransactionException;

import com.lti.Interface.GenericRepositoryInterface;
import com.lti.Interface.TransactionServiceInterface;
import com.lti.entity.Account;
import com.lti.entity.Beneficiary;
import com.lti.entity.NetBankAccount;
import com.lti.entity.Transaction;

@Service
public class TransactionService  implements TransactionServiceInterface
{
	private static final double MINIMUM_BALANCE = 1000;
	private double charge = 0;
	
	@Autowired
	private GenericRepositoryInterface genericRepositoryInterface;

	
	Transaction t1 = new Transaction();
	Transaction t2 = new Transaction();
	
	public Transaction transfer(NetBankAccount accid, Beneficiary baccid, Transaction transaction) 
	{
		
		Account acc1 = (Account) genericRepositoryInterface.fetchData(Account.class, accid); //fromaccountid
		Account acc2 = (Account) genericRepositoryInterface.fetchData(Account.class, baccid);//toaccountid
		double amount =transaction.getAmount();
		
		if(amount<=acc1.getBalance())
		{
			acc1.setBalance(acc1.getBalance()-amount);//withdraw from acc1
			acc2.setBalance(acc2.getBalance()+amount);//Transfer to account2
			
			
			t1.settType("Withdraw");
			t1.setAmount(amount);
			t1.setToAccountId(acc1);
			t1.setDateandtime(LocalDateTime.now());
		
			
			t2.settType("Transfer");
			t2.setAmount(amount);
			t2.setToAccountId(acc2);
			t2.setDateandtime(LocalDateTime.now());
			
			genericRepositoryInterface.upsert(acc1);
			genericRepositoryInterface.upsert(acc2);
			genericRepositoryInterface.upsert(t1);
			genericRepositoryInterface.upsert(t2);
			
			return t2; //account2 amount transfered successfully 
		}
		return t1;  //account2 amount transfered successfully
	}

	public List<Transaction> transferAmount(Transaction txdata, NetBankAccount netBankAccountId, Account accountId) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public List<Transaction> transferAmount(Transaction txdata, NetBankAccount netBankAccountId, Account accountId)
	{
		Transaction transaction = new Transaction();
		
		String ttype = txdata.gettType();
		
		Account fromAccount =  (Account)genericRepositoryInterface.fetchById(Account.class, netBankAccountId);
		
		Account toAccId = txdata.getToAccountId();
		Account toAccount = (Account)genericRepositoryInterface.fetchById(Account.class, toAccId);
		
		double amount = txdata.getAmount();
		
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
					transaction.setToAccountId(toAccount);
					transaction.settType(txdata.gettType());
					transaction.setAmount(amount);
					transaction.setDateandtime(LocalDateTime.now());
					
					genericRepositoryInterface.upsert(transaction);
					
					
					return (List<Transaction>) transaction;
				}
				catch(Exception e)
				{
					
				}
			}
		}
		return null;
		
	
	}
*/

}
