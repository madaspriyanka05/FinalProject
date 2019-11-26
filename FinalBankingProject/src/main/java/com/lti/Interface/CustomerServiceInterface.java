package com.lti.Interface;

import com.lti.entity.Customer;
import com.lti.entity.NetBankAccount;

public interface CustomerServiceInterface
{

	public void register(Customer cust);
	
	public Customer checkLogin(String username, String password);
	public NetBankAccount checkNetLogin(String username, String password);
	
}
