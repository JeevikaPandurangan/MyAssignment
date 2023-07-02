package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;

public class DeleteIndividual extends ProjectSpecificMethod {

	public DeleteIndividual(ChromeDriver driver, ExtentTest node) {
		this.driver = driver;
		this.node = node;
	}
	
	public VerifyIndividuals clickDeletebutton() {
		WebElement del = driver.findElement(By.xpath("//span[text()='Delete']"));
		driver.executeScript("arguments[0].click();", del);
		return new VerifyIndividuals(driver, node);
	}
	
}
