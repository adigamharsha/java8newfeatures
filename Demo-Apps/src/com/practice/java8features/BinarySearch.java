package comharsha.javaadmirer;

import java.util.Arrays;

public class BinarySearch {
	private static boolean binarySearch(int arr[], int number) {
		int left = 0;
		int right = arr.length - 1;
		boolean isvalid = false;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] == number) {
				isvalid = true;
				break;
			} else if (arr[mid] < number) {
				left = mid + 1;
			} else
				right = mid - 1;
		}
		return isvalid;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 12, 5, 1, 52, 92, 25, 31 };
		char[] c = {'z' , 's' , 'f' ,'a' ,'g' ,'b'};
		Arrays.sort(arr);
		boolean isValidNumber = binarySearch(arr, 1);
		System.out.println("Given Number is ::" + isValidNumber);
	}

}
