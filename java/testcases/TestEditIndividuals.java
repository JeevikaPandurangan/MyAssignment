package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.Login;

public class TestEditIndividuals extends ProjectSpecificMethod {
	
	//Excel Integrations
	@BeforeTest
	public void setup() {
		sheets = "EditIndividuals";
		//Extent report
		testName = "Edit Individuals";
		testDescription = "Test the Edit individuals in Salesforce application";
		tesCategory = "Smoke";
		testAuthor = "Jeevika";	
	}
	
	@Test(dataProvider = "getData")
	public void editIndividualsTest(String uname, String pwd, String firstName, String lastName) throws IOException, InterruptedException {
		Login login = new Login(driver,node);
		login.enterUserName(uname).enterPassword(pwd).clickLogin()
		.clickAppLauncher()
		.clickViewAll().enterIndividuals().clickIndividuals()
		.searchIndividuals(lastName).selectFirstIndividuals().clickEdit()
		.selectSalutations().enterFirstName(firstName).clickSave()
		.verifyEditedIndividuals();
		
				
	}

}
