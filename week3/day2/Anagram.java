package assignment.week3.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		boolean same = true;
		char[] array1 = text1.toCharArray();
        char[] array2 = text2.toCharArray();
        if(array1.length == array2.length) {
        	Arrays.sort(array1);
        	Arrays.sort(array2);
        	same = Arrays.equals(array1, array2);
        }
        else {
        	same = false;
        }
        if(same) {
        	System.out.println("String "+text1+" and "+text2+" are equal");
        }
        else {
        	System.out.println("String "+text1+" and "+text2+" are not equal");
        }
	}

}
