package Testcases;

import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.RegisterPage;

public class RegisterTest extends BaseClass {
	@Test
	public void tc_01()
	{
		driver.get("https://demowebshop.tricentis.com/register");
		RegisterPage rp=new RegisterPage(driver);
		rp.register("Sree","Nadendla","luckypractice248@gmail.com", "Chinnu@143" ,"Chinnu@143");
		
	}

}

