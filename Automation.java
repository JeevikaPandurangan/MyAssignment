package week3.day1;

public class Automation extends MultipleLanguage implements Language, TestTool{

	public void selenium() {
		System.out.println("Selenium");
		
	}

	public void java() {
		System.out.println("Java");
		
	}

	@Override
	public void ruby() {
		System.out.println("ruby overrided");
		
	}

	public static void main(String[] args) {
		Automation test = new Automation();
		test.java();
		test.selenium();
		test.python();
		test.ruby();
	}
}
