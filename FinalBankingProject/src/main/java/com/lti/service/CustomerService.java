package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.Interface.CustomerInterface;

import com.lti.entity.Customer;

import com.lti.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public void register(Customer cust)
	{
		
		customerRepository.addNewCustomer(cust);
	}
	
	@Transactional
	public String checkLogin(String username, String password) {
		return customerRepository.readUserLogin(username, password);
		
	}
}

