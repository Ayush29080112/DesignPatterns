package com.ayush.design.pattern;

import java.util.Map;

public interface Subject {
	
	public void registerObserver(Observer o);
	public void unRegisterObserver(Observer o);

	public void setChanged();
	void notifyObservers(Map<Object, Object> args);
}
