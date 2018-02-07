package com.turbulence6th.decorator;

import org.junit.Test;

public class DecoratorTest {

	@Test
	public void testDecorator() {
		Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();
		
		System.out.println("**************");
		
		Car luxuryCar = new LuxuryCar(new SportsCar(new BasicCar()));
		luxuryCar.assemble();
	}
	
}
