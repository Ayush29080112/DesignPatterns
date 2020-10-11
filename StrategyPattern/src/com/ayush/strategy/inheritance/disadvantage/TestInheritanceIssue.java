package com.ayush.strategy.inheritance.disadvantage;

public class TestInheritanceIssue {

	
	public static void main(String[] args) {
		MalardDuck malardDuck = new MalardDuck();
		malardDuck.swim();
		
		// Try uncommenting this after uncommenting the duck class fly method
//		malardDuck.fly();
		
		RubberDuck duck = new RubberDuck();
		duck.swim();
		// Try uncommenting this after uncommenting the duck class fly method. the strange thing is though rubber duck can't fly
		//just by adding fly method to parent class, child automatically gets inherits this feature.
//		duck.fly();
	}
}
