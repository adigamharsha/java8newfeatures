package com.practice.java8features;
import java.util.stream.IntStream;

public class Java7vsJava8 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		int total =0;
		
		// Until Java 8  //
		for(int i =0 ; i<=50 ; i++) {
			total +=i;
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Total Before Java 8 ::"+total + " Time taken in ms ::"+(endTime-startTime));
		
		// From Java 8 using STreams //
		long startTimeinJava8 = System.currentTimeMillis();
		int totalInJava8 = IntStream.rangeClosed(0,50).map(Integer :: new).sum();
		long endTimeinJava8 = System.currentTimeMillis();
		System.out.println("Total in Java 8 ::"+totalInJava8+ " Time taken in ms ::"+(endTimeinJava8-startTimeinJava8));

	}

}
