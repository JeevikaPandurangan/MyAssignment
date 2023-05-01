package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		
		//Launch the browser 
		ChromeDriver driver = new ChromeDriver();
		
		//Load URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Find the element userName -Action -> enter the Username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	
		//Find the element password -Action -> enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Find the element login -Action -> click the login
	    driver.findElement(By.className("decorativeSubmit")).click();
	   
		//click on CRM/SFA
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    
	    //Click Lead
	    driver.findElement(By.linkText("Leads")).click();
	
		//Click create lead
	    driver.findElement(By.partialLinkText("Create")).click();
	 
	  //enter companyname
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	    
		//enter fn
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jeevika");
	   
		//enter ln
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Pandurangan");
	    
	    //enter firstname(Local)
	    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Jeevi");
	   
		//enter Department field
	    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Non IT to IT");
	    
	    //enter description field
	    driver.findElement(By.id("createLeadForm_description")).sendKeys("Learning Selenium");
	    
	    //enter email
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Jeevi@gmail.com");
	    
	    //click create lead
	    driver.findElement(By.name("submitButton")).click();
	    
	    //Get title of the Resulting page
	    String title1 = driver.getTitle();
	    System.out.println(title1);
	    
	    //Click duplicate button
	    driver.findElement(By.partialLinkText("Duplicate")).click();
	    
	    //Clear ComapanyName and enter new comapny name
	    driver.findElement(By.id("createLeadForm_companyName")).clear();
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("leaftaps");
	    
	    //clear fn and enter new fn
	    driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gowri");
		
	    //click create button
	    driver.findElement(By.name("submitButton")).click();
	    
	    //Get title of the Resulting page
	    String title2 = driver.getTitle();
	    System.out.println(title2);
	    
	 

	}

}
