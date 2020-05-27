package utils;

import java.util.List;

import org.openqa.selenium.WebElement;

public class Shared {
	public static void click(WebElement element) {
		element.click();
	}
	public static String getText(WebElement element) {
		String b =element.getText();
		return b;
		
	}
	
	public static void click(List<WebElement> elements, String text) {
		for(WebElement element:elements) {
			if(element.getText().equals(text)) {
				element.click();
				break;
			}
		}
		
	}

}
