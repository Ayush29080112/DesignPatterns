package com.ayush.command.pattern;

public class GarageOpenCommand implements Command {
	
	private GarageDoor garage;

	
	public GarageOpenCommand(GarageDoor garage) {
		super();
		this.garage = garage;
	}


	@Override
	public void execute() {
		garage.up();

	}

}
