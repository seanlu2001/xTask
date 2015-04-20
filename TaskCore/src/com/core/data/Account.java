package com.core.data;

public class Account {

	protected String mAccountName;
	protected double mAmount;
	protected int mAccountType;
	
	public Account(String AccountName, int AccountType, double Amount){
		this.mAccountName = AccountName;
		this.mAccountType = AccountType;
		this.mAmount = Amount;
	}

	public int getAccountType() {
		return mAccountType;
	}

	public void setAccountType(int AccountType) {
		mAccountType = AccountType;
	}

	public void setAccountName(String AccountName){
		mAccountName = AccountName;
	}
	
	public String getAccountName(){
		return mAccountName;
	}
	
	public void setAmount(double Amount){
		mAmount = Amount;
	}
	
	public double getAmount(){
		return mAmount;
	}
	
}
