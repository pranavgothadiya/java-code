package com.pranav.design.chainofresponsibility;

public class Receptionist implements RequestHandler{

	RequestHandler next;
	Support request;
	
	public Receptionist(Support request) {
		this.request = request;
		next = new TechManager(request);
	}
	
	public RequestHandler getNextSupport() {
		return next;
	}

	public void handleRequest() {
		System.out.println(this.getClass().getSimpleName() + " is handling your request.");
		if(request.getLevel().getLevel() == RequestLevel.LEVEL_ONE){
			System.out.println(this.getClass().getSimpleName() + " has handled your request. Thank you.");
		} else {
			System.out.println(this.getClass().getSimpleName() + " has forwared your request to " + next.getClass().getSimpleName());
			next.handleRequest();
		}
	}

}
