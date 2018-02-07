package com.turbulence6th.proxy;

import org.junit.Test;

public class ProxyTest {

	@Test
	public void testProxy() {
		Image realImage = new RealImage("test.png");
		realImage.display();
		
		Image proxyImage = new ProxyImage("test2.png");
		proxyImage.display();
	}
	
}
