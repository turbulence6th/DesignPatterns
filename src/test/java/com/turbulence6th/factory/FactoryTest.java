package com.turbulence6th.factory;

import org.junit.Assert;
import org.junit.Test;

import com.turbulence6th.factory.CarFactory;
import com.turbulence6th.factory.Hatchbag;
import com.turbulence6th.factory.Sedan;
import com.turbulence6th.factory.Suv;

public class FactoryTest {

	@Test
    public void equalsReturnType() {
		Assert.assertEquals(Sedan.class, CarFactory.getCar("sedan").getClass());
		Assert.assertEquals(Hatchbag.class, CarFactory.getCar("hatchbag").getClass());
		Assert.assertEquals(Suv.class, CarFactory.getCar("suv").getClass());
    }
	
}

