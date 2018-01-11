package com.basant.design.pattern;

public class User {
	public static void main(String[] args) {
		/*Notification notification = new Notification();
		Payment payment = new Payment(notification);
		Trip trip = new Trip(payment);
		OlaCab cab = new OlaCab(trip);
		cab.bookCab("Basanta", "Bangalore,Marathali", "Bangalore,BTM");*/
		OlaCab cab = OlaFactory.getInstance();
		cab.bookCab("Dileep", "Hyderabad,Ameerpet", "Hyderabad,begampet");
	}
}
