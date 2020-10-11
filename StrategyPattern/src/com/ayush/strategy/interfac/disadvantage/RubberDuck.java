package com.ayush.strategy.interfac.disadvantage;

public class RubberDuck extends Duck implements Flyable{
	
	public void swim() {
		System.out.println("I am a rubber toy duck and I also float");
	}

	@Override
	public void fly() {
		System.out.println("I am a rubber duck toy!!! I don't fly!!!");
		
	}

}
