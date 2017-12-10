package com.pranav.design.chainofresponsibility;

public class RequestLevel {

	public static final int LEVEL_ONE = 1;
	public static final int LEVEL_TWO = 2;
	public static final int LEVEL_THREE = 3;

	private int level;
	
	public RequestLevel(int level) {
		this.level = level;
	}

	public int getLevel() {
		return level;
	}
}
