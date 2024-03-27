package com.train.booking;

import java.util.List;

public class Ticket {
	private int pnrno;
	private Train boockedTrain;
	private List<passengerDetail> passengerList;

	public int getPnrno() {
		return pnrno;
	}

	public void setPnrno(int pnrno) {
		this.pnrno = pnrno;
	}

	public Train getBoockedTrain() {
		return boockedTrain;
	}

	public void setBoockedTrain(Train boockedTrain) {
		this.boockedTrain = boockedTrain;
	}

	public List<passengerDetail> getPassengerList() {
		return passengerList;
	}

	public void setPassengerList(List<passengerDetail> passengerList) {
		this.passengerList = passengerList;
	}

	@Override
	public String toString() {
		return "Ticket [pnrno=" + pnrno + ", boockedTrain=" + boockedTrain + ", passengerList=" + passengerList + "]";
	}

	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ticket(int pnrno, Train boockedTrain, List<passengerDetail> passengerList) {
		super();
		this.pnrno = pnrno;
		this.boockedTrain = boockedTrain;
		this.passengerList = passengerList;
	}

}
