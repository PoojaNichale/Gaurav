package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class DashBoardPage extends TestBase{

	@FindBy(xpath = "//span[text()='Gaurav']")private WebElement nicknametext;
	//@FindBy(xpath = "//a[@class='logo']")private WebElement kitelogo;
	@FindBy(xpath = "//div[@class='notice layer-2']")private WebElement noticeparagraph;
	@FindBy(xpath = "//input[@icon='search']")private WebElement searchtextbox;
	@FindBy(xpath = "//button[@data-balloon='Buy']")private WebElement ongcsharebuybutton;
	@FindBy(xpath = "//li[@class='search-result-item selected']")private WebElement ongcrow;
	@FindBy(xpath = "//label[text()='SL']")private WebElement slicon;
	@FindBy(xpath = "//input[@label='Qty.']")private WebElement qtytextbox;
	@FindBy(xpath = "//input[@label='Price']")private WebElement pricetextbox;
	@FindBy(xpath = "//input[@label='Trigger price']")private WebElement triggertextbox;
	
	public DashBoardPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public boolean verifynicknametext()
	{
	return nicknametext.isDisplayed();
	}
	
//	public boolean verifykitelogo()
//	{
//	return kitelogo.isDisplayed();
//	}
	
	public boolean verifynoticeparagraph()
	{
	return noticeparagraph.isDisplayed();
	}
	
	
	public void verifyongcsharebuy() throws Exception
	{
	searchtextbox.sendKeys(readexcelsheetfile(0, 0));
	Actions a = new Actions(driver);
	a.moveToElement(ongcrow).build().perform();
	
	ongcsharebuybutton.click();
	slicon.click();
	Thread.sleep(2000);
	qtytextbox.sendKeys(readexcelsheetfile(0, 1));
	pricetextbox.sendKeys(readexcelsheetfile(0, 2));
	triggertextbox.sendKeys(readexcelsheetfile(0, 3));
	
	}
	
}
