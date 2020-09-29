package com.ayush.design.pattern.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ayush.design.pattern.Observer;
import com.ayush.design.pattern.Subject;

public class ConcreteSubject implements Subject{

	private List<Observer<Object, Object>> observers = new ArrayList<Observer<Object,Object>>();
	private boolean changed = false;
	private float humidity;
	private float temp;
	private float pressure;
	private Map<Object, Object> args;
	
	{
		args = new HashMap<Object, Object>();
		args.put("temp", temp);
		args.put("humidity", humidity);
		args.put("pressure",pressure);
	}
	
	
	
	public ConcreteSubject(float humidity, float temp, float pressure) {
		super();
		this.humidity = humidity;
		this.temp = temp;
		this.pressure = pressure;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		setChanged();
		this.humidity = humidity;
		args.put("humidity", humidity);
		notifyObservers(args);
	}

	public float getTemp() {
		return temp;
	}

	public void setTemp(float temp) {
		setChanged();
		this.temp = temp;
		args.put("temp", temp);
		notifyObservers(args);
	}

	public float getPressure() {
		return pressure;
	}

	
	public void setPressure(float pressure) {
		setChanged();
		this.pressure = pressure;
		args.put("pressure",pressure);
		notifyObservers(args);
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
		
	}

	@Override
	public void unRegisterObserver(Observer o) {
		observers.remove(o);
		
	}

	
	//This version of notify Observer to be called in case you want to push the data 
	@Override
	public void notifyObservers(Map<Object, Object> args) {
		if(changed) {
			for (Observer<Object, Object> observer : observers) {
				if(observer.isPushEnabled()) {
					observer.update(null, args);
				}else {
					observer.update(this, null);
				}
			}
		}
		
	}

	@Override
	public void setChanged() {
		changed = true;
		
	}


}
