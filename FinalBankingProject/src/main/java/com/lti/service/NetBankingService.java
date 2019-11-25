package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.Interface.NetBankingInterface;
import com.lti.Interface.NetBankingServiceInterface;
import com.lti.entity.Customer;
import com.lti.entity.NetBankAccount;
import com.lti.repository.NetBankingRepository;

@Service
public class NetBankingService implements NetBankingServiceInterface
{
	@Autowired
	private NetBankingInterface netBankingInterface;
	
	public void registerAdd(NetBankAccount netAcc)
	{
		
		netBankingInterface.addNetBankingAcc(netAcc);
	}
	
	@Transactional
	public boolean checkLogin(String username, String netPassword) 
	{
		int result=netBankingInterface.readLogin(username, netPassword);
		  
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
