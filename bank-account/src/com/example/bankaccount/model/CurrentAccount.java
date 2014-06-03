package com.example.bankaccount.model;

import java.math.BigDecimal;

public class CurrentAccount extends BankAccount{
	private CheckbookSeries checkbookSeries;
	
	public CurrentAccount() {
		super();
	}
	
	public CurrentAccount(AccountHolder accountHolder, BigDecimal balance, String accountNumber, String branch, String currency, CheckbookSeries checkbookSeries) {
		super(accountHolder, balance, accountNumber, branch, currency);
		this.checkbookSeries = checkbookSeries;
	}

	public CurrentAccount(CheckbookSeries checkbookSeries) {
		super();
		this.checkbookSeries = checkbookSeries;
	}

	public CheckbookSeries getCheckbookSeries() {
		return checkbookSeries;
	}

	public void setCheckbookSeries(CheckbookSeries checkbookSeries) {
		this.checkbookSeries = checkbookSeries;
	}
	
	
}
