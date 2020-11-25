package comharsha.javaadmirer;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class BubbleSortAlgo {
	
	public static void main(String[] args) {
		int arr[] = { 4, 2, 6, 8, 10, 12, -12 };
		// Bubble sort pushes largest element to right side by comparing two values

		for (int j = 0; j < arr.length - 1; j++) {
			for (int i = 0; i < arr.length - 1 - j; i++) {
				int temp = 0;
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		for (int x : arr) {
			System.out.println(x);
		}
	}
}



