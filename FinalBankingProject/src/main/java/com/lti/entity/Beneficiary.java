package com.lti.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Beneficiary")
public class Beneficiary 
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "seq")
	@SequenceGenerator(sequenceName = "beneficiary_seq", name = "seq", allocationSize = 1)
	private int id; 
	
	private String bName;
	
	private int bAccountId;
	
	/*
	@ManyToOne
	@JoinColumn(name="accountId",nullable=false)
	public Account baccount;
	*/
	
	/*@OneToOne
	@JoinColumn(name="bAccountId")
	public Account benAccountId;*/
	
	@OneToOne
	@JoinColumn(name="accountId")
	public Account custAccountId;

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getbName() {
		return bName;
	}


	public void setbName(String bName) {
		this.bName = bName;
	}


	public int getbAccountId() {
		return bAccountId;
	}


	public void setbAccountId(int bAccountId) {
		this.bAccountId = bAccountId;
	}


	public Account getCustAccountId() {
		return custAccountId;
	}


	public void setCustAccountId(Account custAccountId) {
		this.custAccountId = custAccountId;
	}

	
	
}
