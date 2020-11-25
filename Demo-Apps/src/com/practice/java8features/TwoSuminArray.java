package comharsha.javaadmirer;

import java.util.HashMap;
import java.util.Map;

public class TwoSuminArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 2, 3, 7, 4, 8 };
		int target = 10;
		int[] ar = twoSum(arr, target);
		for (int x : ar) {
			System.out.println(x);
		}

	}

	private static int[] twoSum(int[] arr, int target) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length - 1; i++) {
			int delta = target - arr[i];
			if (numMap.containsKey(delta)) {
				return new int[] { i, numMap.get(delta) };
			}
			numMap.put(arr[i], i);
		}
		return new int[] { -1, -1 };

	}

}
