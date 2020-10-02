package com.ayush.reciever;

public class Stereo {
	
	public void on() {
		System.out.println("Stereo is On");
	}
	
	public void setCd(String album) {
		System.out.println("Playing "+ album);
	}
	public void setVolume(int volume) {
		System.out.println("Volume is set to "+ volume);
	}

	public void off() {
		System.out.println("Stereo is Off");
		
	}

}
