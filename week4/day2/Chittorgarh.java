package assignment.week4.day2;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chittorgarh {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
//		1. Launch the URL https://www.chittorgarh.com/
		driver.get("https://www.chittorgarh.com/");
		
//	    2. Click on stock market
		driver.findElement(By.xpath("//a[@title='Stock Market']")).click();
		
//		3. Click on NSE bulk Deals
		driver.findElement(By.xpath("(//a[text()='NSE Bulk Deals'])[1]")).click();
		
//		4. Get all the Security names
		WebElement table = driver.findElement(By.xpath("(//div[@class='table-responsive']/table)[1]"));
		List<WebElement> row = table.findElements(By.tagName("tr"));
		List<WebElement> col = table.findElements(By.tagName("th"));
		System.out.println("Row Count : "+row.size() +" and "+"Column Count : "+col.size());
		
		List<WebElement> securityNames = driver.findElements(By.xpath("//table[@class='table table-bordered table-striped table-hover w-auto']//tr/td[1]"));
		System.out.println("Total number of security names : "+securityNames.size());
		for (WebElement names : securityNames) {
			System.out.println("All Security names displayed : "+ names.getText());
		}
				
//		5. Ensure whether there are duplicate Security names
		Set<WebElement> set = new HashSet<WebElement>(securityNames);
		System.out.println("Size of Set values : "+set.size());
		
		if(securityNames.size()==set.size()) {
			System.out.println("Duplicate present");
		}
		else {
			System.out.println("No duplicate");
		}
		
		

	}

}
