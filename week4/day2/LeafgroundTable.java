package assignment.week4.day2;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundTable {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://leafground.com/table.xhtml");

	}

}
