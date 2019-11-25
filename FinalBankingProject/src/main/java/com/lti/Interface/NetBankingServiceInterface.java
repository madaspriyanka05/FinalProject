package com.lti.Interface;

import com.lti.entity.Customer;
import com.lti.entity.NetBankAccount;

public interface NetBankingServiceInterface 
{
	public void registerAdd(NetBankAccount netAcc);
	
	public boolean checkLogin(String username, String password);

}
