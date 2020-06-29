package com.practice.java8features;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputString = "Corona virus is destructing the entire country. this corona virus is really dangerous";
		Map<String, Integer> wordCountMap = new HashMap<String, Integer>();
		String input = inputString.toLowerCase();

		int count = 1;

		String word[] = input.split(" ");
		for (String s : word) {
			if (!wordCountMap.containsKey(s)) {
				wordCountMap.put(s, count);
			} else {
				Integer integer = wordCountMap.get(s);
				wordCountMap.put(s, integer + count);
			}
		}
		System.out.println(wordCountMap);
	}

}
