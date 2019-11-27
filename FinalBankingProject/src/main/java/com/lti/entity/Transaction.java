package com.lti.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="Transaction")
public class Transaction 
{
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "seq")
	@SequenceGenerator(sequenceName = "transaction1_seq", name = "seq", allocationSize = 1)
	private int tid;
	
	
	private String toAccountName;
	private double amount;
	private String tType;
	
	@DateTimeFormat
	private LocalDate dateandtime;
	
	@OneToOne
	@JoinColumn(name="toaccountid")
	public Account toAccount;
	
	@OneToOne
	@JoinColumn(name="accountid")
	public Account fromAccount;

	public Account getToAccount() {
		return toAccount;
	}



	public void setToAccount(Account toAccount) {
		this.toAccount = toAccount;
	}



	public Account getFromAccount() {
		return fromAccount;
	}



	public void setFromAccount(Account fromAccount) {
		this.fromAccount = fromAccount;
	}



	

	public int getTid() {
		return tid;
	}



	public void setTid(int tid) {
		this.tid = tid;
	}



	public String getToAccountName() {
		return toAccountName;
	}



	public void setToAccountName(String toAccountName) {
		this.toAccountName = toAccountName;
	}



	public double getAmount() {
		return amount;
	}



	public void setAmount(double amount) {
		this.amount = amount;
	}



	public String gettType() {
		return tType;
	}



	public void settType(String tType) {
		this.tType = tType;
	}



	public LocalDate getDateandtime() {
		return dateandtime;
	}



	public void setDateandtime(LocalDate dateandtime) {
		this.dateandtime = dateandtime;
	}



	
}
