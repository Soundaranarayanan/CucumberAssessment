package Definitions;

import Utilities.HelperClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
 @Before
    public void initializeDriver() {
        HelperClass.setUpDriver();
    }
 @After
    public void closeDriver() {
        HelperClass.tearDown();
    }
}
