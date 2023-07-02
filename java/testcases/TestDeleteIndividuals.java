package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.Login;

public class TestDeleteIndividuals extends ProjectSpecificMethod {

	
		@BeforeTest
		public void setup() {
			sheets = "DeleteIndividuals";
			//Extent report
			testName = "Delete Individuals";
			testDescription = "Test the Delete individuals in Salesforce application";
			tesCategory = "Smoke";
			testAuthor = "Jeevika";
		}
		
		@Test(dataProvider = "getData")
		public void deleteIndividualsTest(String uname, String pwd,String lastName) throws IOException, InterruptedException {
			Login login = new Login(driver,node);
			login.enterUserName(uname).enterPassword(pwd).clickLogin()
			.clickAppLauncher()
			.clickViewAll().enterIndividuals().clickIndividuals()
			.searchIndividuals(lastName).selectFirstIndividuals().clickdelete()
			.clickDeletebutton()
			.verifyDeletedIndividuals();
			
		}
}
