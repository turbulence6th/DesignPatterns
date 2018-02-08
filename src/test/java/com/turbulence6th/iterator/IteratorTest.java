package com.turbulence6th.iterator;

import org.junit.Test;

import com.turbulence6th.iterator.IntWrapper.Iterator;

public class IteratorTest {

	@Test
	public void testIterator() {
		
		IntWrapper intWrapper = new IntWrapper(new int[] {1, 3, 4, 5, 7, 8});
		
		Iterator iterator = intWrapper.iterator();
		
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		
		System.out.println();
		
	}
	
}
