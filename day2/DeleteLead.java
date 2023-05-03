package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		

		//http://leaftaps.com/opentaps/control/main
		 
		//Delete Lead:
		//  Launch the browser
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//2	Enter the username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		//3	Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//4	Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//5	Click crm/sfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//6	Click Leads link
		 driver.findElement(By.linkText("Leads")).click();
		 
		//7	Click Find leads
		 driver.findElement(By.linkText("Find Leads")).click();
		 
		//	Click on Phone
		 driver.findElement(By.xpath("//span[text()='Phone']")).click();
		 
		//	Enter phone number
		 driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("8939413211");
		 
		//	Click find leads button
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 
		//	Capture lead ID of First Resulting lead
		 String leadId = driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
		 System.out.println(leadId);
		 
		//	Click First Resulting lead
		 driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		 
		//	Click Delete
		 driver.findElement(By.xpath("//a[text()='Delete']")).click();
		 
		//	Click Find leads
		 driver.findElement(By.linkText("Find Leads")).click();
		 
		//	Enter captured lead ID
		 driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadId);
		 
		//	Click find leads button
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 
		//	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		 WebElement findElement = driver.findElement(By.xpath("//div[contains(text(),'No records to display')]"));
		 String text = findElement.getText();
		 System.out.println(text);
		 
		//	Close the browser (Do not log out)
		 driver.close();

	}

}
