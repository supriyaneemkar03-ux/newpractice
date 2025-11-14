package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class RegisterPage extends BaseClass
{
public RegisterPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//*[@id='gender-female']")
		WebElement gender;
@FindBy(xpath="//*[@id='FirstName']")
		WebElement firstname;
@FindBy(xpath="//*[@name='LastName']")	
WebElement lastname;
@FindBy(xpath="//*[@name='Email']")
WebElement email;
@FindBy(xpath="//*[@id='Password']")
WebElement password;
@FindBy(xpath="//*[@name='ConfirmPassword']")
WebElement ConfirmPassword;
@FindBy(xpath="//*[@id='register-button']")
WebElement registerBtn;

		
public void register(String fn,String ln, String mail,String pwd,String cp)				
{

	gender.click();
    firstname.sendKeys(fn);
    lastname.sendKeys(ln);
    email.sendKeys(mail);
    password.sendKeys(pwd);
    ConfirmPassword.sendKeys(cp);
    registerBtn.click();
}
}

