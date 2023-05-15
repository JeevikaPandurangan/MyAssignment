package assignment.week3.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
		String input = "I am a software tester";
		String rev ="";
		String[] split = input.split(" ");
        for (int i = 0; i < split.length; i++) {
			if(i%2!=0) {
				for (int j = split[i].length()-1; j >= 0; j--) {
					rev+=split[i].charAt(j);
					
				}
			}
			else {
				rev+=split[i]+" ";
			}
		}
        rev=rev.trim();
        System.out.println(rev);
	}

}
