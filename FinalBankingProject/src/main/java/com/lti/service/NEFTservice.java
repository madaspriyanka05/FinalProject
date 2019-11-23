package com.lti.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.lti.Interface.NEFTinterface;
import com.lti.entity.Account;
import com.lti.entity.Transaction;
import com.lti.repository.GenericDao;
import com.lti.repository.NEFTrepository;

@Service
public class NEFTservice implements NEFTinterface
{
	public void withdraw(int acno, double amount) {
		GenericDao dao = new GenericDao();
		Account acc = (Account) dao.fetchData(Account.class, acno);
		
		if(amount<=acc.getBalance())
		{
			acc.setBalance(acc.getBalance()-amount);
		
			Transaction t = new Transaction();
			t.setType("Withdraw");
			t.setAmount(amount);
			t.setAccount(acc);
			t.setDateTime(LocalDateTime.now());
			
			dao.addP(acc);
			dao.addP(t);
		}
	}

	public void deposit(int acno, double amount) {
		GenericDao dao = new GenericDao();
		Account acc = (Account) dao.fetchData(Account.class, acno);
		acc.setBalance(acc.getBalance()+amount);
		
		Transaction t = new Transaction();
		t.setType("Deposit");
		t.setAmount(amount);
		t.setAccount(acc);
		t.setDateTime(LocalDateTime.now());
	
		dao.addP(acc);
		dao.addP(t);
	}

	public void transfer(int fromAcno, int toAcno, double amount) {
		GenericDao dao = new GenericDao();
		Account acc1 = (Account) dao.fetchData(Account.class, fromAcno);
		Account acc2 = (Account) dao.fetchData(Account.class, toAcno);
		
		if(amount<=acc1.getBalance())
		{
			acc1.setBalance(acc1.getBalance()-amount);
			acc2.setBalance(acc2.getBalance()+amount);
			
			Transaction t1 = new Transaction();
			t1.setType("Withdraw");
			t1.setAmount(amount);
			t1.setAccount(acc1);
			t1.setDateTime(LocalDateTime.now());
		
			Transaction t2 = new Transaction();
			t2.setType("Transfer");
			t2.setAmount(amount);
			t2.setAccount(acc2);
			t2.setDateTime(LocalDateTime.now());
			
			dao.addP(acc1);
			dao.addP(acc2);
			dao.addP(t1);
			dao.addP(t2);
		}
	}

	public List<Account> getAccountsByType(String type) 
	{
		NEFTrepository ad = new NEFTrepository();
		
		return ad.fetchByType(type);
	}

	public List<Transaction> miniStatement(int acno) 
	{
		NEFTrepository ad = new NEFTrepository();
		
		return ad.fetchminiStatement(acno);
	}

}
