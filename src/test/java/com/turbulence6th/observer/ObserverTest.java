package com.turbulence6th.observer;

import org.junit.Test;

public class ObserverTest {

	@Test
	public void testObserver() {
		Subject subject = new Subject();
		new BinaryObserver(subject);
		new OctalObserver(subject);
		new HexaObserver(subject);
		
		subject.setState(15);
		subject.setState(10);
	}
	
}
