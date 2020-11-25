package comharsha.javaadmirer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer input = Integer.parseInt(br.readLine());
		factorial(input);
	}

	private static int factorial(Integer input) {
		// TODO Auto-generated method stub
		int result = 1 ;
		while(input >= 2) {
			//result = input;
		//result += result * input; 
		System.out.println( input * factorial(input-1));
		return result;
		}
		return 0;
	}

}
