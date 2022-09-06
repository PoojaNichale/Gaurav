package Pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.TestBase;

public class LoginPage extends TestBase{

	//@FindBy(xpath = "//h2[text()='UL0590']")private WebElement useridtext;
	@FindBy(xpath = "//input[@type='text']")private WebElement useridtextbox;
	@FindBy(xpath = "//input[@type='password']")private WebElement passwardtextbox;
	@FindBy(xpath = "//img[@alt='Kite']")private WebElement kitelogo;
	@FindBy(xpath = "//h2[text()='Login to Kite']")private WebElement logintokitetext;
	@FindBy(xpath = "//img[@alt='Kite iOS']")private WebElement applelogo;
	@FindBy(xpath = "//button[@type='submit']")private WebElement loginbutton;
	@FindBy(xpath = "//input[@id='pin']") private WebElement pintextbox;
	@FindBy(xpath = "//button[@type='submit']")private WebElement continuebutton;
	
	
	
	
	public LoginPage()
	{//button[@type='submit']
		PageFactory.initElements(driver, this);
	}
	
	public void verifylogin() throws Exception
	{
		//return useridtextbox.isDisplayed();
		useridtextbox.sendKeys(readPropertyFile("UserId"));
		passwardtextbox.sendKeys(readPropertyFile("Passward"));
		loginbutton.click();
		
		//wait.until(ExpectedConditions.alertIsPresent());
		
		pintextbox.sendKeys(readPropertyFile("pi"));
		continuebutton.click();
	}
	
	public String verifytittle()
	{
		return driver.getTitle();
	}
	
	public boolean verifykitelogo()
	{
		return kitelogo.isDisplayed();
	}
	
	
	public boolean verifylogintokitetext()
	{
		return logintokitetext.isDisplayed();
	}
	
	public boolean verifyapplelogo() 
	{
		return applelogo.isDisplayed();
	}
	
	
	
	
	
	
	
	
}
