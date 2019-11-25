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

@Repository
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

	public int readLogin(String username, String password)
	{
		String qu = "select a from NetBankAccount as a where a.emailId=:username and a.password=:password";
		Query q1 = entityManager.createQuery(qu);
		q1.setParameter("username", username);
		q1.setParameter("password", password);
		List list = q1.getResultList();

		if ((list != null) && (list.size() > 0)) {
			System.out.println("Approved");
			return 1;
		}

		System.out.println("Wrong Username and Password");
		return 0;
	}
	
}
