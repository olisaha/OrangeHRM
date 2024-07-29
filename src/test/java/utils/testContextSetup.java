package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.pageObjectManager;

public class testContextSetup {
	public WebDriver driver;
	public pageObjectManager pageobjectmanager;
	public testBase testbase;
	public utility utility;
	public testContextSetup() throws IOException {
		testbase = new testBase();
		utility = new utility(testbase.WebDriverManager());
		pageobjectmanager=new pageObjectManager(testbase.WebDriverManager(),utility);
		
	}

}
