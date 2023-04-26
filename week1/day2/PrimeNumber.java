package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		//Check if the given number is prime number or not
		
		// Declare an int Input and assign a value 13
		int number = 13;
		
		// Declare a boolean variable flag as false
		boolean flag = false;
		
		// Iterate from 2 to half of the input
		for (int i = 2; i < number/2; i++) {
			// Divide the input with each for loop variable and check the remainder
            if(number%i ==0) {
            	// Set the flag as true when there is no remainder
            	flag=true;
            	// break the iterator
            	break;
            }
		}
		// Check the flag (Provide a condition)
        if(!flag) {
        	// Print 'Prime' when the condition matches
        	System.out.println(number +" is a Prime number");
        }
        else {
        	// Print 'Not a Prime' when the condition doesn't match 
        	System.out.println(number +" is not a Prime number");
        }

	}

}
