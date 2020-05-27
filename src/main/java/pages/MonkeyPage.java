package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;


import utils.Shared;

public class MonkeyPage extends LoadableComponent<MonkeyPage>{
	WebDriver driver;
	@FindBy(xpath="//div[@class='products']/span[1]") WebElement subCatagoryOptions;
	//@FindBy(xpath="//div[@class='products']/span") WebElement subCatagoryOptions;
	
	
	public MonkeyPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public ProductDetailsPage clickSubCatagoryOptions() throws Exception {
		Shared.click(subCatagoryOptions);
		Thread.sleep(6000);

		return new ProductDetailsPage(driver);
	}
	
	@Override
	protected void load() {
		// TODO Auto-generated method stub
		driver.navigate().to("https://www.express.com/womens-clothing/labels-we-love/flying-monkey/cat4630007");
		Header h =new Header(driver);
	}
	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
	Assert.assertTrue(driver.getCurrentUrl().equals("https://www.express.com/womens-clothing/labels-we-love/flying-monkey/cat4630007"));
	Header h =new Header(driver);	
	}

}
