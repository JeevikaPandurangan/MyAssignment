package assignment.week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.leafground.com/drag.xhtml");
		
		//Draggable
		WebElement draggable = driver.findElement(By.xpath("//span[text()='Drag and Drop']"));
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(draggable, 100, 80).perform();
		
		//Drag and Drop
		WebElement source = driver.findElement(By.xpath("//p[text()='Drag to target']"));
	    WebElement destination = driver.findElement(By.xpath("//p[text()='Drop here']"));
	    Actions builder2 = new Actions(driver);
	    builder2.dragAndDrop(source, destination).perform();
	    System.out.println(destination.getText());
	    driver.close();
	    
	    ChromeDriver driver2 = new ChromeDriver();
		driver2.manage().window().maximize();
		driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver2.get("https://www.leafground.com/menu.xhtml");
	    
	     
	     
	}

}
