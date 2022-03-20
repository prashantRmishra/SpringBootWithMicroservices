package com.prashant.microservices.bean;

public class Limits {
	private int minimum;
	private int maximum;
	//generating no argument and parameterized constructors
	public Limits() {
	}
	
	public Limits(int min,int max) {
		this.minimum = min;
		this.maximum = max;
	}
	//creating getters and setters
	public int getMinimun() {
		return minimum;
	}
	public void setMinimun(int minimun) {
		this.minimum = minimun;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	

}
