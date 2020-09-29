package com.ayush.design.pattern.impl;

import java.util.Map;

import com.ayush.design.pattern.Observer;
import com.ayush.design.pattern.Subject;

public class ConcreteObserver implements Observer<Object, Object> {
	
	private Subject s ;
	private float temp;
	private float humidity;
	private final boolean pushEnabled = false;

	public ConcreteObserver(Subject s) {
		this.s = s;
		s.registerObserver(this);
	}
	@Override
	public void update(Subject s, Map<Object,Object> args) {
		if(!pushEnabled && s instanceof ConcreteSubject) {
			ConcreteSubject sub = (ConcreteSubject) s;
			if(temp != sub.getTemp()|| humidity!= sub.getHumidity()) {
				temp = sub.getTemp();
				humidity = sub.getHumidity();
				updatedValues();
			}
		}
	}
	private void updatedValues() {
		System.out.println("Temperature: "+temp +" Humidity: "+humidity);
	}
	@Override
	public boolean isPushEnabled() {
		return pushEnabled;
	}
	
	

}
