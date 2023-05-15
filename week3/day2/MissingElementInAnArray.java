package assignment.week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
	 
		int count = 1;
		List<Integer> array = new ArrayList<Integer>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(7);
		array.add(6);
		array.add(8);
		System.out.println("Array Values "+array);
		Collections.sort(array);
		System.out.println("Sorted Array "+array);
		for (int i = 0; i < array.size()-1; i++) {
			
			if (array.get(i)!=i+count) {
			System.out.println("The missing element is "+(i+count));	
			break;
			
			}
			
		}
		
		}
	}


