package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="NetBankingAccount")
public class NetBankAccount 
{
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "seq")
	@SequenceGenerator(sequenceName = "netbankaccount_seq", name = "seq", allocationSize = 1)
	private int id;
	
	private String username;
	private String netPassword;
	private String transcationPassword;
	private String securityQues;
	private String securityAns;
	
	
	@OneToOne
	@JoinColumn(name="accountId")
	private Account netbankingAccountId;
	
	
	
	public NetBankAccount(int id, String username, String netPassword, String transcationPassword, String securityQues,
			String securityAns, Account netbankingAccountId) {
		super();
		this.id = id;
		this.username = username;
		this.netPassword = netPassword;
		this.transcationPassword = transcationPassword;
		this.securityQues = securityQues;
		this.securityAns = securityAns;
		this.netbankingAccountId = netbankingAccountId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getNetPassword() {
		return netPassword;
	}
	public void setNetPassword(String netPassword) {
		this.netPassword = netPassword;
	}
	public String getTranscationPassword() {
		return transcationPassword;
	}
	public void setTranscationPassword(String transcationPassword) {
		this.transcationPassword = transcationPassword;
	}
	public String getSecurityQues() {
		return securityQues;
	}
	public void setSecurityQues(String securityQues) {
		this.securityQues = securityQues;
	}
	public String getSecurityAns() {
		return securityAns;
	}
	public void setSecurityAns(String securityAns) {
		this.securityAns = securityAns;
	}
	public Account getNetbankingAccountId() {
		return netbankingAccountId;
	}
	public void setNetbankingAccountId(Account netbankingAccountId) {
		this.netbankingAccountId = netbankingAccountId;
	}
	@Override
	public String toString() {
		return "NetBankAccount [id=" + id + ", username=" + username + ", netPassword=" + netPassword
				+ ", transcationPassword=" + transcationPassword + ", securityQues=" + securityQues + ", securityAns="
				+ securityAns + ", netbankingAccountId=" + netbankingAccountId + "]";
	}

	
	
	
}
