package week3.day1;

public class AxisBank extends BankInfo{

	public void deposit() {
		System.out.println("Overrided Bank Info -- deposit");

	}
	
	
	public static void main(String[] args) {
		AxisBank axis = new AxisBank();
		axis.saving();
		axis.fixed();
		axis.deposit(); // comes from AxisBank Class

	}

}
