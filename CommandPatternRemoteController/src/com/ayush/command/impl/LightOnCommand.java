package com.ayush.command.impl;

import com.ayush.command.Command;
import com.ayush.reciever.Light;

public class LightOnCommand implements Command{

	private Light light;
	
	
	
	public LightOnCommand(Light light) {
		this.light = light;
	}



	@Override
	public void execute() {
		light.on();
	}

}
