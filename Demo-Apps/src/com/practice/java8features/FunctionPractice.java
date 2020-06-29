package com.practice.java8features;
import java.util.function.Function;

public class FunctionPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Google is a good company";
		
		Function<String , String> f = (s) -> s.replaceAll(" ","");
		
		System.out.println(f.apply(str));

	}

}
