package com.turbulence6th.proxy;

public class RealImage implements Image {
	
	private String filename;
	
	public RealImage(String filename) {
		this.filename = filename;
		loadFromDisk();
	}

	@Override
	public void display() {
		System.out.println(this.filename + " is displayed");
	}
	
	private void loadFromDisk() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(this.filename + " is loading from disk");
	}

}
