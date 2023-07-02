package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;

public class Home extends ProjectSpecificMethod {

	public Home(ChromeDriver driver, ExtentTest node) {
		this.driver = driver;
		this.node = node;
	}

	public AppLauncher clickAppLauncher() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		return new AppLauncher(driver,node);
	}
}
