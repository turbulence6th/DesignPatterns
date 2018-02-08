package com.turbulence6th.prototype;

public class Harry implements Person {

	private static final String NAME = "Harry";
	
	@Override
	public Person clonePerson() {
		return new Harry();
	}
	
	@Override
	public String toString() {
		return NAME;
	}

}
