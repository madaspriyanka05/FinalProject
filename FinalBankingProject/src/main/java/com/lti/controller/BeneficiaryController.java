package com.lti.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.Interface.BeneficiaryServiceInterface;
import com.lti.Interface.NetBankingServiceInterface;
import com.lti.entity.Account;
import com.lti.entity.Beneficiary;
import com.lti.entity.NetBankAccount;

@Controller
public class BeneficiaryController 
{
	@Autowired
	private BeneficiaryServiceInterface beneficiaryServiceInterface;
	
	@RequestMapping(path = "f_AddNewBeneficiary.lti", method = RequestMethod.POST)
	public String register(Beneficiary ben, ModelMap model, HttpSession session)
	{
		try
		{
		Account benDetails= (Account) model.get("user");
		ben.setCustAccountId(benDetails);
		
		beneficiaryServiceInterface.registerAdd(ben);
		
		model.put("user", ben);
		return "f_paymentMode.jsp";
		}
		catch(Exception e)
		{
			return "f_AddNewBeneficiary.jsp";
		}
	}
}


