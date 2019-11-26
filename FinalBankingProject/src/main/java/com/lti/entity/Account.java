package com.lti.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="Account")
public class Account
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "seq")
	@SequenceGenerator(sequenceName = "account_seq", name = "seq", allocationSize = 1)
	private int accountId; 
	
	private double balance;
	private LocalDate openDate;
	private String status;
	
	
	@OneToOne
	@JoinColumn(name="id")
	private Customer customer;



	public int getAccountId() {
		return accountId;
	}


	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public LocalDate getOpenDate() {
		return openDate;
	}


	public void setOpenDate(LocalDate openDate) {
		this.openDate = openDate;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", balance=" + balance + ", openDate=" + openDate + ", status="
				+ status + ", customer=" + customer + "]";
	}
		
//	@OneToMany(mappedBy="account") //List of Transaction  
//	public List <Transaction> transactions;
	
//	@OneToOne(mappedBy="account")
//	private  Beneficiary beneficiary;

	
	
	
	
	

}
