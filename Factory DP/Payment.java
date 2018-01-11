package com.basant.design.pattern;

public class Payment {

	private Notification notification;

	public Payment(Notification notification) {
		this.notification = notification;
	}

	public void pay() {
		System.out.println("Payment successfully");
		notification.notify2User();
	}
}
