package com.Cab;

import java.time.LocalDate;
import java.util.Scanner;

public class OlaBooking {

	public static void main(String[] args) {
		 
		                         //LOGIN PAGE//
		
		System.out.println("****************LOGIN PAGE*******************");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the  Mobile No:");
		String mobileno = input.nextLine();
        Login.mobileno(mobileno);
        
        String password;
        System.out.println("Enter the Password:");
		password=input.nextLine();
		Login.password(password);
		
		
		                         //CAB TYPES//
		
		String Mini,Micro,Prime;
		System.out.println("Select the Car: 1.Mini,2.Micro,3.Prime:");
	    String cabName= input.nextLine();
	    Cabtype.cabName(cabName);
	    
	    
	                             //CALCULATE AMOUNT//
	    
		System.out.println("Enter the NoOfKm: ");
		int noofkm = input.nextInt();
		int pricePerKm = 10;
		int amount = noofkm * pricePerKm;
		Bill.amount(amount);
		
		                          //CALCULATE GST//
		
		float gst = (amount*7)/100;
		float gstbill = gst + amount;
		Gst.gstbill(gstbill, gst);
		    
		                        //BOOKING DATE AND TIME//
		DateTime.date();
		
		                         //PEAK HOURS//
		
		peak.hours();
		
		                         //SENIOR CITIZEN//
		senior.citizen();
		System.out.println("Thank You for Your Booking....");
	}

}
