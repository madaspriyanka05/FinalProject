package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.Interface.CustomerInterface;
import com.lti.Interface.CustomerServiceInterface;
import com.lti.entity.Customer;

import com.lti.repository.CustomerRepository;

@Service
public class CustomerService  implements CustomerServiceInterface 
{

	@Autowired
	private CustomerInterface customerInterface;
	
	public void register(Customer cust)
	{
		
		customerInterface.addNewCustomer(cust);
	}
	
	public boolean checkLogin(String email, String password) 
	{
	  int result=customerInterface.readLogin(email, password);
	  
	  if(result==1)
	  {
		  return  true;
	  }
	  else
	  {
		  return false;
	  }
	  
	}
}

