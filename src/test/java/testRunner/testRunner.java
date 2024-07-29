package testRunner;
import java.io.File;




import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src\\test\\java\\features\\Adminpage.feature", glue="stepDefinitions",
plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}	)

public class testRunner extends AbstractTestNGCucumberTests {

}
