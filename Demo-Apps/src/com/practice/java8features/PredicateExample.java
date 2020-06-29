package com.practice.java8features;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = { "Sunny", "mallika", "Kajal", "Kareena", "Katrina" };

		Predicate<String> p = (name) -> name.startsWith("K");

		for (String name : names) {
			if (p.test(name)) {
				System.out.println(name);
			}
		}

	}
}
