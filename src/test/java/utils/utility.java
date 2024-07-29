package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class utility {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	public utility(WebDriver driver) {
		this.driver = driver;
	}

	public void explicitwait(By xpath) {
	
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
	}
	public void javascript(WebElement element ) {
	    js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
	}
	
	public void scrollbyelement(WebElement element) {
		   js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",element);
	}
}
