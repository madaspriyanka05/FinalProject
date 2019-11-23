package com.lti.repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.lti.entity.Account;
import com.lti.entity.Transaction;

public class NEFTrepository extends GenericDao
{
	public List<Account> fetchByType(String type)
	{
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("oracleTest");
		EntityManager em= emf.createEntityManager();
		
		Query q = (Query) em.createQuery("select t from Transaction as t where a.ttype=:tp");
		q.setParameter("tp",type);
		List<Account> accounts = q.getResultList();
		
		em.close();
		emf.close();
		
		return accounts;
	}
	
	public List<Transaction> fetchminiStatement(int acno)
	{
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("oracleTest");
		EntityManager em= emf.createEntityManager();
		
		String s = "select t from Transaction as t "
					+ "where t.account.accountid=:ac "
					+"order by t.dateAndTime desc";
		Query q = em.createQuery(s);
		q.setParameter("ac",acno);
		q.setMaxResults(5);
		List<Transaction> transactions = q.getResultList();
		
		em.close();
		emf.close();
		
		return transactions;
	}
	
	public List<Transaction> fetchTransactions(int acno, LocalDate date)
	{
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("oracleTest");
		EntityManager em= emf.createEntityManager();
		
		String s = "select t from Transaction t "
					+ "where t.account.accountid=:ac "
					+"and t.dateAndTime between :dt1 and :dt2";
		Query q = em.createQuery(s);
		q.setParameter("ac",acno);
		q.setParameter("dt1", LocalDateTime.of(date, LocalTime.of(0, 0, 0)));
		q.setParameter("dt2", LocalDateTime.of(date, LocalTime.of(23, 59, 59)));
		List<Transaction> transactions = q.getResultList();
		
		em.close();
		emf.close();
		
		return transactions;
	}
	
	public List<Account> fetchTransactionData(double amount)
	{
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("oracleTest");
		EntityManager em= emf.createEntityManager();
		
		String s = "select distinct(a) from Account a inner join fetch a.transaction t "
					+ "where t.amount >= :amt";
		
		Query q = em.createQuery(s);
		q.setParameter("amt",amount);
		List<Account> transactions = q.getResultList();
		
		em.close();
		emf.close();
		
		return transactions;
	}
}
