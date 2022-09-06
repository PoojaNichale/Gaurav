package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest {

	WebDriver driver = new ChromeDriver();
	
	@Test
	public void openFb()
	{
		System.out.println("WebDriver.chrome.driver,ChromeDriver");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
	}
	
	@Test
	public void openrediff()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
	}
	
	@Test
	public void opengoogle()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
	}
	
	@AfterMethod
	public void exit()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	

}
