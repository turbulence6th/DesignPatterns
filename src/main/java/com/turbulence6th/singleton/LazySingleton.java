package com.turbulence6th.singleton;

public class LazySingleton {

	public static LazySingleton getInstance() {
		if(instance == null) {
			instance = new LazySingleton();
		}
		
		return instance;
	}
	
	private static LazySingleton instance;
	
	private LazySingleton() {
		
	}
	
}
