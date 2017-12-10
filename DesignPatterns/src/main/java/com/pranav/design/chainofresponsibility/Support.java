package com.pranav.design.chainofresponsibility;

public interface Support {
	void setSupportRequest(String request);
	String getSupportRequest();
	void setSupportDescription(String desc);
	String getSupportDescription();
	public RequestLevel getLevel();
	public void setLevel(RequestLevel level);

}
