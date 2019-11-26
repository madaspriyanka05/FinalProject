package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.Interface.CustomerInterface;
import com.lti.Interface.CustomerServiceInterface;
import com.lti.entity.Customer;
import com.lti.entity.NetBankAccount;

@Service("loginService")
public class CustomerService  implements CustomerServiceInterface 
{

	@Autowired
	private CustomerInterface customerInterface;
	
	public void register(Customer cust)
	{
		
		customerInterface.addNewCustomer(cust);
	}
	
	@Transactional
	public Customer checkLogin(String email, String password) 
	{
		Customer a = customerInterface.readLogin(email, password);
		return a;
	  
	}
	
	@Transactional
	public NetBankAccount checkNetLogin(String username, String password) 
	{
		NetBankAccount a = customerInterface.readNetLogin(username, password);
		return a;
	}
	
	@Transactional
	public NetBankAccount checkTransactionPassword(String transcationPassword) 
	{
		NetBankAccount a = customerInterface.readTransactionPassword(transcationPassword);
		return a;
	}
	
}

