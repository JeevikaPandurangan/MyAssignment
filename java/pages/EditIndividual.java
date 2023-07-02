package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;

public class EditIndividual extends ProjectSpecificMethod {

	public EditIndividual(ChromeDriver driver, ExtentTest node) {
		this.driver = driver ;
		this.node = node;
	}
	
	public EditIndividual selectSalutations() {
		driver.findElement(By.xpath("//a[@class='select']")).click();
		driver.findElement(By.xpath("//a[text()='Mr.']")).click();
		return this;
	}
	
	public EditIndividual enterFirstName(String firstName) {
		driver.findElement(By.xpath("//input[contains(@class,'firstName')]")).sendKeys(firstName);
		return this;
	}
	
	public VerifyIndividuals clickSave() {
		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
		return new VerifyIndividuals(driver, node);
	}
	

}
