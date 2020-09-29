package com.ayush.design.pattern;

import java.util.Map;

public interface Observer<K, V> {

	public void update(Subject s, Map<K,V> args);
	public boolean isPushEnabled();
}
