package com.bit;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	WebDriver driver;
@Before
public void openBrowser() throws IOException {
	//System.setProperty("webdriver.chrome.driver", "/Users/sanchita/Downloads/chromedriver");
    //driver=new ChromeDriver();
	//driver.get("https://www.express.com/");
	Properties pop = readProperty("/Users/sanchita/eclipse-workspace/Aarong/src/test/java/com/bit/config.property");
	String getValue=pop.getProperty("browser");
	if(getValue.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "/Users/sanchita/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get(pop.getProperty("url"));
		}
	else if(getValue.equalsIgnoreCase("firefox")) {
		
		
	}
}

//@After
public void close() {
	driver.quit();
}

public Properties readProperty(String path) throws IOException {
	File file= new File(path);
	FileInputStream fil = new FileInputStream(file);
	Properties prop= new Properties();
	prop.load(fil);
	return prop;
}
}