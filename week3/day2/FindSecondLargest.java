package assignment.week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		List<Integer> input = new ArrayList<Integer>();
		input.add(3);
		input.add(2);
		input.add(11);
		input.add(4);
		input.add(6);
		input.add(7);
	   System.out.println(input);
	   Collections.sort(input);
	   System.out.println(input);
	   int size = input.size();
	   System.out.println(input.get(size-2));
	

	}

}
