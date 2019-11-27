package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.Interface.CustomerInterface;
import com.lti.entity.Customer;
import com.lti.entity.NetBankAccount;

@Repository
public class CustomerRepository implements CustomerInterface {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void addNewCustomer(Customer cust) {

		entityManager.persist(cust);
	}

	@Transactional
	public Customer readLogin(String username, String password) 
	{
		
		String qu = "select a from Customer as a join fetch a.customeraccount acc where a.emailId=:username and a.password=:password";
		Query q1=entityManager.createQuery(qu);
		q1.setParameter("username",username);
		q1.setParameter("password",password);
		
		Customer l1=(Customer)q1.getSingleResult();
		return l1;
		
		
/*
		if ((list != null) && (list.size() > 0)) {
			System.out.println("Approved");
			return 1;
		}

		System.out.println("Wrong Username and Password");
		return 0;*/
	}

	public NetBankAccount readNetLogin(String username, String password) 
	{
		
		String qu = "select a from NetBankAccount as a where a.username=:username and a.netPassword=:password";
		Query q1=entityManager.createQuery(qu);
		q1.setParameter("username",username);
		q1.setParameter("password",password);
		List list=q1.getResultList();
		
		NetBankAccount l1=(NetBankAccount)q1.getSingleResult();
		return l1;
	}
	
	public NetBankAccount readTransactionPassword(String transcationPassword) 
	{
		
		String qu = "select a from NetBankAccount as where a.transcationPassword=:transcationPassword";
		Query q1=entityManager.createQuery(qu);
		q1.setParameter("transcationPassword",transcationPassword);
		List list=q1.getResultList();
				
		NetBankAccount l1=(NetBankAccount)q1.getSingleResult();
		return l1;
	}
	
	public void updateNewCustomer(Customer cust) 
	{
		entityManager.merge(cust);

	}

	public void deleteNewCustomer(Customer cust) 
	{
		entityManager.remove(cust);

	}

	public List<Customer> getCustomersList() 
	{

		return null;
	}

}
