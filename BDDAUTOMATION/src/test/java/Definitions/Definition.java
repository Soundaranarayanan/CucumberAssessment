package Definitions;

import org.testng.Assert;

import Action.LoginAction;
import Action.RegisterAction;
import Utilities.HelperClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Definition {
    RegisterAction objRegAction = new RegisterAction();
    LoginAction objLogAction = new LoginAction();
@Given("user is on the {string}")
    public void register(String url) {
        HelperClass.openPage(url);
    }
 @When("user clicks My Account")
    public void user_clicks_my_account() {
        objRegAction.ClickMyAccount();
    }
 @When("user clicks Register")
    public void user_clicks_register() {
        objRegAction.ClickRegister();
    }
@Then("user should see the registration page")
    public void user_should_see_the_registration_page() {
        String text = objRegAction.assertRegPage();
        Assert.assertTrue(text.contains("Register Account"));
    }
@Then("user enters required credentials {string} {string} {string} {string} {string} {string}")
    public void user_enters_required_credentials(String firstName, String lastName, String email, String telephone, String password, String confirmPassword) {
        objRegAction.credentials(firstName, lastName, email, telephone, password, confirmPassword);
    }
@Then("user should be registered successfully")
    public void user_should_be_registered_successfully() {
        String text = objRegAction.registerSuccess();
        Assert.assertTrue(text.contains("Your Account Has Been Created!"));
    }

@When("user clicks Login")
public void user_clicks_login() {
    objLogAction.MyAccLogin();
}

@When("User enters email {string} and password {string}")
public void user_enters_email_and_password(String email, String password) {
   objLogAction.LoginCredentials(email,password);
}

@When("User clicks on Login button")
public void user_clicks_on_login_button() {
objLogAction.ClickLog();
}

@Then("user should see {string} message")
public void user_should_see_message(String expected) {
  
	String text = objLogAction.Message();
	 Assert.assertTrue(text.contains(expected));
}



}
