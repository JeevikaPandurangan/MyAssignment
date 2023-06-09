package assignment.week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Salesforce {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
//		1. Launch the browser
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
//		2. Load the url as " https://login.salesforce.com/ "
		driver.get("https://login.salesforce.com/");
		
//		3. Enter the username as "hari.radhakrishnan@qeagle.com"
		driver.findElement(By.xpath("//input[@class='input r4 wide mb16 mt8 username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		
//		4. Enter the password as "Leaf@1234"
		driver.findElement(By.xpath("//input[@class='input r4 wide mb16 mt8 password']")).sendKeys("Leaf@1234");
		
//		5. Click on the login button
		driver.findElement(By.xpath("//input[@class='button r4 wide primary']")).click();
		
		
		System.out.println("Title of home page : "+driver.getTitle());
		
//		6. Click on the learn more option in the Mobile publisher
		driver.findElement(By.xpath("//button[@class='slds-button slds-button--neutral navButton newWindow uiButton']")).click();
		
//		7. Switch to the next window using Windowhandles.
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(windowHandles);
		WebDriver window = driver.switchTo().window(list.get(1));
		
//		8. Click on the confirm button on the redirecting page
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		
//		9. Get the title
		System.out.println(window.getTitle());
		
//		10. Get back to the parent window
		driver.switchTo().window(list.get(0));
		
//		11. Close the browser
		driver.close();
		
		

	}

}
