package com.train.booking;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TrainService {
	private static List<Train> allTrain = new ArrayList<>();
	static{
		allTrain.add(new Train(101,"Train1","pune","nashik", 190,400, LocalDate.now()));
		allTrain.add(new Train(102,"Train2","mumbai","pune",150,200, LocalDate.now()));
		allTrain.add(new Train(103,"Train3","pune","nashik",100,250,LocalDate.now()));
		allTrain.add(new Train(104,"Train4","nashik","mumbai",90,300, LocalDate.now()));
		allTrain.add(new Train(105,"Train5","nashik","pune",50, 450, LocalDate.now()));
		allTrain.add(new Train(106,"Train6","nashik","CSMT",25,500, LocalDate.now()));
	}
	public static Train findTrain(int trainNum) {
	Train temp=null;
	for(Train ob : allTrain) {
	
	if(ob.getTrainNumber() == trainNum) {
		temp=ob;
		//System.out.println(temp);
		break;
	}
	}
	
	return temp;

}
	
	public static void BookFromToStation(String fromStation, String toStation) {
		LinkedList<Train> al = new LinkedList<>();
		for(Train t : allTrain) {
			if(t.getFromStation().equals(fromStation) && t.getToStation().equals(toStation)) {
				al.add(t);
				System.out.println(al);
			}
		}
		if(al.size()==0) {
			System.out.println("Not Found");
		}
	}
	
	public static void  booking(int trainNum, List<passengerDetail> passenger) {
		int numofSeats = passenger.size();
		 BankDetail bankDetail =passenger.get(0).getBankDetail();
		Train findTrain = findTrain(trainNum);
		 int fare = findTrain.getFare();
		 int totalFare = numofSeats * fare;
		
		
		bankDetail.withDrawAmount(totalFare);
		findTrain.setAvailableSeats(findTrain.getAvailableSeats()-numofSeats);
		
		TickitService.addNewTicket(trainNum, passenger);
		
	}
	
	
}
