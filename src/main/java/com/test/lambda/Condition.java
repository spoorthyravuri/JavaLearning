package com.test.lambda;

@FunctionalInterface
public interface Condition<T> {

	public boolean test(T t);
	
}
