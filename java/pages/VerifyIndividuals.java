package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;

public class VerifyIndividuals extends ProjectSpecificMethod {

	public VerifyIndividuals(ChromeDriver driver, ExtentTest node) {
		this.driver = driver;
		this.node = node;
	}

	public VerifyIndividuals verifyCreatedIndividuals() {
		String create = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
		System.out.println("Created Indiviuals : "+create);
		return this;
	}
	
	public VerifyIndividuals verifyEditedIndividuals() {
		String edit = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]")).getText();
		System.out.println("Edited Individuals : "+edit);
		return this;
	}
	
	public VerifyIndividuals verifyDeletedIndividuals() {
		String delete = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]")).getText();
		System.out.println("Deleted Individuals : "+delete);
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Kumars",Keys.ENTER);
		String verify = driver.findElement(By.xpath("//span[text()='No items to display.']")).getText();
		System.out.println(verify);
		return this;
	}
}
