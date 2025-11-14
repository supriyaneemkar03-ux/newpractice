package Testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.LoginPage;
import Utility.Excel_utility;

public class Hybriddriven_loginTest extends BaseClass {
	@Test(dataProvider = "data")
    public void tc_01(String username, String password) {
        driver.get("http://demowebshop.tricentis.com/login");
        
        LoginPage lp = new LoginPage(driver);
        lp.login(username, password);
		//String expMessage ="hai";
		//String actMessage =driver.findElement(By.xpath("//span[text()='Login was unsuccessful. Please correct the errors and try again.']")).getText();
		
		//Assert.assertEquals(actMessage, expMessage);
		}

	@DataProvider(name="data")
	public String[][] getData() throws IOException{
		Excel_utility eu = new Excel_utility("C:\\Users\\neemk\\OneDrive\\Desktop\\Testingsheet.xlsx");
		int rows = eu.getRows("Testing");
		int cols = eu.getCols("Testing", 1);
		
		String values [] [] = new String[rows][cols];
		
		for(int i=1;i<=rows;i++) {
			for(int j=0;j<cols;j++) {
				values[i-1][j] =eu.getData("Testing", i, j);
			}
		}
		return values;
	}
	

}