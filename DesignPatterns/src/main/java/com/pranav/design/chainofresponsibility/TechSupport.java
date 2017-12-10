package com.pranav.design.chainofresponsibility;

public class TechSupport implements Support {

	private String request;
	private String description;
	private RequestLevel level;
	
	public void setSupportRequest(String request) {
		this.request = request;
	}

	public String getSupportRequest() {
		return this.request;
	}

	public void setSupportDescription(String desc) {
		this.description = desc;
	}

	public String getSupportDescription() {
		return this.description;
	}
	
	public RequestLevel getLevel() {
		return this.level;
	}

	public void setLevel(RequestLevel level) {
		this.level = level;
	}


}
