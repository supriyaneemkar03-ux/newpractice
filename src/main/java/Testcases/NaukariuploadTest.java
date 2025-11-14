package Testcases;

import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.NaukariFileuplaod;
import Utility.GenericUtility;

public class NaukariuploadTest extends BaseClass{
	@Test
	public void tc_01() throws InterruptedException, AWTException, IOException

	{
		//driver.get("https://naukri.com"),
		File f=new File("C:\\For_automation\\POM\\src\\main\\java\\Utility\\resume.properties");
		FileInputStream fis = new FileInputStream(f);
		Properties pro = new Properties(); 
		pro.load(fis);
		driver.get(pro.getProperty("url"));
		
		NaukariFileuplaod np=new NaukariFileuplaod (driver);
        np.RegisterClick();		
      
        Thread.sleep(4000);
        GenericUtility gu =new GenericUtility(driver);
        gu.scrollPage(np.Experience());
        
        np.ExperienceClick();
        np.UploadresumeClick();
       // gu.Fileupload("C:\\Users\\nagis\\OneDrive\\Desktop\\Selenium_Practice project\\Nagisetty Sreelakshmi.Resume (Manual Tester).pdf");
       gu.Fileupload(pro.getProperty("path"));
       }

}

