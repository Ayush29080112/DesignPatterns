package com.ayush.remote.controller;

import java.util.Arrays;

import com.ayush.command.Command;
import com.ayush.command.impl.NoCommand;

public class RemoteController {
	
	private Command[] onCommands;
	private Command[] offCommands;
	public RemoteController() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		Command command = new NoCommand();
		for(int i=0;i<7;i++) {
			onCommands[i] = command;
			offCommands[i] = command;
		}
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonPressed(int slot) {
		onCommands[slot].execute();
	}
	
	public void offButtonPressed(int slot) {
		offCommands[slot].execute();
	}

	@Override
	public String toString() {
		return "RemoteController [onCommands=" + Arrays.toString(onCommands) + ", offCommands="
				+ Arrays.toString(offCommands) + "]";
	}
	
	
	

}
