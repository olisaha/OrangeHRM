package pageObjects;

import org.openqa.selenium.WebDriver;

import utils.utility;

public class pageObjectManager {
public Login_Page loginpage;
public Home_Page homepage;
public Admin_Page adminpage;
public WebDriver driver;
utility utility;
public pageObjectManager(WebDriver driver,utility utility)
{
	this.driver = driver;
	this.utility=utility;
}
public Login_Page  getLogin_page() {
	loginpage=new Login_Page(driver);
	return loginpage;
}
public Home_Page gethome_page() {
	homepage= new Home_Page(driver,utility);
	return homepage;
}
public  Admin_Page getadmin_page() {
	adminpage=new Admin_Page(driver,utility);
	return adminpage;
}
}
