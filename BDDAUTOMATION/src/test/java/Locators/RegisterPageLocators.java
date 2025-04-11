package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPageLocators {

    @FindBy(xpath = "//a[@title='My Account']")
    public WebElement MyAccount;
 @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")
    public WebElement Register;
 @FindBy(xpath = "//*[@id=\"content\"]/h1")
    public WebElement RegisterPageAssertion;
 @FindBy(id = "input-firstname")
    public WebElement firstName;
 @FindBy(id = "input-lastname")
    public WebElement lastName;
 @FindBy(id = "input-email")
    public WebElement Email;
 @FindBy(id = "input-telephone")
    public WebElement Telephone;
  @FindBy(id = "input-password")
    public WebElement Password;
 @FindBy(id = "input-confirm")
    public WebElement confirmPassword;
 @FindBy(xpath = "//*[@id=\"content\"]/form/div/div/input[1]")
    public WebElement terms;
 @FindBy(xpath = "//*[@id=\"content\"]/form/div/div/input[2]")
    public WebElement continueButton;
  @FindBy(xpath = "//*[@id=\"content\"]/h1")
    public WebElement RegisterSuccess;
}
