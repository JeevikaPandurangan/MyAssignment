package assignment.week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuyTheValue {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//1. Load https://buythevalue.in/
		driver.get("https://buythevalue.in/");
		
		driver.findElement(By.xpath("//div[@id='com-hextom-smartpushmarketing-popup-close-popup-push']//div")).click();
		
		System.out.println("Title of Home Page : "+driver.getTitle());

		//2. Click on first product (eg: Hamdard Hing - 50GM)
		driver.findElement(By.xpath("(//div[@class='product-content']//a)[1]")).click();
		
		System.out.println("Title of Product page :"+driver.getTitle());
		
		//Handle Frame
		//3. Close chat widget
		driver.switchTo().frame("dummy-chat-button-iframe");
		driver.findElement(By.xpath("//button[@class='chat-toggle bottom-right']")).click();
		driver.switchTo().frame("ShopifyChat");
		driver.findElement(By.xpath("(//div[@class='chat-app chat-app--is-open chat-app--']//button)[3]")).click();
		
		driver.switchTo().defaultContent();
	
		//4. Enter the pincode 
		driver.findElement(By.xpath("//input[@id='wk_zipcode']")).sendKeys("560038");
		
		//5. Click on Check
		WebElement check = driver.findElement(By.xpath("//input[@class='btn']"));
		driver.executeScript("arguments[0].click();", check);
		
		//6. Click on ADD TO CART
		driver.findElement(By.xpath("//button[@id='product-add-to-cart']")).click();
		
		System.out.println("Title after clicking add to cart :"+driver.getTitle());
		
		//7. Click on View
		WebElement view = driver.findElement(By.xpath("(//a[@class='harman_btn4'])[1]"));
		driver.executeScript("arguments[0].click();", view);
		
		System.out.println("Title on cart : "+driver.getTitle());
		
		//8. Click on CHECK OUT
		driver.findElement(By.xpath("//input[@name='checkout']")).click();
		
		//Handle alert
		//9. Accept the alert
		Alert alert = driver.switchTo().alert();
		System.out.println("Text on alert : "+ alert.getText());
		alert.accept();
		
		System.out.println("Title : "+driver.getTitle());

	}

}
