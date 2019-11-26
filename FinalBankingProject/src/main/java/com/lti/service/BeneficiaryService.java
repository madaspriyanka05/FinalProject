package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.Interface.BeneficiaryInterface;
import com.lti.Interface.BeneficiaryServiceInterface;
import com.lti.entity.Beneficiary;

@Service
public class BeneficiaryService implements BeneficiaryServiceInterface
{
	@Autowired
	private BeneficiaryInterface beneficiaryInterface;
	
	public void registerAdd(Beneficiary ben) 
	{
		beneficiaryInterface.addNewBeneficiary(ben);
	}
}
