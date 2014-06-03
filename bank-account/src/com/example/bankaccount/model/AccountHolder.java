package com.example.bankaccount.model;

public class AccountHolder {
	private String personalData;
	private String address;
	
	public AccountHolder() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public AccountHolder(String personalData, String address) {
		super();
		this.personalData = personalData;
		this.address = address;
	}
	
	public String getPersonalData() {
		return personalData;
	}
	public void setPersonalData(String personalData) {
		this.personalData = personalData;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
