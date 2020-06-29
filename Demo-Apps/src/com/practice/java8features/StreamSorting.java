package com.practice.java8features;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l = new ArrayList<Integer> ();
		l.add(15);
		l.add(1);
		l.add(0);
		l.add(35);
		l.add(75);
		l.add(5);
		System.out.println("Before Sorting" + l);
		
		List<Integer> list = l.stream().sorted((i1,i2) -> i1>i2 ? -1 : 1).collect(Collectors.toList());
		System.out.println(list);

	}

}
