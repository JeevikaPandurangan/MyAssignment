package week3.day1;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("id = " + id);
	}
	
	public void getStudentInfo(int id, String name) {
		System.out.println("id = "+ id + ", " +"Name = "+ name);
	}
	
	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("email = "+ email + ", " +"Phone Number = "+ phoneNumber);
	}
	
	public static void main(String[] args) {
		
		Students obj = new Students();
		obj.getStudentInfo(1132);
		obj.getStudentInfo(1132, "Jeevika");
		obj.getStudentInfo("jeevika@gmail.com", 8939413211l);
	}

}
