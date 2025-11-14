package Utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import Base.BaseClass;

public class GenericUtility extends BaseClass{

	public GenericUtility(WebDriver driver) {
		this.driver=driver;
	}
	
	public void screenshot(String text) throws IOException {
		TakesScreenshot tss = (TakesScreenshot) driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		File dst = new File("C:\\For_automation\\POM\\Screenshot"+text+".png");
		Files.copy(src, dst);
	}
public void eleScreenshot(WebElement ele,String text) throws IOException {
		
		File src = ele.getScreenshotAs(OutputType.FILE);
		File dst = new File("C:\\For_automation\\POM\\Screenshot"+text+".png");
		Files.copy(src, dst);
}
		public void scrollPage(WebElement ele) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView();", ele);
	}
	public void waitElementToBeVisbale(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	public void dropDownByText(WebElement ele,String text) {
		Select s = new Select(ele);
		s.selectByVisibleText(text);
	}
	
	public void dropDownByIndex(WebElement ele1,int index) {
		Select s1=new Select (ele1);
		s1.selectByIndex(index);
	}
	public void dropDownByValue(WebElement ele2,String value) {
		Select s2=new Select(ele2);
		s2.selectByValue(value);
	}
	
	
	public void Fileupload(String path) throws AWTException {
	        
		 StringSelection ss = new StringSelection(path);
		 	    Clipboard clip= Toolkit.getDefaultToolkit().getSystemClipboard();
		 	   clip.setContents(ss,null);
		 	   Robot robo = new Robot();
		 	   robo.delay(2000);
		 	   robo.keyPress(KeyEvent.VK_CONTROL);
		        robo.keyPress(KeyEvent.VK_V);
		        robo.keyRelease(KeyEvent.VK_V);
		        robo.keyRelease(KeyEvent.VK_CONTROL);

		        robo.delay(1000);

		        robo.keyPress(KeyEvent.VK_ENTER);
		        robo.keyRelease(KeyEvent.VK_ENTER);
	}
}

