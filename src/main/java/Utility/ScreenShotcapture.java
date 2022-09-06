package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.github.dockerjava.api.model.Driver;

public class ScreenShotcapture {

	public static void captureScreenshotfailedTc(WebDriver driver,String methodname) throws Exception
	{
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Lenovo\\eclipse-workspace\\PracticeFramework\\ScreenShot/"+methodname+".png");
		FileHandler.copy(source, destination);
	}
	
	
	
	
	
	
}
