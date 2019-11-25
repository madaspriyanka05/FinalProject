package com.lti.entity;

import java.time.LocalDateTime;

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
	private LocalDateTime dateandtime;
	
	
	
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="accountId")
	private Account toAccountId;



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



	public LocalDateTime getDateandtime() {
		return dateandtime;
	}



	public void setDateandtime(LocalDateTime dateandtime) {
		this.dateandtime = dateandtime;
	}



	public Account getToAccountId() {
		return toAccountId;
	}



	public void setToAccountId(Account toAccountId) {
		this.toAccountId = toAccountId;
	}



	@Override
	public String toString() {
		return "Transaction [tid=" + tid + ", toAccountName=" + toAccountName + ", amount=" + amount + ", tType="
				+ tType + ", dateandtime=" + dateandtime + ", toAccountId=" + toAccountId + "]";
	}




	
	
}
