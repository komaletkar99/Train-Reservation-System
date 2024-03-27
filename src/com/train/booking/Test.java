package com.train.booking;

import java.util.LinkedList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
//		TrainService.findTrain(104);
//		TrainService.BookFromToStation("pune", "nashik");
		BankDetail bankAccount = new BankDetail();
		bankAccount.setAccNo(4545);
		bankAccount.setAccBalane(9000);
		
		passengerDetail p1= new passengerDetail(101, "Amit", 23, null, bankAccount);
		passengerDetail p2= new passengerDetail(102, "Amol", 24, null, bankAccount);
		
		 List<passengerDetail> linkedList = new LinkedList<>();
		 linkedList.add(p1);
		 linkedList.add(p2);
		
		TrainService.booking(102, linkedList);
		TickitService.showTicketDetails(1);
		System.out.println("Acc Balance = "+bankAccount.getAccBalane());

	}

}
