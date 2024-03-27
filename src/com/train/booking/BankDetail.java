package com.train.booking;

public class BankDetail {
	private int AccNo;
	private int accBalane;
	
	public int getAccNo() {
		return AccNo;
	}
	public void setAccNo(int accNo) {
		AccNo = accNo;
	}
	public double getAccBalane() {
		return accBalane;
	}
	public void setAccBalane(int accBalane) {
		this.accBalane = accBalane;
	}
	
	public BankDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankDetail(int accNo, int accBalane) {
		super();
		AccNo = accNo;
		this.accBalane = accBalane;
	}
	@Override
	public String toString() {
		return "BankDetail [AccNo=" + AccNo + ", accBalane=" + accBalane + "]";
	}
	
	
	public int withDrawAmount(int amount) {
		accBalane -= amount;
		return accBalane;
	}
	
	public int depositeAmount(int amount) {
		accBalane += amount;
		
		return accBalane;
	}

	public void showBalance() {
		System.out.println("Available amount is : " + accBalane);
	}
}
