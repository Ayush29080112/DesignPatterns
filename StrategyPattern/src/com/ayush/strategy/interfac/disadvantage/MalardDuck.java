package com.ayush.strategy.interfac.disadvantage;

public class MalardDuck extends Duck implements Flyable{
	
	public void swim() {
		System.out.println("I am also a Duck, I also swim!!!");
	}

	@Override
	public void fly() {
		System.out.println("I also know how to fly!!!");
	}

}
