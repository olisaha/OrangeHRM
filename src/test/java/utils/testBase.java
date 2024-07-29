package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Scanner;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testBase {

	public  WebDriver driver;
	
	public WebDriver WebDriverManager() throws IOException {
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("url");
		if(driver==null) {
	Scanner sc= new Scanner(System.in);
		System.out.println("Enter edge to run the test in Edge Browser and chrome to run the test in Chrome Browser");
		String driverchoice=sc.nextLine();
	
		if(driverchoice.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			System.out.println("Test is running in Edge Browser");}
		if(driverchoice.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println("Test is running in Chrome Browser");}
		
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		}
	        return driver;
	        }
		}
