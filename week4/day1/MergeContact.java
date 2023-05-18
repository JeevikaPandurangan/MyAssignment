package assignment.week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://leaftaps.com/opentaps/control/login");

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
	    
	    //click merge contact
	    driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
	    
	    System.out.println(driver.getTitle());
	    
	    //click on widget "FROM"
	    driver.findElement(By.xpath("//input[@id='ComboBox_partyIdFrom']//following::a")).click();
	    
	    //Window handle
	    Set<String> windowHandles1 = driver.getWindowHandles();
	    List<String> list1 = new ArrayList<String>(windowHandles1);
	    WebDriver window1 = driver.switchTo().window(list1.get(1));
	    System.out.println(window1.getTitle());
	    
	    //click on first link
	    driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
	    
	    WebDriver window = driver.switchTo().window(list1.get(0));
	    System.out.println(window.getTitle());
	    
	    
	    //click on widget "To"
	    driver.findElement(By.xpath("//input[@id='ComboBox_partyIdTo']//following::a")).click();
	    
	    //Window handle
	    Set<String> windowHandles2 = driver.getWindowHandles();
	    List<String> list2 = new ArrayList<String>(windowHandles2);
	    WebDriver window2 = driver.switchTo().window(list2.get(1));
	    System.out.println(window2.getTitle());
	    
	    //click on first link
	    driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
	    
	    WebDriver window3 = driver.switchTo().window(list2.get(0));
	    System.out.println(window3.getTitle());
	    
	    //click merge
	    driver.findElement(By.className("buttonDangerous")).click();
	    
	    //accept the alert
	    Alert alert = driver.switchTo().alert();
	    System.out.println("Alert message" + alert.getText());
	    alert.accept();
	    
	    System.out.println(driver.getTitle());
	}

}
