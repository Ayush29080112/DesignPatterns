package com.ayush.strategy.interfac.disadvantage;

public class TestInterfaceIssue {

	
	public static void main(String[] args) {
		MalardDuck malardDuck = new MalardDuck();
		malardDuck.swim();
		
		// Try uncommenting this after uncommenting the duck class fly method
		malardDuck.fly();
		
		RubberDuck duck = new RubberDuck();
		duck.swim();
		// Try uncommenting this after uncommenting the duck class fly method. 
		duck.fly();
		
		/// Issue with this approach is that when we try and go ahead with this approach this may lead to code duplication
		//in case multiple ducks have same fly behaviour.. also if we have to update one fly behaviour 
		//we actually will be required to update methods in all the classes having similar behaviour
	}
}
