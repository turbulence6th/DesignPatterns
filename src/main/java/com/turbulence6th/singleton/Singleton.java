package com.turbulence6th.singleton;

public class Singleton {

	public static Singleton getInstance() {
		return instance;
	}
	
	private static Singleton instance = new Singleton();
	
	private Singleton() {
		
	}
	
}
