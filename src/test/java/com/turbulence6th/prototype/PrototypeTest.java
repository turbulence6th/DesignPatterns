package com.turbulence6th.prototype;

import org.junit.Test;

public class PrototypeTest {

	@Test
	public void testPrototype() {
		
		Person tom = PersonFactory.getPerson("Tom");
		System.out.println(tom);
		
		Person harry = PersonFactory.getPerson("Harry");
		System.out.println(harry);
		
		Person lisa = PersonFactory.getPerson("Lisa");
		System.out.println(lisa);
		
	}
	
}
