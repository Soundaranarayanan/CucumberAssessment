package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = {
        "src/test/resources/Features/Register.feature",
        "src/test/resources/Features/Login.feature",
       
    },
    glue = "Definitions",
    plugin = {
        "pretty",
        "html:target/cucumber-reports1.html",
        "json:target/cucumber1.json",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
    }

)
public class runnerTestNG extends AbstractTestNGCucumberTests {
}
