package com.lti.entity;

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
	
	
	@ManyToOne
	@JoinColumn(name="accountId")
	private Account bAccountId;


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


	public Account getbAccountId() {
		return bAccountId;
	}


	public void setbAccountId(Account bAccountId) {
		this.bAccountId = bAccountId;
	}


	@Override
	public String toString() {
		return "Beneficiary [id=" + id + ", bName=" + bName + ", bAccountId=" + bAccountId + "]";
	}
	

}
