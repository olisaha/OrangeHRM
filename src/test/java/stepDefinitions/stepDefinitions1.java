package stepDefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.Home_Page;
import pageObjects.Login_Page;
import utils.testContextSetup;

public class stepDefinitions1 {
public WebDriver driver;
Login_Page lp;
Home_Page hp;
testContextSetup testcontextsetup;

public stepDefinitions1(testContextSetup testcontextsetup) {
	this.testcontextsetup = testcontextsetup;
}


	@Given("the user logs in using valid credentials")
public void the_user_logs_in_using_valid_credentials() throws IOException {
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		prop.load(fis);
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		lp=testcontextsetup.pageobjectmanager.getLogin_page();
		hp=testcontextsetup.pageobjectmanager.gethome_page();
		lp.settingussername(username);
        lp.settingpassword(password);
        lp.clickloginbutton();
}
@Then("the user validates whether the Logo of the page is present")
public void the_user_validates_whether_the_logo_of_the_page_is_present() {
	
	boolean logo_check=hp.Validating_logo();
	Assert.assertEquals(logo_check, true);

}
@Then("user validates wheteher {int} elements are present in the side panel")
public void user_validates_wheteher_elements_are_present_in_the_side_panel(Integer int1) {
    int numberofelementsdisplayed= hp.calculating_number_of_elements();
    Assert.assertEquals(numberofelementsdisplayed, int1);
}
@Then("validates whether each side panel elements open corresponding link")
public void validates_whether_each_side_panel_elements_open_corresponding_link() {
    boolean element_check1=hp.validating_element("Admin");
    Assert.assertEquals(element_check1, true);
    boolean element_check2=hp.validating_element("PIM");
    Assert.assertEquals(element_check2, true);
    boolean element_check3=hp.validating_element("Leave");
    Assert.assertEquals(element_check3, true);
    boolean element_check4=hp.validating_element("Time");
    Assert.assertEquals(element_check4, true);
    boolean element_check5=hp.validating_element("Recruitment");
    Assert.assertEquals(element_check5, true);
    boolean element_check6=hp.validating_element("Performance");
    Assert.assertEquals(element_check6, true);
    boolean element_check7=hp.validating_element("Dashboard");
    Assert.assertEquals(element_check7, true);
    boolean element_check8=hp.validating_element("Directory");
    Assert.assertEquals(element_check8, true);
    boolean element_check9=hp.validating_element("Claim");
    Assert.assertEquals(element_check9, true);
    boolean element_check10=hp.validating_element("Buzz");
    Assert.assertEquals(element_check10, true);
   boolean maintenance_validate=hp.validating_Maintenance_button();
   Assert.assertEquals(maintenance_validate, true);
}
}