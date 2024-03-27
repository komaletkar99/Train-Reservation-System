package com.train.booking;

import java.util.LinkedList;
import java.util.List;

public class TickitService {
private static List<Ticket> allTicket=new LinkedList<>();
	
	public static void addNewTicket(int trainNumber,List<passengerDetail> passenger) {
		
		int pnr=allTicket.size()+1;
		
		Train findTrain = TrainService.findTrain(trainNumber);
		
		allTicket.add(new Ticket(pnr, findTrain, passenger));
		
		System.out.println("Ticket Booked Successfully...");
		
	}
	
	public static void showTicketDetails(int pnr) {
		Ticket tempTicket=null;
		
		for(Ticket t:allTicket) {
			if(t.getPnrno()==pnr) {
				tempTicket=t;
			}
		}
		System.out.println(tempTicket.getPnrno());
		System.out.println(tempTicket.getBoockedTrain());
		System.out.println(tempTicket.getPassengerList());
		
	}
	

}
