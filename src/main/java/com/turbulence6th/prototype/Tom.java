package com.turbulence6th.prototype;

public class Tom implements Person {

	private static final String NAME = "Tom";
	
	@Override
	public Person clonePerson() {
		return new Tom();
	}
	
	@Override
	public String toString() {
		return NAME;
	}

}
