package com.practice.java8features;
import java.util.HashMap;
import java.util.Map;

public class DuplicateFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array [] = { 2 , 4 , 6 , 9 , 6 , 8 , 4  ,9 , 1 ,6 , 8 , 4, 2} ;
		Map<Integer , Integer> mapCount =  new HashMap<Integer , Integer> ();
		Map<Integer , Integer> duplicatemapCount =  new HashMap<Integer , Integer> ();
		
		for( int i :array) {
			if(!mapCount.containsKey(i)) {
				mapCount.put(i, 1);				
			}else {
				Integer integer = mapCount.get(i);
				Integer integer2 = (duplicatemapCount.containsKey(i))  ? duplicatemapCount.get(i) : 1 ;
				duplicatemapCount.put(i, 1+integer2);
			}
		}
		System.out.println("Duplicate keys are :: "+ duplicatemapCount);

	}

}
