package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	//public WebDriverWait wait;
	
	public void initialization() throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(readPropertyFile("Url"));
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));	
	}
	
	public String readPropertyFile(String value) throws Exception 
	{
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\PracticeFramework\\TestData\\Config.Properties");
		prop.load(file);
		
		return prop.getProperty(value);
	}
	
	public String readexcelsheetfile(int row, int col) throws Exception
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\PracticeFramework\\TestData\\Books3.xlsx");
	    Sheet excelsheet = WorkbookFactory.create(file).getSheet("Sheet1");
	   String value = excelsheet.getRow(row).getCell(col).getStringCellValue();
	   return value;
	   
	}
	
	
	
	
	
	
}
