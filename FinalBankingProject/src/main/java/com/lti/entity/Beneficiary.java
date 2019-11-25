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
	
	
	/*
	@ManyToOne
	@JoinColumn(name="accountId",nullable=false)
	public Account baccount;
	*/
	
	@OneToOne
	@JoinColumn(name="accountId",nullable=false)
	public Account account;


	public Beneficiary(int id, String bName, Account baccount, Account account) {
		super();
		this.id = id;
		this.bName = bName;
		//this.baccount = baccount;
		this.account = account;
	}


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

/*
	public Account getBaccount() {
		return baccount;
	}


	public void setBaccount(Account baccount) {
		this.baccount = baccount;
	}
*/

	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}

/*
	@Override
	public String toString() {
		return "Beneficiary [id=" + id + ", bName=" + bName + ", baccount=" + baccount + ", account=" + account + "]";
	}

*/

	

	
	


}
