package com.lti.service;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.Interface.NEFTRepoInterface;
import com.lti.Interface.NEFTServiceInterface;
import com.lti.entity.Account;
import com.lti.entity.Transaction;
import com.lti.repository.NEFTRepository;

@Service("NEFTservice")
public class NEFTservice implements NEFTServiceInterface
{
	@Autowired
	private NEFTRepoInterface neftRepoInterface;
	
	@PersistenceContext
	private EntityManager entityManager;

	public void withdraw(int acno, double amount) {
		// TODO Auto-generated method stub
		
	}

	public void deposit(int acno, double amount) 
	{
		neftRepoInterface.newDeposit(7707, 2222);
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
