package com.bit;

import org.junit.Test;

import pages.HomePage;
import pages.MonkeyPage;
import pages.ProductDetailsPage;



public class SmokeTest extends BaseTest {
	HomePage homePage;
	MonkeyPage monkeyPage;
	ProductDetailsPage productDetailsPage;
@Test
public void buyWeddingProduct() throws Exception {
	homePage=new HomePage(driver);
	monkeyPage=homePage.clickMonkeyCatagory().get();
	productDetailsPage=monkeyPage.clickSubCatagoryOptions();
	productDetailsPage.compareText();
	
}


}
