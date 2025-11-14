package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class EdgeTest {

	
	@Test
	public void t() {
		System.setProperty("webdriver.edge.driver", "D:\\For_Automation\\com.pom\\drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
	}
}