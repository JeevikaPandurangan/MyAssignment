package assignment.week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.leafground.com/frame.xhtml");
		
		//Click Me (Inside frame)
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		String text1 = driver.findElement(By.xpath("//button[contains(text(),'Hurray!')]")).getText();
		System.out.println("Click Me (Inside frame): "+text1);
		driver.switchTo().defaultContent();
		
		//How many frames in this page?
		List<WebElement> totalFrame = driver.findElements(By.xpath("//iframe"));
		System.out.println(totalFrame.size());
		
		
		//Click Me (Inside Nested frame)
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		String text3 = driver.findElement(By.xpath("//button[contains(text(),'Hurray!')]")).getText();
		System.out.println("Click Me (Inside Nested frame): "+text3);
		
		
		
	}

}
