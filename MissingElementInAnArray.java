package day2Java;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {

		int[] arr = {2,3,4,7,6,8};

//		Sort the array	
		Arrays.sort(arr);

//		loop through the array (start i from arr[0] till the length of the array)
		for (int i = arr[0]; i < arr.length; i++) {
//			
			if(i!=arr[i-arr[0]]) {
				System.out.println(i);
				break;
			}		
		}

	}

}
