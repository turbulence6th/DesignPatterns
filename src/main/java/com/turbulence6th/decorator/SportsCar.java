package com.turbulence6th.decorator;

public class SportsCar extends CarDecorator {

	public SportsCar(Car car) {
		super(car);
	}
	
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Sports Car feature is added");
	}

}
