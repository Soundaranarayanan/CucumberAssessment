package Action;

import org.openqa.selenium.support.PageFactory;

import Locators.LoginPageLocator;
import Locators.RegisterPageLocators;
import Utilities.HelperClass;

public class LoginAction {

	
		 LoginPageLocator objLogLocator;
		 public LoginAction() {
		         objLogLocator = new LoginPageLocator();
		         PageFactory.initElements(HelperClass.getDriver(), objLogLocator);
		     }
		
		public void ClickLog() {
			objLogLocator.Loginn.click();
			
		}
		public String Message() {
	        try {
	            return objLogLocator.EditAccount.getText();
	        } catch (Exception e) {
	            return objLogLocator.Error.getText();
	        }
	    }
	

		public void LoginCredentials(String email, String password) {
			   
			objLogLocator.Email.clear();
			objLogLocator.Email.sendKeys(email);
			objLogLocator.Password.clear();
			objLogLocator.Password.sendKeys(password);
		}
		public void MyAccLogin() {
			objLogLocator.Login.click();
			
		}
	

}
