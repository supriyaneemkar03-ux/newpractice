package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;

import org.testng.annotations.Test;

public class ParallelTesting {

	public WebDriver driver;
	
	@Parameters("browser")
	@Test
	public void tt(String browser) {
		System.out.println(browser);
		
		if(browser.equalsIgnoreCase("Chrome")) {
			driver= new ChromeDriver();
			driver.get("https://www.google.com");
			driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("Supriya Neemkar");
			
		}
		else if(browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "D:\\For_Automation\\com.pom\\drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.get("https://www.instagram.com");
			driver.findElement(By.name("username")).sendKeys("supriyaneemkar3@gmail.com");
			 driver.findElement(By.name("password")).sendKeys("Test@123");

				driver.findElement(By.xpath("//button[@type='submit']")).click();
				 
			}
			else {
				System.out.println("no browser");
				
			}
		}
}
