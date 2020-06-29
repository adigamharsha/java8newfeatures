package com.practice.java8features;

public class MethidReferenceDemo {
	public void m2() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("In child Thread ::");
		}
	}

	public static void main(String[] args) {
		Runnable r = new MethidReferenceDemo()::m2;
		Thread t = new Thread(r);
		t.start();
		for (int i = 1; i <= 5; i++) {
			System.out.println("In main Thread ::");
		}

	}

}
