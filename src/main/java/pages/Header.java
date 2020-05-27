package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header {
	 WebDriver driver;

	@FindBy(xpath="//div[@class='MobileHeader_logoContainer__2dB8K']/a/img") WebElement logo;
	//@FindBy(xpath="") WebElement details;
	
	public Header(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

}
