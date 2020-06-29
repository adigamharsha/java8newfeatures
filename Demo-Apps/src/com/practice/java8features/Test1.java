package com.practice.java8features;


public class Test1{
	
	public static void main(String [] args) {
		Runnable r = () -> {
			for(int i=0 ; i<=10 ; i++) {
				System.out.println("In Runnable Thread");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		
		for(int i=0 ; i<=10; i++) {
			System.out.println("In main thread");
		}
	}
	
}
