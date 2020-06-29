package com.practice.java8features;

public class ExecutionTime {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int j = 99999999;
		int value = 100000000;
		boolean isEven = value % 2 == 0;
		int count =0;
		/*
		 * for (int i = 1; i <= 100000000; i++) { // for normal execution if (i == j) {
		 * System.out.println(i); } }
		 */
		if (isEven) {
			for (int i = 0; i <= value; i = i + 2) {
				count++;
				if (i == j) {
					System.out.println("Found after ::"+count+ " even iteration " );
				}
			}
		} else {
			for (int i = 1; i <= value; i = i + 2) {
				count++;
				if (i == j) {
					System.out.println("Found after ::"+count+ " odd iteration" );
				}
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Execution Time ::" + (endTime - startTime) + "ms");
	}
}
