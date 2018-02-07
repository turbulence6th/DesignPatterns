package com.turbulence6th.facade;

import org.junit.Test;

public class FacadeTest {

	@Test
	public void testFacade() {
		Facade facade = new Facade();
		facade.callOne();
		facade.callTwo();
		facade.callThree();
	}
	
}
