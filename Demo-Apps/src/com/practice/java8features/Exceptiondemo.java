package com.practice.java8features;

public class Exceptiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int i = 0;
			int j = 10 / i;
			System.out.println("In try Block");
//		} catch (Exception e) {
//			System.out.println("In Catch Block");
		}finally {
			System.out.println("In Finally Block");
		}
		System.out.println("Outside Block");
	}

}
