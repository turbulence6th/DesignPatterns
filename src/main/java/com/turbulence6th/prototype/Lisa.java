package com.turbulence6th.prototype;

public class Lisa implements Person {
	
	private static final String NAME = "Lisa";

	@Override
	public Person clonePerson() {
		return new Lisa();
	}
	
	@Override
	public String toString() {
		return NAME;
	}

}
