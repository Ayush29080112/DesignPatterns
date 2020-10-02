package com.ayush.command.impl;

import com.ayush.command.Command;

public class NoCommand  implements Command{

	@Override
	public void execute() {
		System.out.println("I do nothing!!!. I am lazy AF!!!!");
	}

	
}
