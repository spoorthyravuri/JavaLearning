package com.test.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Excercise1 {
	
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
				new Person("x", "y", 5),
				new Person("r", "s", 12),
				new Person("a", "c", 3),
				new Person("m", "n", 13)
				); 
		
		// Java 7
		/*Collections.sort(persons, new Comparator<Person>() {
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		System.out.println(persons);*/
		
		// Java 8
		Collections.sort(persons, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));
		System.out.println(persons);
		
		Predicate<Person> condition = per -> true;
		
		BiConsumer<List<Person>, Predicate<Person>> printingOperation = (pers, con) -> {
			for (Person person : persons) {
				if(con.test(person)) {
					System.out.println(person);
				}
			}
		};
		printingOperation.accept(persons, condition);
		
		Predicate<Person> cCondition = per -> (per.getLastName().contains("c") ? true : false );
		
		printingOperation.accept(persons, cCondition);
		
	}
	
}