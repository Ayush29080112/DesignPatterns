package com.ayush.command.impl;

import com.ayush.command.Command;

public class MacroCommand implements Command {
	
	private Command[] comands;
	

	
	public MacroCommand(Command[] comands) {
		super();
		this.comands = comands;
	}



	@Override
	public void execute() {
		for (Command command : comands) {
			command.execute();
		}
	}

}
