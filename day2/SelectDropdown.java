package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

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
	    
	    
	    //Dropdown for source
	    WebElement drop1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
	    Select dropdown1 = new Select(drop1);
	    dropdown1.selectByIndex(4);
	    
	    //Dropdown for marketcampign
	    WebElement drop2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	    Select dropdown2 = new Select(drop2);
	    dropdown2.selectByVisibleText("Automobile");
	    
	    //Dropdown for ownership
	    WebElement drop3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	    Select dropdown3 = new Select(drop3);
	    dropdown3.selectByValue("OWN_CCORP");
	    
	    //click create lead
	    driver.findElement(By.name("submitButton")).click();
	    
	    //Get title of the Resulting page
	    String title = driver.getTitle();
	    System.out.println(title);

	}

}
