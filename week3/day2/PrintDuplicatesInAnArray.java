package assignment.week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicatesInAnArray {

	public static void main(String[] args) {
	 
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Set<Integer> set = new HashSet<Integer>();
		for (Integer duplicate :list ) {
			if(set.add(duplicate)==false) {
				System.out.println("Duplicated value :"+ duplicate);
			}
			
		}
	}

}
