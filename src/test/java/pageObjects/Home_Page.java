package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.utility;

public class Home_Page {
	public WebDriver driver;
	utility utility;
		public Home_Page(WebDriver driver,utility utility ) {
			this.driver=driver;
			this.utility=utility;
			
		}
		
    By logo= By.xpath("//header//preceding-sibling::node()//a");
    By Username=By.xpath("//*[text()=\"Username\"]/parent::node()/following-sibling::node()/child::input");
	By Password=By.xpath("//*[text()=\"Password\"]/parent::node()/following-sibling::node()/child::input");	
    By Maintainace_button= By.xpath("//*[text()=\"Maintenance\"]//parent::a");
    By maintenancepage_confirm_button= By.xpath("//button[text()=\" Confirm \"]");
    By maintenance_header= By.xpath("//header//child::node()[text()=\"Maintenance\"]");
public boolean Validating_logo() {
	
	WebElement logo_element= driver.findElement(logo);
	Boolean res1= logo_element.isDisplayed();
	return res1;
}
public int calculating_number_of_elements() {
	List<WebElement> side_panel_elements= driver.findElements(By.xpath("//*[@class=\"oxd-main-menu\"]//li"));
	int number_of_elements= side_panel_elements.size();
	return number_of_elements;
	
}
public void clicking_element(String element) {
	By element_xpath = By.xpath("//*[text()='"+element+"']//parent::a");
	driver.findElement(element_xpath).click();
	}

public  boolean validating_element(String element) {
	By element_xpath = By.xpath("//*[text()='"+element+"']//parent::a");
	driver.findElement(element_xpath).click();
	By element_header= By.xpath("//header//child::node()[text()='"+element+"']");
	utility.explicitwait(element_header);
    Boolean res=driver.findElement(element_header).isDisplayed();
    return res;
}
public boolean validating_Maintenance_button() {
	 driver.findElement(Maintainace_button).click();
	 WebElement password=driver.findElement(Password);
	 utility.javascript(password);
	 password.sendKeys("admin123");
	 driver.findElement(maintenancepage_confirm_button).click();
	 WebElement maintenace_header=driver.findElement(maintenance_header);
	 Boolean result = maintenace_header.isDisplayed();
	 return result;
}

}