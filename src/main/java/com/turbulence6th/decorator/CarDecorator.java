package com.turbulence6th.decorator;

public abstract class CarDecorator implements Car {
	
	private Car car;
	
	public CarDecorator(Car car) {
		this.car = car;
	}

	@Override
	public void assemble() {
		this.car.assemble();
	}

}
