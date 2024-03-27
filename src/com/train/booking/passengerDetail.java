package com.train.booking;

public class passengerDetail {
	private int passId;
	private String passengerName;
	private int assengeAge;
	private String passengerMoNumber;
	private BankDetail bankDetail;

	public int getPassId() {
		return passId;
	}

	public void setPassId(int passId) {
		this.passId = passId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public int getAssengeAge() {
		return assengeAge;
	}

	public void setAssengeAge(int assengeAge) {
		this.assengeAge = assengeAge;
	}

	public String getPassengerMoNumber() {
		return passengerMoNumber;
	}

	public void setPassengerMoNumber(String passengerMoNumber) {
		this.passengerMoNumber = passengerMoNumber;
	}

	public BankDetail getBankDetail() {
		return bankDetail;
	}

	public void setBankDetail(BankDetail bankDetail) {
		this.bankDetail = bankDetail;
	}

	@Override
	public String toString() {
		return "passengerDetail [passId=" + passId + ", passengerName=" + passengerName + ", assengeAge=" + assengeAge
				+ ", passengerMoNumber=" + passengerMoNumber + ", bankDetail=" + bankDetail + "]";
	}

	public passengerDetail(int passId, String passengerName, int assengeAge, String passengerMoNumber,
			BankDetail bankDetail) {
		super();
		this.passId = passId;
		this.passengerName = passengerName;
		this.assengeAge = assengeAge;
		this.passengerMoNumber = passengerMoNumber;
		this.bankDetail = bankDetail;
	}

	public passengerDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
