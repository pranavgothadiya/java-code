package com.pranav.design.chainofresponsibility;

public interface RequestHandler {

	RequestHandler getNextSupport();
	void handleRequest();
}
