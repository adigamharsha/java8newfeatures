package com.practice.java8features;
import java.util.function.Predicate;

public class Predicatepractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Predicate for Integer
		Predicate<Integer> p = (I) -> I>10;
		System.out.println(p.test(12));
		
		Predicate<String> ps = (s) -> s.length()>5;
		System.out.println(ps.test("hello  sir"));

	}

}
