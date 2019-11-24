package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.Interface.NetBankingInterface;
import com.lti.entity.NetBankAccount;
import com.lti.repository.NetBankingRepository;

@Service
public class NetBankingService 
{
	@Autowired
	private NetBankingInterface netBankingInterface;
	
	public void registerAdd(NetBankAccount netAcc)
	{
		
		netBankingInterface.addNetBankingAcc(netAcc);
	}
	
	@Transactional
	public String checkLogin(String username, String netPassword) 
	{
		//return netBankingRepo.getNetBankingLogin(username, netPassword);	
		return null;
	}
}
