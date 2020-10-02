package com.ayush.command.impl;

import com.ayush.command.Command;
import com.ayush.reciever.Light;

public class LightOffCommand implements Command {
	
	private Light light;

	public LightOffCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}
	
	

}
