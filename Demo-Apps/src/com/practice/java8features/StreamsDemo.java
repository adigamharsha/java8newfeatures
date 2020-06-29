package com.practice.java8features;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(15);
		l.add(20);
		l.add(25);
		l.add(30);
		
		Integer[] arr1 = { 1, 5 , 10 , 15 , 19 , 25};

		System.out.println(l.stream().filter(i -> i % 2 == 0).collect(Collectors.toList()));

		List<Integer> collect = l.stream().map(i -> i).collect(Collectors.toList());
		System.out.println(collect);
		
		Integer min = l.stream().min((i1,i2) -> i1.compareTo(i2)).get(); // get min value of List
		System.out.println(min);
		
		Integer max = l.stream().max((i1,i2) -> i1.compareTo(i2)).get();
		
		System.out.println(max);
		
		Stream<Integer> intstream = Stream.of(arr1);
		//intstream.forEach(System.out::println);
		
		System.out.println(LocalDateTime.now());
		
		System.out.println(ZoneId.systemDefault());
		
	}

}
