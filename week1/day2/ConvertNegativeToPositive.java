package week1.day2;

public class ConvertNegativeToPositive {

	public static void main(String[] args) {
		
		//Convert the given number from negative to positive
		int num = -40;
		int positive;
		if(num<0) {
			positive = num * -1;
			System.out.println("The number "+num+" is converted into "+positive);
		}
	}

}
