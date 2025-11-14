package Testcases;

import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.LoginPage;

public class LoginTest extends BaseClass {
	@Test
	public void tc_01()
	{
		driver.get("https://demowebshop.tricentis.com/login");
		LoginPage lp=new LoginPage(driver);
		lp.login("luckypractice248@gmail.com", "Chinnu@143");
	}

}

