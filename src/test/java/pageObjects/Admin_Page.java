package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.utility;

public class Admin_Page {public WebDriver driver;
utility utility;
String role;
public Admin_Page(WebDriver driver,utility utility ) {
	this.driver=driver;
	this.utility=utility;
}
By Records_tab=By.xpath("//*[text()=\"Actions\"]");
By record_delete_button= By.xpath("//*[@class=\"oxd-table-card\"]/child::node()/div/div[text()='"+role+"']/ancestor::node()[@role=\"row\"]/child::node()/child::node()[@class=\"oxd-table-cell-actions\"]/button");
By message1= By.xpath("//*[@class=\"oxd-toast-container oxd-toast-container--bottom\"]");
By deleteconfirmation=By.xpath("//button[text()=\" Yes, Delete \"]");
public void scroll_page() {
	WebElement element= driver.findElement(Records_tab);
	utility.scrollbyelement(element);
}
public void  record_editing(String r) {
	WebElement ele= driver.findElement(By.xpath("//*[@class=\"oxd-table-card\"]/child::node()/div/div[text()='"+r+"']/ancestor::node()[@role=\"row\"]/child::node()/child::node()[@class=\"oxd-table-cell-actions\"]/button"));
    utility.javascript(ele);
   
    try{
    	
        driver.findElement(deleteconfirmation).isDisplayed();
    	WebElement delcnfrmation= driver.findElement(deleteconfirmation);
    	utility.javascript(delcnfrmation);
    }
    catch (Exception e){
    	System.out.println("Admin can not be edited");
    }
}
public void message_capture() {
	WebElement message= driver.findElement(message1);
	String mssg=message.getText();
	System.out.println(mssg);
	
}
}