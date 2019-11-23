package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.lti.entity.Customer;

public class registerRepo 
{
	public void addToTable(Customer customer)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracleTest");
		EntityManager em= emf.createEntityManager();
		EntityTransaction tx= em.getTransaction();
		tx.begin();
		em.persist(customer);
		
		tx.commit();
		em.close();
		emf.close();
	}
}
