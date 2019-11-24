package com.lti.Interface;

import com.lti.entity.Customer;

public interface CustomerServiceInterface
{

	public void register(Customer cust);
	
	public boolean checkLogin(String username, String password);
	
}
