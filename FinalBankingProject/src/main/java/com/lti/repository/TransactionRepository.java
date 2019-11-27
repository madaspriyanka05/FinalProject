package com.lti.repository;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.Interface.TransactionInterface;
import com.lti.entity.Transaction;

@Repository
public class TransactionRepository implements TransactionInterface {

	@PersistenceContext
	private EntityManager entityManager;
	
	//fetching the data from transaction
	public List<Transaction> fetch(int accId, LocalDate startDate, LocalDate endDate) {
		return entityManager
				.createQuery("select t from Transaction t join fetch t.fromAccount fromAcc join fetch t.toAccount toAcc where fromAcc.accountId = :id and t.dateandtime between :st and :dt")
				.setParameter("id", accId)
				.setParameter("st", startDate)
				.setParameter("dt", endDate)
				.getResultList();
	}
}
