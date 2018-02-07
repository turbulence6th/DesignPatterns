package com.turbulence6th.builder;

import org.junit.Assert;
import org.junit.Test;

public class BuilderTest {

	@Test
	public void testBuilder() {
		Table.Builder builder = Table.getBuilder();
		Table table = builder.setA(1).setB(2.3f).setC("Table Test").build();
		
		Assert.assertEquals(1, table.getA());
		Assert.assertEquals(2.3f, table.getB(), 0);
		Assert.assertEquals("Table Test", table.getC());
	}
	
}
