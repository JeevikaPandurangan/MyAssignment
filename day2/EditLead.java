package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) {
		//http://leaftaps.com/opentaps/control/main
		//1	Launch the browser
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
		 
		//8	Enter first name
		 driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Jeevika");
		 
		//9	Click Find leads button
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 
		//10 Click on first resulting lead
		 driver.findElement(By.xpath("//a[text()='10154']")).click();
		 
		//11 Verify title of the page
		 System.out.println(driver.getTitle());
		 
		//12 Click Edit
		 driver.findElement(By.xpath("//a[text()='Edit']")).click();
		 
		//13 Change the company name
		 driver.findElement(By.id("updateLeadForm_companyName")).clear();
		 driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("leaftaps");
		 
		//14 Click Update
		 driver.findElement(By.name("submitButton")).click();
		 
		//15 Confirm the changed name appears
		 String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		 System.out.println(text);
		 if(text.contains("leaf")) {
			 System.out.println("Changed name appears");
		 }
		 else {
			 System.out.println("Changed name doesn't appears");
		 }
		//16 Close the browser (Do not log out)
		 driver.close();


	}

}
