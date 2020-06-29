package com.practice.java8features;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorSorting {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<Integer>();
		l.add(15);
		l.add(1);
		l.add(0);
		l.add(35);
		l.add(75);
		l.add(5);
		System.out.println("Before Sorting" + l);
		Collections.sort(l); // Natural order Sorting
		System.out.println("Natural Order Sorting :: " + l);

		// Sorting without lambda Expressions
		Collections.sort(l, new Comparator<Integer>() {
			public int compare(Integer i1, Integer i2) {
				return (i1 > i2) ? -1 : (i1 < i2) ? +1 : 0; // if(i1> i2) return -1;else if(i1<i2) return +1;else return
															// 0;
			}
		});
		System.out.println("Descending Order Sorting :: " + l);

		// Sorting with lambda Expressions
		Collections.sort(l, (I1, I2) -> (I1 > I2) ? -1 : (I1 < I2) ? +1 : 0);
		System.out.println("Descending Order Sorting using Lambda Expressions :: " + l);

	}

}
