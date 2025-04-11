package Action;

import org.openqa.selenium.support.PageFactory;
import Locators.RegisterPageLocators;
import Utilities.HelperClass;

public class RegisterAction {
    RegisterPageLocators objRegLocator;
public RegisterAction() {
        objRegLocator = new RegisterPageLocators();
        PageFactory.initElements(HelperClass.getDriver(), objRegLocator);
    }
 public void ClickMyAccount() {
          objRegLocator.MyAccount.click();
    }
public void ClickRegister() {
    objRegLocator.Register.click();
    }
public String assertRegPage() {
        return objRegLocator.RegisterPageAssertion.getText();
    }public void credentials(String firstName, String lastName, String email, String telephone, String password, String confirmPassword) {
         objRegLocator.firstName.sendKeys(firstName);
        objRegLocator.lastName.sendKeys(lastName);
        objRegLocator.Email.sendKeys(email);
        objRegLocator.Telephone.sendKeys(telephone);
        objRegLocator.Password.sendKeys(password);
        objRegLocator.confirmPassword.sendKeys(confirmPassword);
        objRegLocator.terms.click();
        objRegLocator.continueButton.click();
    }
public String registerSuccess() {
        return objRegLocator.RegisterSuccess.getText();
    }


}
