package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocator {

	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
	public WebElement Login;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/form/input")
	public WebElement Loginn;
@FindBy(xpath="//*[@id=\"content\"]/h2[1]")
	public WebElement EditAccount;
	
	@FindBy(xpath="//*[@id=\"account-login\"]/div[1]")
	public WebElement Error;
	
	
	@FindBy(id = "input-email")
    public WebElement Email;

  @FindBy(id = "input-password")
    public WebElement Password;
	
}
