package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.DashBoardPage;
import Pages.LoginPage;

public class DashBoardPageTest extends TestBase{

	LoginPage page;
	DashBoardPage page2;
	
	
	@BeforeMethod(groups= {"Regression","Sanity"})
	public void  setup() throws Exception {
		initialization();
	 page = new LoginPage();
	 page.verifylogin();
	 page2 = new DashBoardPage();
	}
	
	@Test(groups="Sanity",invocationCount=2)
	public void verifynicknametextTest()
	{
		page2.verifynicknametext();
	}
	
//	@Test(groups="regression")
//	public void verifykitelogoTest()
//	{
//		page2.verifykitelogo();
//	}
	
	@Test(groups="Regression",priority=1,dependsOnMethods="verifynicknametextTest")
	public void verifynoticeparagraphTest()
	{
		page2.verifynoticeparagraph();
	}
	
	@Test(groups="Sanity",timeOut=10000)
	public void verifyongcsharebuyTest() throws Exception
	{
		page2.verifyongcsharebuy();
	}
	
	@AfterMethod(groups= {"Regression","Sanity"})
	public void end()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
