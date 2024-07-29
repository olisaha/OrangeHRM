package stepDefinitions;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Login_Page;
import utils.DataReader;
import utils.testContextSetup;

public class stepDefinitions {
	public WebDriver driver;
	Login_Page lp;
	List<HashMap<String, String>> datamap; // Data driven
	testContextSetup testcontextsetup;

	public stepDefinitions(testContextSetup testcontextsetup) {
		this.testcontextsetup = testcontextsetup;
	}
	
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
	   
	}
	@When("user gives  username and password with excel row {string}")
	public void user_gives_username_and_password_with_excel_row(String rows) {
	    try {
	    	datamap = DataReader.data(System.getProperty("user.dir") + "\\testData\\login_data_orangeHRM.xlsx", "Sheet1");
			int index = Integer.parseInt(rows) - 1;
			String username = datamap.get(index).get("username");
			String password = datamap.get(index).get("password");
	    	lp=testcontextsetup.pageobjectmanager.getLogin_page();
	    	lp.settingussername(username);
	    	lp.settingpassword(password);
	    
	}catch (Exception e) {
		e.printStackTrace();}}
	
	@When("clicks on the login button")
	public void clicks_on_the_login_button() {
	    lp.clickloginbutton();
	}
	@Then("user validates whether login was successsfull")
	public void user_validates_whether_login_was_successsfull() {
		boolean result=lp.homepage_headerelement();
		Assert.assertEquals(result,true);
		
	}
}
