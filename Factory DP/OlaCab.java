package com.basant.design.pattern;

public class OlaCab {

	private Trip trip;

	public OlaCab(Trip trip) {
		this.trip = trip;
	}

	public void bookCab(String name, String source, String destination) {
		System.out.println("booking information:---");
		System.out.println("Hi " + name + " booking confirmed  From " + source + " to " + destination);
		trip.trip();
	}
}
