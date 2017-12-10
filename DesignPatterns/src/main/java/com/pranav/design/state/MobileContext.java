package com.pranav.design.state;

public class MobileContext {

	private MobileState state;

	public MobileContext() {
		this.state = new Vibrate();
	}

	public void setAlertContext(MobileState state) {
		this.state = state;
	}

	public void alert() {
		state.alert();
	}
}
