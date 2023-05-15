package assignment.week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesInCollection {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		String[] str = text.split(" ");
        Set<String> output = new LinkedHashSet<String>();
        for (int i = 0; i < str.length; i++) {
			output.add(str[i]);
		}
        System.out.println(output);
	}

}
