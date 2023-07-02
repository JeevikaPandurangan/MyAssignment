package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;

public class NewIndividuals extends ProjectSpecificMethod {

	public NewIndividuals(ChromeDriver driver, ExtentTest node) {
		this.driver = driver;
		this.node = node;
	}

	public NewIndividuals enterLastName(String lastName) {
		driver.findElement(By.xpath("//input[contains(@class,'lastName compound')]")).sendKeys(lastName);
		return this;
	}
	
	public VerifyIndividuals clickSave() {
		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
		return new VerifyIndividuals(driver,node);
		
	}
	
}
