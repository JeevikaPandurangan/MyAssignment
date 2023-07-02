package base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import util.ReadExcel;

public class ProjectSpecificMethod {
	
	public ChromeDriver driver;
//	public ChromeOptions option;
	public String sheets;
	
//-----------Extent Report---------------------------------------------------------------------------------------------------------
	
	public ExtentReports extent;
	public ExtentTest test,node;
	public String testName,testDescription,testAuthor,tesCategory;
	
	@BeforeSuite
	public void startReport() {
		ExtentHtmlReporter reporter =new ExtentHtmlReporter("./reports/salesforce.html");
		reporter.setAppendExisting(true);
		extent =new ExtentReports();
		extent.attachReporter(reporter);
	}
	@AfterSuite
	public void stopReport() {
		 extent.flush();
	}
	@BeforeClass
	public void testdetail() {
		test = extent.createTest(testName,testDescription);
		
		test.assignCategory(tesCategory);
		
		test.assignAuthor(testAuthor);
	}
	public int takeSnap() throws IOException {
		int ranNum=(int)(Math.random()*999999+1000000);
		File source = driver.getScreenshotAs(OutputType.FILE);
		File target=new File("./snaps/img"+ranNum+".png");//img11145.png
		FileUtils.copyFile(source, target);
		return ranNum;
	}
	
	public void reportStep(String stepDesc, String status) throws IOException {
		
		if(status.equalsIgnoreCase("pass")) {
			node.pass(stepDesc,MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img"+takeSnap()+".png").build());
			
		}
		else if(status.equalsIgnoreCase("fail")) {
			node.fail(stepDesc,MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img"+takeSnap()+".png").build());
		   // throw new RuntimeErrorException(null, "Please look your report for failure ");
		}
		
		
	}	
	
//---------Basics for BeforeMethod,AfterMethod and DataProvider------------------------------------------------------------------------------

	@BeforeMethod
	public void launchBrowser() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		node = test.createNode(testName);
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/");
		}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
		}
	
	//Excel Integration
	@DataProvider
	 public String[][] getData() throws IOException {
		 String[][] readData = ReadExcel.readData(sheets);
		 return readData;
	 }

}
