package com.ayush.command.impl;

import com.ayush.command.Command;
import com.ayush.reciever.Stereo;

public class StereoOnWithCd implements Command {

	private Stereo stereo;
	
	
	public StereoOnWithCd(Stereo stereo) {
		super();
		this.stereo = stereo;
	}


	@Override
	public void execute() {
		stereo.on();
		stereo.setCd("Linkin Park");
		stereo.setVolume(11);
	}

}
