package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class HomePage extends BaseClass{

	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath  ="//div[@class='column my-account']/ul/li[1]")
	WebElement myaccountaccccc;
	
	
	public WebElement myAccount() {
		return myaccountaccccc;
	}
	
}
