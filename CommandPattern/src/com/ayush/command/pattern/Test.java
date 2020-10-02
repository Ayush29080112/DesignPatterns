package com.ayush.command.pattern;

public class Test {
	
	public static void main(String[] args) {
		SimpleRemoteControl control = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand command = new LightOnCommand(light);
		control.setCommand(command);
		control.buttonWasPressed();
		
		GarageDoor door= new GarageDoor();
		GarageOpenCommand doorOpenCommand = new GarageOpenCommand(door);
		control.setCommand(doorOpenCommand);
		control.buttonWasPressed();
	}

}
