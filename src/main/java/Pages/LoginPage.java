package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class LoginPage extends BaseClass
{
public LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//*[@id='Email']")
		WebElement username;
		@FindBy(xpath="//*[@name='Password']")
				WebElement password;
		@FindBy(xpath="//*[@class='button-1 login-button']")
		WebElement loginbtn;
public void login(String un,String pwd)				
{
	username.sendKeys(un);
	password.sendKeys(pwd);
	loginbtn.click();
}
}
