package com.practice.java8features;
import java.util.HashMap;
import java.util.Map;

public class Numberoccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arrayNos[] = { 1, 4, 5, 17, 9, 10, 2, 4, 4, 7, 12, 17 };
		Map<Integer, Integer> nosmap = new HashMap<Integer, Integer>();
		for (int x : arrayNos) {
			if (!nosmap.containsKey(x)) {
				nosmap.put(x, 1);
			} else {
				Integer count = nosmap.get(x);
				nosmap.put(x, ++count);
			}
		}
		System.out.println(nosmap);
	}
}
