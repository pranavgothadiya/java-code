package com.pranav.design.state;

public class TestState {

	public static void main(String[] args) {
		MobileContext context = new MobileContext();
		context.alert();
		context.setAlertContext(new Silent());
		context.alert();
		context.setAlertContext(new Vibrate());
		context.alert();
		
	}
}
