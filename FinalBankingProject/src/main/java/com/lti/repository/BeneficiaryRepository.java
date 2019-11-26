package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.Interface.BeneficiaryInterface;
import com.lti.entity.Beneficiary;

@Repository
public class BeneficiaryRepository implements BeneficiaryInterface
{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void addNewBeneficiary(Beneficiary beneficiaryobj) 
	{
		entityManager.merge(beneficiaryobj);
	}

	@Transactional
	public void removeBeneficiary(Beneficiary beneficiaryobj) 
	{
		entityManager.remove(beneficiaryobj);
	}
	
	public List<Beneficiary> getBeneficiaries() 
	{
		Query q = entityManager.createQuery("Select b from beneficiary b");
		return q.getResultList();
	}
	
}
