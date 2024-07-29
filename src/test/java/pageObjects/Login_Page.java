package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import utils.utility;



public class Login_Page {
public WebDriver driver;
utility utility;	
	public Login_Page(WebDriver driver) {
		this.driver=driver;
		
	}
	
	By Username=By.xpath("//*[text()=\"Username\"]/parent::node()/following-sibling::node()/child::input");
	By Password=By.xpath("//*[text()=\"Password\"]/parent::node()/following-sibling::node()/child::input");
	By login_button=By.xpath("//button[text()=\" Login \"]");
    By header_element=By.xpath("//header//child::node()[text()=\"Dashboard\"]");


public void settingussername(String username) {
	driver.findElement(Username).sendKeys(username);
	
}

public void settingpassword(String password) {
	driver.findElement(Password).sendKeys(password);
}

public void clickloginbutton() {
	
	driver.findElement(login_button).click();
}
public boolean homepage_headerelement() {
	WebElement headerelement= driver.findElement(header_element);
	boolean result= headerelement.isDisplayed();
	return result;
}

}















