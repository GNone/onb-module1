package com.example.bankaccount.model;

import java.math.BigDecimal;

public class BankAccount {
	private AccountHolder accountHolder;
	private BigDecimal balance;
	private String accountNumber;
	private String branch;
	private String currency;
	
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public BankAccount(AccountHolder accountHolder, BigDecimal balance,	String accountNumber, String branch, String currency) {
		super();
		this.accountHolder = accountHolder;
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.branch = branch;
		this.currency = currency;
	}

	public AccountHolder getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(AccountHolder accountHolder) {
		this.accountHolder = accountHolder;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
}
