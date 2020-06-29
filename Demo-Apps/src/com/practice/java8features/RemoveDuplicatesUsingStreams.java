package com.practice.java8features;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesUsingStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names = Arrays.asList("Harsha", "Kiran", "hyderabad", "Harsha");

		List<String> uniqueNames = new ArrayList<String>();
		for (String name : names) {
			if (!uniqueNames.contains(name)) {
				uniqueNames.add(name);
			}
		}
		System.out.println("Unique Names using Traditinal Approach ::" + uniqueNames);

		// In Java 8 using Streams //
		List<String> collectNames = names.stream().distinct().collect(Collectors.toList());
		System.out.println("Unique Names in Java 8 using Streams" + collectNames);
	}

}
