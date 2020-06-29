package com.practice.java8features;
import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Supplier<Date> s = () -> new Date();
		System.out.println(s.get());

		// to generate random name
		Supplier<String> s1 = () -> {
			String[] ar = { "Harsha", "Kiran", "Hanshal", "Sowji" };
			double random = Math.random();
			System.out.println("Random number Generated ::" + random + "  After multiplied ::: " + random * ar.length);
			int x = (int) (random * ar.length);
			return ar[x];
		};

		// Generate six digit OTP.
		Supplier<String> s2 = () -> {
			String otp = "";
			for (int i = 0; i < 6; i++) {
				otp += (int) (Math.random() * 10);
			}
			return otp;
		};
		System.out.println(s1.get());

		// Supplier to generate random number
		Supplier<Integer> s3 = () -> (int) (Math.random() * 10);

		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";

		// Supplier to pick random character from upper String
		Supplier<Character> s4 = () -> str.charAt((int) (Math.random() * 29));

		// String string = "";

		// Supplier to generate Random Password with characters in Odd places and number in even places
		Supplier<String> passwordGenerator = () -> {
			String string = "";
			for (int i = 1; i <= 8; i++) {
				if (i % 2 == 0)	string += s3.get();	else string += s4.get();
			}
			return string;
		};
		System.out.println(passwordGenerator.get());
	}

}
