package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateContacts {

	public static void main(String[] args) {
		
		        //Launch the browser 
				ChromeDriver driver = new ChromeDriver();
				
				//Load URL
				driver.get("http://leaftaps.com/opentaps/control/login");
				
				//Maximize the browser
				driver.manage().window().maximize();
				
				//Find the element userName -Action -> enter the Username
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			
				//Find the element password -Action -> enter the password
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				//Find the element login -Action -> click the login
			    driver.findElement(By.className("decorativeSubmit")).click();
			   
				//click on CRM/SFA
			    driver.findElement(By.linkText("CRM/SFA")).click();
			    
			    //Click Contacts Tab
			    driver.findElement(By.linkText("Contacts")).click();
			    
			    //Click Create Contact
			    driver.findElement(By.linkText("Create Contact")).click();
			    
			    //Type First Name
			    driver.findElement(By.id("firstNameField")).sendKeys("Jeevika");
			    
			    //Type Last Name
			    driver.findElement(By.id("lastNameField")).sendKeys("Pandurangan");
			    
			    //Click Create Contact Button
			    driver.findElement(By.name("submitButton")).click();
			    
			    //Print the first name and browser title 
			    String firstName= driver.findElement(By.id("viewContact_firstName_sp")).getText();
				System.out.println(firstName);
				System.out.println(driver.getTitle());
			    
			    //Close the browser
			    driver.close();
	}

}
