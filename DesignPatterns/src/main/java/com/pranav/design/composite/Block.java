package com.pranav.design.composite;

public class Block implements Group{

	private String nm;
	public Block(String nm) {
		this.nm = nm;
	}
	
	public void assemble() {
		System.out.println("Block " + nm);
	}

}
