package com.pranav.design.builder;

public class Cake {

	private String suger;
	private String butter;
	private String agg;
	private String cherry;
	
	public Cake(Builder builder){
		
		this.suger = builder.suger;
		this.butter = builder.butter;
		this.agg = builder.agg;
		this.cherry = builder.cherry;
	}
	
	@Override
	public String toString() {
		return "suger: " + suger + " butter: " + butter + " agg: " + agg + " cherry: " + cherry;
	}
}
