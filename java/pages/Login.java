package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;

public class Login extends ProjectSpecificMethod{
	
	public Login(ChromeDriver driver, ExtentTest node) {
		this.driver = driver;
		this.node = node;
	}
	
	public Login enterUserName(String uname) throws IOException {
		
		try {
			driver.findElement(By.id("username")).sendKeys(uname);
			reportStep(uname+"UserName entered Sucessfully","pass");
		} catch (Exception e) {
			reportStep(uname+"UserName is not entered"+e,"fail");
	}
	return this;
		
	}
    public Login enterPassword(String psw) throws IOException {
    	
    	try {
			driver.findElement(By.id("password")).sendKeys(psw);
			reportStep(psw+"Password entered Sucessfully","pass");
		} catch (Exception e) {
			reportStep(psw+"password is not entered"+e,"fail");
		}
    	return this;
	}
    public Home clickLogin() throws IOException {
    	try {
			driver.findElement(By.id("Login")).click();
			reportStep("Login Button clicked Sucessfully","pass");
		} catch (Exception e) {
			reportStep("Login Button not clicked Sucessfully"+e,"fail");
		}
    	return new Home(driver,node);
    }

}
