package com.lti.repository;

/**
 * @author : Jyoti Dixit
 */

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.Interface.NetBankingInterface;
import com.lti.entity.NetBankAccount;

@Repository("netbanking")
public class NetBankingRepository implements NetBankingInterface 
{
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void addNetBankingAcc(NetBankAccount netbankaccount) {
		entityManager.merge(netbankaccount);
	}

	@Transactional
	public void updateNetBankingAcc(NetBankAccount netbankaccount) {
		entityManager.merge(netbankaccount);
	}
	
	public List<NetBankAccount> getNetBankingAcc() 
	{
		Query q = entityManager.createQuery("Select n from NETBANKINGACCOUNT n");
		return q.getResultList();
	}
	
}
