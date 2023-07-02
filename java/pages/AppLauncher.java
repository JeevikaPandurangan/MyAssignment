package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;

public class AppLauncher extends ProjectSpecificMethod {
	
	public AppLauncher(ChromeDriver driver, ExtentTest node) {
		this.driver = driver;
		this.node = node;
	}

	public AppLauncher clickViewAll() {
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		return this;
	}
	
	public AppLauncher enterIndividuals() {
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Individuals");
		return this;
	}
	
	public Individuals clickIndividuals() {
		WebElement individual = driver.findElement(By.xpath("//a[@data-label='Individuals']"));
		driver.executeScript("arguments[0].click();", individual);
		return new Individuals(driver,node);
	}

}
