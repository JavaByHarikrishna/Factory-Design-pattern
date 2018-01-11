package com.basant.design.pattern;

public class OlaFactory {

	public static OlaCab getInstance() {
		Notification notification = new Notification();
		Payment payment = new Payment(notification);
		Trip trip = new Trip(payment);
		OlaCab cab = new OlaCab(trip);
		return cab;
	}

}
