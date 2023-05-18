package assignment.week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.leafground.com/window.xhtml");
		
		System.out.println("Title of the page :"+driver.getTitle());
		
		//Click and Confirm new Window Opens
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> list1 = new ArrayList<String>(windowHandles1);
		WebDriver window1 = driver.switchTo().window(list1.get(1));
		
		System.out.println("First new window title :"+window1.getTitle());
		
		window1.close();
		
		driver.switchTo().window(list1.get(0));
		
		//Close all windows except Primary
     	driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
     	String primary = driver.getWindowHandle();
    	Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> list2 = new ArrayList<String>(windowHandles2);
		System.out.println("Opened Window : "+list2.size());
        for (int i = 0; i < list2.size(); i++) {
			if(i>0) {
				driver.switchTo().window(list2.get(i));
				driver.close();
			}
		}
        
        //or
//        if(!window.get(i).equalsIgnoreCase(primaryWindow)) {
//          System.out.println("This is primary window so dont need to close this");
//          Thread.sleep(500);
//          driver.switchTo().window(window.get(i));
//          driver.close();
//      }
//  }
     	
		driver.switchTo().window(list2.get(0));
		
		//Find the number of opened tabs
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		
		Set<String> windowHandles3 = driver.getWindowHandles();
		List<String> list3 = new ArrayList<String>(windowHandles3);
        driver.switchTo().window(list3.get(1));
		
	    System.out.println("Number of tabs Opened :"+ list3.size());
	    
	    for (String string : list3) {
			System.out.println(driver.switchTo().window(string).getTitle());
		}
	    
	    driver.close();
	    
	    driver.switchTo().window(list3.get(0));
	    
	    //Wait for 2 new tabs to open
	    driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		
		Set<String> windowHandles4 = driver.getWindowHandles();
		List<String> list4 = new ArrayList<String>(windowHandles4);
        driver.switchTo().window(list4.get(1));
        
              System.out.println("Number of tabs Opened :"+ list4.size());
	    
	    for (String string2 : list4) {
			System.out.println(driver.switchTo().window(string2).getTitle());
		}
	   
	    driver.quit();
	     
		
		
		
		


	}

}
