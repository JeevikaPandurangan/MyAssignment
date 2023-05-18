package assignment.week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.leafground.com/alert.xhtml");
		
		//Alert (Simple Dialog)
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		Alert simplealert = driver.switchTo().alert();
		System.out.println(simplealert.getText());
		simplealert.accept();
		String text1 = driver.findElement(By.xpath("//span[@id='simple_result']")).getText();
		System.out.println("Simple alert: "+text1);
		
		//Alert (Prompt Dialog)
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert promptalert = driver.switchTo().alert();
		System.out.println(promptalert.getText());
		promptalert.sendKeys("Jeevika");
		promptalert.accept();
		String text2 = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		System.out.println("Prompt alert: "+text2);
		
        //Alert (Confirm Dialog)
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		Alert confirmalert = driver.switchTo().alert();
		System.out.println(confirmalert.getText());
		confirmalert.accept();
		String text3 = driver.findElement(By.xpath("//span[@id='result']")).getText();
		System.out.println("Confirm alert: "+text3);
		
		//Sweet Alert (Confirmation)
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		String text4 = driver.findElement(By.xpath("//span[@class='ui-confirm-dialog-message']")).getText();
		System.out.println("Sweet Alert (Confirmation) :"+text4);
		driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left ui-confirmdialog-yes']")).click();
		
		//Sweet Alert (Simple Dialog)
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		String text5 = driver.findElement(By.xpath("(//div[@class='ui-dialog-content ui-widget-content']//p)[1]")).getText();
		System.out.println("Sweet Alert (Simple Dialog) :"+text5);
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		
		//Sweet Modal Dialog
		driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
		String text6 = driver.findElement(By.xpath("(//div[@class='ui-dialog-content ui-widget-content']//p)[2]")).getText();
		System.out.println("Sweet Alert (Modal Dialog) :"+text6);
	    driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
	    
	    //Minimize and Maximize
	    driver.findElement(By.xpath("(//span[text()='Show'])[6]")).click();
	    String text7 = driver.findElement(By.xpath("(//div[@class='ui-dialog-content ui-widget-content']//p)[3]")).getText();
		System.out.println("Maximize and Minimize :"+text7);
		driver.findElement(By.xpath("//a[@class='ui-dialog-titlebar-icon ui-dialog-titlebar-maximize ui-corner-all']")).click();
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[3]")).click();
	    

	}

}
