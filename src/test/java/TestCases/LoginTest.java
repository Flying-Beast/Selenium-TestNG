package TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;

//import static commons.Configuration.password;
//import static commons.Configuration.url;
//import static commons.Configuration.username;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestRail.APIException;
import commons.TestBase;
import commons.TestRailManager;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends TestBase {

	@BeforeMethod(alwaysRun = true)
	public void openPage() {
		driver.get(BaseUrl);
	}

	@Test(groups = "L")
	public void verifyLoginWithValidCred() throws Exception {

		HomePage homepage = new HomePage(driver);
		homepage.clickOnSection();
		homepage.windowHandling();
		homepage.clickOnSignin();
		System.out.println("Pass");
		LoginPage loginPage = new LoginPage(driver);
//		loginPage.username.sendKeys(username.asString());
//		loginPage.password.sendKeys(password.asString());
//		loginPage.loginButton.click();
//		loginPage.verifySuccesfullLogin();
	}
	
	@Test(groups="Login")
	public void Name() {
		System.out.println("PAss");
	}
	
//	@AfterMethod(alwaysRun = true)
//	public void testRail() throws IOException, APIException  {
//		
//			TestRailManager.addResultForTestCase("3153683",1, "");
//		}
	}
