package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class StepDefination {
	WebDriver dr;
	@Given("^open chome browser$")
	public void open_chome_browser() throws Throwable {
		   System.setProperty("webdriver.chrome.driver", "/Users/sanchita/Downloads/chromedriver");
            dr= new ChromeDriver(); 
            System.out.println("This is new code");
            System.out.println("This is second line of new code");
            System.out.println("again codding line 1");
            System.out.println("again coding line 2");
            System.out.println("This is devolop branch 1st");
            System.out.println("This is devolop branch 2nd");
            System.out.println("This is devolop branch 3rd");


	}

}
