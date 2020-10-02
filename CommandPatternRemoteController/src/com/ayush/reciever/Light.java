package com.ayush.reciever;

public class Light {
	
	private String location;
	
	public Light(String location) {
		this.location = location;
	}
	
	public void on() {
		System.out.println("Switch On lights of "+ location);
	}
	
	public void off() {
		System.out.println("Switch Off lights of "+ location);
	}

}
