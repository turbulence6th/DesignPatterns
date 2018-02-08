package com.turbulence6th.iterator;

public class IntWrapper {

	private int[] ints;
	
	public IntWrapper(int[] ints) {
		this.ints = ints;
	}
	
	public Iterator iterator() {
		return new Iterator();
	}
	
	public class Iterator {
	
		int index = 0;
		
		public int next() {
			return ints[index++];
		}
		
		public boolean hasNext() {
			return index < ints.length;
		}
		
	}
	
}
