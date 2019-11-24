package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.Interface.GenericRepositoryInterface;
import com.lti.entity.NetBankAccount;
import com.lti.entity.Transaction;

@Service
public class TransactionService 
{
	@Autowired
	private GenericRepositoryInterface genericRepo;
	
	public Transaction transferAmount(Transaction data, NetBankAccount customer) throws Exception
	{
		Transaction transaction = new Transaction();
		
		String ttype = data.getTtype();
		long fromAccNo = customer.get
}
