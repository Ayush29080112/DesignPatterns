package com.ayush.command.impl;

import com.ayush.command.Command;
import com.ayush.reciever.Stereo;

public class StereoOffCommand implements Command {

	private Stereo stereo;
	
	
	public StereoOffCommand(Stereo stereo) {
		super();
		this.stereo = stereo;
	}


	@Override
	public void execute() {
		stereo.off();
	}

}
