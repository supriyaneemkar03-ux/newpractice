package Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.HomePage;
import Utility.GenericUtility;

public class Demo extends BaseClass{

	
	@Test
	public void test1() throws IOException {
		driver.get("http://demowebshop.tricentis.com/");
		
		GenericUtility  gu = new GenericUtility(driver);
		gu.screenshot("hppage");
		
		HomePage hp = new HomePage(driver);
		gu.scrollPage(hp.myAccount());
		
	}
}
