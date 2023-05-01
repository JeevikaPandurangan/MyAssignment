package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException  {
		//setup the path
		//WebDriverManager.chromeDriver.setup();
		
		//Launch the browser 
		ChromeDriver driver = new ChromeDriver();
		
		//Load URL
		driver.get("http://leaftaps.com/opentaps/");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Minimize the browser
		//driver.manage().window().minimize();
		
		//Find the element userName -Action -> enter the Username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	
		
		//Find the element password -Action -> enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		
		//Find the element login -Action -> click the login
	    driver.findElement(By.className("decorativeSubmit")).click();
	   
		
		//click on CRM/SFA
	    driver.findElement(By.linkText("CRM/SFA")).click();
	 
		
	    
	    //To verify the page loaded
	    //to print title
	    String title = driver.getTitle();
	    System.out.println(title);
	    System.out.println(driver.getCurrentUrl());
	    
	    //click on CRM/SFA
	    //driver.findElement(By.partialLinkText("CRM/SFA")).click();
	    
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
	   
		
	    //click create lead
	    driver.findElement(By.name("submitButton")).click();
	    
		
	    //Verify the lead create
	    String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	    System.out.println(text);
	    
		//Close the browser
		//driver.close();
		
		//ClassRoom 2 task
		//Launch the browser 
//		ChromeDriver driver = new ChromeDriver();
//		
//		//Load URL
//		driver.get("https://www.leafground.com/input.xhtml");
//		
//		//Maximize the browser
//		driver.manage().window().maximize();
//		
//		//Minimize the browser
//		//driver.manage().window().minimize();
//		
//		//Find the element userName -Action -> enter the Username
//	    driver.findElement(By.id("j_idt88:name")).sendKeys("Jeevika P");
		//Thread.sleep(1000);
//		
		
		
		

	}

}
