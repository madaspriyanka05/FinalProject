package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.lti.Interface.GenericRepositoryInterface;

public class GenericRepository  implements GenericRepositoryInterface
{
	@PersistenceContext
	EntityManager entityManager;
	
	@Transactional
	public void upsert(Object obj) {
		entityManager.merge(obj);
	}

	public Object fetchById(Class clazz, Object pk)
	{
		return entityManager.find(clazz, pk);
	}

	@Transactional
	public void delete(Class clazz, Object pk) {
		Object obj = fetchById(clazz, pk);
		entityManager.remove(obj);
	}
	
	public Object fetchData(Class clazz, Object pk)
	{
		
		Object obj = entityManager.find(clazz, pk);
		return obj;
	}
}
