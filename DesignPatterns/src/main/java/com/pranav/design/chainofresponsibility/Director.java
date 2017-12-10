package com.pranav.design.chainofresponsibility;

public class Director implements RequestHandler {
	RequestHandler next;
	Support request;

	public Director(Support request) {
		this.request = request;
		next = null;
	}

	public RequestHandler getNextSupport() {
		return next;
	}

	public void handleRequest() {
		System.out.println(this.getClass().getSimpleName() + " is handling your request.");
		if (request.getLevel().getLevel() == RequestLevel.LEVEL_THREE) {
			System.out.println(this.getClass().getSimpleName() + " has handled your request. Thank you.");
		} else {
			System.out.println("We are sorry, your request is not valid OR we are not in position to server it.");
		}
	}
}
