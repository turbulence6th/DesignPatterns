package com.turbulence6th.factory;

public class CarFactory {

	public static Car getCar(String carType) {
		if(carType.equalsIgnoreCase("sedan")) {
			return new Sedan();
		}
		
		else if(carType.equalsIgnoreCase("hatchbag")) {
			return new Hatchbag();
		}
		
		else if(carType.equalsIgnoreCase("suv")) {
			return new Suv();
		}
		
		return null;
	}
	
}
