package assignment.week3.day2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
	
		List<Integer> array1 = new ArrayList<Integer>();
		array1.add(3);
		array1.add(2);
		array1.add(11);
		array1.add(4);
		array1.add(6);
		array1.add(7);
		List<Integer> array2 = new LinkedList<Integer>();
		array2.add(1);
		array2.add(2);
		array2.add(8);
		array2.add(4);
		array2.add(9);
		array2.add(7);
		System.out.println(array1);
		System.out.println(array2);
		
		System.out.println(array1.retainAll(array2));
		System.out.println(array1);
		
	}

}
