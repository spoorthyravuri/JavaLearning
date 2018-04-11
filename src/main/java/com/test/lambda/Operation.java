package com.test.lambda;

import java.util.List;
import java.util.function.Predicate;

@FunctionalInterface
public interface Operation<T> {
	
	public void perform(List<T> persons, Predicate<T> con);
	
}
