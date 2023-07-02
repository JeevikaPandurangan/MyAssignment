package testcases;

import pages.Login;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;

public class TestCreateIndividuals extends ProjectSpecificMethod {
		
//Excel Integrations
@BeforeTest
public void setup() {
	sheets = "CreateIndiviuals";
	//Extent report
	testName = "Create Individuals";
	testDescription = "Test the Create individuals in Salesforce application";
	tesCategory = "Regression";
	testAuthor = "Jeevika";	
}
	
	
@Test(dataProvider = "getData")
	public void createIndividualsTest(String uname, String pwd,String lastName) throws IOException, InterruptedException {
		Login login = new Login(driver,node);
		login.enterUserName(uname).enterPassword(pwd).clickLogin()
		.clickAppLauncher()
		.clickViewAll().enterIndividuals().clickIndividuals()
		.clickdropdown().clickNewIndividuals()
		.enterLastName(lastName).clickSave()
		.verifyCreatedIndividuals();
				
	}
}
