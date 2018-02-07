package com.turbulence6th.singleton;

public class LazyThreadSafeSingleton {

	public static LazyThreadSafeSingleton getInstance() {
		if(instance == null) {
			synchronized (LazyThreadSafeSingleton.class) {
				if(instance == null) {
					instance = new LazyThreadSafeSingleton();
				}
			}
		}
		
		return instance;
	}
	
	private static LazyThreadSafeSingleton instance;
	
	private LazyThreadSafeSingleton() {
		
	}
	
}
