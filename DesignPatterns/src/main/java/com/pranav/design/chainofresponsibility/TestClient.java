package com.pranav.design.chainofresponsibility;

public class TestClient {

	public static void main(String[] args) {
		// Create tech support request
		TechSupport techRequest = new TechSupport();
		techRequest.setSupportRequest("Compiter crashed");
		techRequest.setSupportDescription("Computer crashe while rebooting with blue screen");
		techRequest.setLevel(new RequestLevel(RequestLevel.LEVEL_THREE));
		//techRequest.setLevel(new RequestLevel(5));
		
		// Call for the support
		RequestHandler support = new Receptionist(techRequest);
		support.handleRequest();
	}
}
