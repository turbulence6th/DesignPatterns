package com.turbulence6th.facade;

public class Facade {
	
	private SubSystemOne subSystemOne;
	
	private SubSystemTwo subSystemTwo;
	
	private SubSystemThree subSystemThree;
	
	public Facade() {
		this.subSystemOne = new SubSystemOne();
		this.subSystemTwo = new SubSystemTwo();
		this.subSystemThree = new SubSystemThree();
	}
	
	public void callOne() {
		this.subSystemOne.callOne();
	}
	
	public void callTwo() {
		this.subSystemTwo.callTwo();
	}
	
	public void callThree() {
		this.subSystemThree.callThree();
	}

}
