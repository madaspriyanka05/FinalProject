package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.Interface.GenericRepositoryInterface;

@Repository
public class GenericRepository  implements GenericRepositoryInterface
{
	@PersistenceContext
	EntityManager entityManager;
	
	//Inserting or updating the record in db
	@Transactional
	public void upsert(Object obj) {
		entityManager.merge(obj);
	}

	
	//fetching the data
	public Object fetchById(Class clazz, Object pk)
	{
		return entityManager.find(clazz, pk);
	}

	
	
}
