package com.pranav.design.adapter;


/**
 * Cylindrical Socket is available to use.
 */
class CylindricalSocket {

	// method which supplies power
	public String supply(String pin1, String pin2) {
		return "Pin1: " + pin1 + " Pin2: " + pin2;
	}
}

/**

 */
/**
 * This adaptor class adapts cylindrical socket. So that Rectangular Socket can be
 * pluged in Cylindrical Socket. 
 *  
 * @author Pranav_Gothadiya
 *
 */
class RectangularAdapter {
	CylindricalSocket socket;

	// Method which adapts CylindricalSocket to get power for RectangularSocket
	public String adapt(int iPin1, int iPin2) {

		// Some conversion logic
		String pin1 = "" + iPin1;
		String pin2 = "" + iPin2;
		
		// Call the cylinder socket
		socket = new CylindricalSocket();
		return socket.supply(pin1, pin2);
	}
}

public class RectagularSocket {

	int iPin1 = 10;
	int iPin2 = 20;

	private String getPower() {
		RectangularAdapter adapter = new RectangularAdapter();
		return adapter.adapt(iPin1, iPin2);
	}

	public static void main(String[] args) {

		RectagularSocket rectSocket = new RectagularSocket();
		String power = rectSocket.getPower();
		System.out.println(power);
	}
}

