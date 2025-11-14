package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class NaukariFileuplaod extends BaseClass{
	 public NaukariFileuplaod(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	 
	}
	@FindBy (xpath="//*[@id='register_Layer']")
	WebElement Register;
	@FindBy (xpath="(//div[@class='textWrap'])[1]")
	WebElement Experience;
	@FindBy (xpath="(//div[@class='textWrap'])[1]")
	WebElement ExperienceClick;
	@FindBy(xpath="//*[@class='uploadResume resman-btn-primary resman-btn-small']")
	WebElement Uploadresume;
	public void RegisterClick() {
		Register.click();
	}
	public WebElement Experience() {
		return Experience;
	}
	 public void ExperienceClick() {
		Experience.click();
		
	 }
	 public void UploadresumeClick() {
		 Uploadresume.click();
	 }
}