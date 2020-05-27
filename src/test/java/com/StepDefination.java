package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class StepDefination {
	WebDriver dr;
	@Given("^open chome browser$")
	public void open_chome_browser() throws Throwable {
		   System.setProperty("webdriver.chrome.driver", "/Users/sanchita/Downloads/chromedriver");
            dr= new ChromeDriver(); 
	   
	}

}
