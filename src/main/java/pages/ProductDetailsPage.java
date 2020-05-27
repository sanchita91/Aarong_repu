package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Shared;

public class ProductDetailsPage {
	WebDriver driver;
	@FindBy(xpath="//div[@class='QGXxg product-page__price']/h1") WebElement compareText;
	public ProductDetailsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
 public void compareText() {
	 String b=Shared.getText(compareText);
	 System.out.println(b);
 }
}
