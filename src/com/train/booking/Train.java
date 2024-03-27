package com.train.booking;

import java.time.LocalDate;
import java.util.Date;

public class Train {

	private int trainNumber;
	private String trainName;
	private String fromStation;
	private String toStation;
	private int availableSeats;
	private int fare;
	private LocalDate doj;
	
	
	public int getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getFromStation() {
		return fromStation;
	}
	public void setFromStation(String fromStation) {
		this.fromStation = fromStation;
	}
	public String getToStation() {
		return toStation;
	}
	public void setToStation(String toStation) {
		this.toStation = toStation;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	public int getFare() {
		return fare;
	}
	public void setFare(int fare) {
		this.fare = fare;
	}
	public LocalDate getDate() {
		return doj;
	}
	public void setDate(LocalDate date) {
		this.doj = date;
	}
	public Train(int trainNumber, String trainName, String fromStation, String toStation, int availableSeats, int fare,
			LocalDate date) {
		super();
		this.trainNumber = trainNumber;
		this.trainName = trainName;
		this.fromStation = fromStation;
		this.toStation = toStation;
		this.availableSeats = availableSeats;
		this.fare = fare;
		this.doj = date;
	}
	
	public Train() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Train [trainNumber=" + trainNumber + ", trainName=" + trainName + ", fromStation=" + fromStation
				+ ", toStation=" + toStation + ", availableSeats=" + availableSeats + ", fare=" + fare + ", date="
				+ doj + "]";
	}
	
	
	
}
