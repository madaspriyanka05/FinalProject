package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Customer;

@Repository
public class CustomerRepository
{
	
		@PersistenceContext
		private EntityManager entityManager;
		
		@Transactional
		public void addNewCustomer(Customer cust)
		{
			
			entityManager.persist(cust);
		}

		public String readUserLogin(String username, String password) 
		{
			String qu="select a from Customer as a where a.emailId=:username and a.password=:password";
			Query q1=entityManager.createQuery(qu);
			q1.setParameter("username",username);
			q1.setParameter("password",password);
			List list=q1.getResultList();
			if((list!=null)&&(list.size()>0))
			{
				System.out.println("Approved");
				return "Approved";
			}
			
			System.out.println("Wrong Username and Password");
			return "Wrong Username";
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@PersistenceContext
//	private EntityManager entityManager;
//	
//	@Transactional
//	public void addNewCustomer(Customer customer) 
//	{
//		entityManager.merge(customer);
//	}
//
//	@Transactional	
//	public void updateNewCustomer(Customer customer) 
//	{
//		entityManager.merge(customer);
//	}
//	
//	@Transactional	
//	public void deleteNewCustomer(Customer customer) 
//	{
//		entityManager.remove(customer);
//	}
//
//	
//	public List<Customer> getCustomersList() 
//	{
//		Query q = entityManager.createQuery("Select c from customer c");
//		return q.getResultList();
//	}
//	
}
