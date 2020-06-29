package com.practice.java8features;
import java.util.function.Function;

public class FunctionJoining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Harshasowjanya";
		
		Function<String , String> f1= (s) -> s.toUpperCase();
		Function<String , String> f2 = (s) -> s.substring(0, 7);
		
		System.out.println(f1.apply(str));
		System.out.println(f2.apply(str));
		System.out.println(f1.andThen(f2).apply(str));
		System.out.println(f1.compose(f2).apply(str));

	}

}
