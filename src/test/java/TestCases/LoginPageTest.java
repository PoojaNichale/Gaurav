package TestCases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.internal.annotations.ITest;

import Base.TestBase;
import Pages.LoginPage;
import Utility.ScreenShotcapture;

public class LoginPageTest extends TestBase{

	LoginPage page;
	
	@BeforeMethod
	public void setup() throws Exception {
	initialization();
	page = new LoginPage();
	}
	
	@Test
	public void verifytittleTest() throws Exception
	{
		String exp = readexcelsheetfile(5, 1);
		String act = page.verifytittle();
		//Assert.assertEquals(act, exp);
		SoftAssert ast = new SoftAssert();
		Assert.assertEquals(act, exp);
		ast.assertAll();
		}
	
	
	@Test
	public void verifyloginTest() throws Exception 
	{
		page.verifylogin();
	}
	
	
	@Test
	public void verifykitelogoTest() 
	{
		page.verifykitelogo();
	}
	
//	
//	@Test
//	public void verifylogintokitetextTest()
//	{
//		page.verifylogintokitetext();
//	}
//	
//	@Test
//	public void verifyapplelogoTest()
//	{
//		page.verifyapplelogo();
//	}
	
	
	@AfterMethod
	public void end(ITestResult It) throws Exception
	{
		if (ITestResult.FAILURE==It.getStatus())
		{
			ScreenShotcapture.captureScreenshotfailedTc(driver,It.getName());
		}
		driver.close();
	}
	
	
	
	
	
	
	
	
	
}
