package com.turbulence6th.template;

import org.junit.Test;

public class TemplateTest {

	@Test
	public void testTemplate() {
		Game basketball = new Basketball();
		basketball.play();
		Game football = new Football();
		football.play();
	}
	
}
