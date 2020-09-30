package com.ayush.singleton.pattern;

public class SingletonObject {
	
	private static SingletonObject singletonObject;
	
	private SingletonObject() {
		//Setting it to private so that we can restrict the creation of object
		//TO prevent it to be invoked using reflection we can throw exception from this constructor
	}
	
	public static SingletonObject getInstance() {
		
		if(null == singletonObject) {
			singletonObject = new SingletonObject();
		}
		return singletonObject;
	}

}
