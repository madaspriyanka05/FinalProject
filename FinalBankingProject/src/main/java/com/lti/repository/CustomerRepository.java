package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.Interface.CustomerInterface;
import com.lti.entity.Customer;

@Repository
public class CustomerRepository implements CustomerInterface {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void addNewCustomer(Customer cust) {

		entityManager.persist(cust);
	}

	public int readLogin(String username, String password) {
		String qu = "select a from Customer as a where a.emailId=:username and a.password=:password";
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
