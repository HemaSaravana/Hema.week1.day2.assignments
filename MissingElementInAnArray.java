package assignments;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
		// Sort the array	
		// loop through the array (start i from arr[0] till the length of the array)
		// check if the iterator variable is not equal to the array values respectively
		// print the number
		// once printed break the iteration
		int[] arr = {0,1,2,3,4,7,6,8};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			if(i!=arr[i]) {
				System.out.println(i);
				break;
			}
			
		}
		
	}

}
