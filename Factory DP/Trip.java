package com.basant.design.pattern;

import java.util.Date;

public class Trip {
	
	private Payment payment;
	

	public Trip(Payment payment) {
		this.payment = payment;
	}


	public void trip() {
		System.out.println("Trip Starts : " + new Date().toString());
		payment.pay();
	}
}
