package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		 
		int num = 34343;
		//Initialize a  temporary variable.
		int remainder;
		int sum=0;
		int temp=num;
		
		//Reverse the number (using for loop and add to the temporary variable)
		while(num>0) {
            remainder = num%10;
            sum=(sum*10)+remainder;
            num=num/10;
		}
		//Compare the temporary number with reversed number
		if(temp==sum) {
			//if both numbers are same, print "palindrome number"
			System.out.println("Palindrome number");
		}
		else {
			//Else print "not palindrome number"
			System.out.println("Not Palindrome number");
		}
	}

}
