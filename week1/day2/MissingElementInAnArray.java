package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		//Input
		int[] arr = {1,2,3,4,7,6,8};
		
		// Sort the array
		Arrays.sort(arr); // {1,2,3,4,6,7,8}
		
		// loop through the array (start i from arr[0] till the length of the array)
		for (int i = 0; i < arr.length; i++) {
			
			// check if the iterator variable is not equal to the array values respectively
			if(arr[i]!=i+1) {
				System.out.println(i+1);
				break;
			}
			 
		}
		
		//or
		/*
		 * for(int i=0;i<arr.length-1;i++){
		 * if(arr[i+1]-arr[i] !=1){
		 * System.out.println(arr[i]+1);
		 * break;
		 */

	}

}
