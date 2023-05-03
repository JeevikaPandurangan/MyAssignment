package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		
		// Step 1: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		// Step 2: Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
		// Step 3: Maximize the window
		driver.manage().window().maximize();
		// Step 4: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Step 5: Click on Create New Account button
		driver.findElement(By.partialLinkText("Create")).click();
		// Step 6: Enter the first name
		driver.findElement(By.name("firstname")).sendKeys("Jeevika");
		// Step 7: Enter the last name
		driver.findElement(By.name("lastname")).sendKeys("Pandurangan");
		// Step 8: Enter the mobile number
		driver.findElement(By.name("reg_email__")).sendKeys("8939413211");
		// Step 9: Enterthe password
		driver.findElement(By.name("reg_passwd__")).sendKeys("Jeevik@123");
		
		// Step 10: Handle all the three drop downs
		WebElement bdate = driver.findElement(By.name("birthday_day"));
		Select day = new Select(bdate);
		day.selectByVisibleText("11");
		
		WebElement bmonth = driver.findElement(By.name("birthday_month"));
		Select month = new Select(bmonth);
		month.selectByIndex(6);
		
		WebElement byear = driver.findElement(By.name("birthday_year"));
		Select year = new Select(byear);
	    year.selectByValue("1998");
	    
		// Step 11: Select the radio button "Female" 
	    driver.findElement(By.className("_8esa")).click();
		           

	}

}
