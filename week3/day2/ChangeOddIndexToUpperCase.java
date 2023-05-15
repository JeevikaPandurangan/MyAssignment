package assignment.week3.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		//Declare String
		String test = "changeme";
		String result ="";
		//Convert sytring into char Array
		char[] ch = test.toCharArray();
		
		//Traverse through each char 
		for (int i = 0; i < ch.length; i++) {
			if(i%2==0) {
				result+=Character.toUpperCase(ch[i]);
			}
			else {
				result+=Character.toLowerCase(ch[i]);
			}
		}
		System.out.println(result);
	}
}

