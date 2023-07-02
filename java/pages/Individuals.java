package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;

public class Individuals extends ProjectSpecificMethod {

	public Individuals(ChromeDriver driver, ExtentTest node) {
		this.driver = driver;
		this.node = node;
	}

	public Individuals clickdropdown() {
		driver.findElement(By.xpath("//one-app-nav-bar-item-root[@class='navItem slds-context-bar__item slds-shrink-none slds-is-active']//one-app-nav-bar-menu-button")).click();
		return this;
	}
	
	public NewIndividuals clickNewIndividuals() {
		WebElement clk = driver.findElement(By.xpath("//span[text()='New Individual']"));
		driver.executeScript("arguments[0].click();", clk);
		return new NewIndividuals(driver,node);
	}
	
	public Individuals searchIndividuals(String lastName) throws InterruptedException {
		WebElement name =driver.findElement(By.xpath("//input[@name='Individual-search-input']"));
		name.sendKeys(lastName);
		name.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		return this;
	}
	
	public Individuals selectFirstIndividuals() {
		WebElement ele = driver.findElement(By.xpath("//div[@class='forceVirtualActionMarker forceVirtualAction']/a[@role='button']"));
		driver.executeScript("arguments[0].click();", ele);
		return this;
	}
	 
	public EditIndividual clickEdit() throws InterruptedException {
		Thread.sleep(3000);
		WebElement edit = driver.findElement(By.xpath("//a[@title='Edit']/div"));
		driver.executeScript("arguments[0].click();", edit);
		return new EditIndividual(driver,node);
	}
	
	public DeleteIndividual clickdelete() throws InterruptedException {
		Thread.sleep(3000);
		WebElement delete = driver.findElement(By.xpath("//a[@title='Delete']/div"));
		driver.executeScript("arguments[0].click();", delete);
		return new DeleteIndividual(driver,node);
	}
}
