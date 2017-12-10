package com.pranav.design.builder;

public class Builder {

	public String suger;
	public String butter;
	public String agg;
	public String cherry;

	public Builder suger(String suger) {
		this.suger = suger;
		return this;
	}

	public Builder butter(String butter) {
		this.butter = butter;
		return this;
	}

	public Builder agg(String agg) {
		this.agg = agg;
		return this;
	}

	public Builder cherry(String cherry) {
		this.cherry = cherry;
		return this;
	}
	
	public Cake build(){
		return new Cake(this);
	}

}
