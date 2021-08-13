package assignments;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr = {3,2,11,4,6,7};

		
		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the 2nd element from the last and print it
		 */
		Arrays.sort(arr);
		
		int len=arr.length;
		
		System.out.println("Second largest number:"+arr[len-2]);	
			
	}

}
