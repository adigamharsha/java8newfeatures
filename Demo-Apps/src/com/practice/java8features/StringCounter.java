package com.practice.java8features;
import java.util.HashMap;
import java.util.Map;

public class StringCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Character, Integer> stringMap = new HashMap<Character, Integer>();
		String word = "Google";

		char[] chars = word.toLowerCase().toCharArray();

		for (char c : chars) {
			if (!stringMap.containsKey(c)) {
				stringMap.put(c, 1);
			} else {
				Integer existingKey = stringMap.get(c);
				stringMap.put(c, ++existingKey);
			}
		}
		System.out.println(stringMap);
	}

}
