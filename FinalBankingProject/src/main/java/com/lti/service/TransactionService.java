package com.lti.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.Interface.GenericRepositoryInterface;
import com.lti.Interface.TransactionInterface;
import com.lti.Interface.TransactionServiceInterface;
import com.lti.entity.Account;
import com.lti.entity.Transaction;

@Service
public class TransactionService  implements TransactionServiceInterface
{
	
	@Autowired
	private GenericRepositoryInterface genericRepositoryInterface;

	@Autowired
	private TransactionInterface transactionInterface;
	
	public void  transfer(int accid, int baccid, double amount, String type) 
	{
		
		Account acc1 = (Account) genericRepositoryInterface.fetchById(Account.class, accid); //fromaccountid
		Account acc2 = (Account) genericRepositoryInterface.fetchById(Account.class, baccid);//toaccountid
		
		if(amount<=acc1.getBalance())
		{
			acc1.setBalance(acc1.getBalance()-amount);//withdraw from acc1
			acc2.setBalance(acc2.getBalance()+amount);//Transfer to account2

			Transaction t1 = new Transaction();
			t1.settType(type);
			t1.setAmount(amount);
			t1.setFromAccount(acc1);
			t1.setToAccount(acc2);
			t1.setDateandtime(LocalDate.now());

			genericRepositoryInterface.upsert(t1);
		}
		else {
			//throw some exception
		}
	}

	public List<Transaction> fetch(int accId, LocalDate startDate, LocalDate endDate) {
		return transactionInterface.fetch(accId, startDate, endDate);	
	}	
	
	

}
