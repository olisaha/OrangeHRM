package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Admin_Page;
import pageObjects.Home_Page;
import pageObjects.Login_Page;
import utils.testContextSetup;

public class stepDefinitions2 {public WebDriver driver;
Login_Page lp;
Home_Page hp;
Admin_Page ap;
testContextSetup testcontextsetup;

public stepDefinitions2(testContextSetup testcontextsetup) {
	this.testcontextsetup = testcontextsetup;
}
	
	@When("user clicks {string} button from the side panel")
	public void user_clicks_button_from_the_side_panel(String element) {
		hp=testcontextsetup.pageobjectmanager.gethome_page();
		hp.clicking_element(element);
		
	}
	@When("the user deletes {string} user from Records tab")
	public void the_user_deletes_admin_user_from_records_tab(String user) {
	    ap=testcontextsetup.pageobjectmanager.getadmin_page();
	    ap.scroll_page();
	    ap.record_editing(user);
	}
	@Then("user should receive message")
	public void user_should_receive_an_error_message() {
	    ap.message_capture();
	}
	
}
