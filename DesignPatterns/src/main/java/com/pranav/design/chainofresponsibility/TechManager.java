package com.pranav.design.chainofresponsibility;

public class TechManager implements RequestHandler {
	RequestHandler next;
	Support request;

	public TechManager(Support request) {
		this.request = request;
		next = new Director(request);
	}

	public RequestHandler getNextSupport() {
		return next;
	}

	public void handleRequest() {
		System.out.println(this.getClass().getSimpleName() + " is handling your request.");
		if (request.getLevel().getLevel() == RequestLevel.LEVEL_TWO) {
			System.out.println(this.getClass().getSimpleName() + " has handled your request. Thank you.");
		} else {
			System.out.println(this.getClass().getSimpleName() + " has forwared your request to " + next.getClass().getSimpleName());
			next.handleRequest();
		}
	}
}
