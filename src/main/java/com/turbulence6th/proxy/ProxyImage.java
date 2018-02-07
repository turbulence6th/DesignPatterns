package com.turbulence6th.proxy;

public class ProxyImage implements Image {
	
	private String filename;
	
	private Image image;
	
	public ProxyImage(String filename) {
		this.filename = filename;
	}

	@Override
	public void display() {
		if(image == null) {
			image = new RealImage(this.filename);
		}
		
		image.display();
	}
	
}
