package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        //Enter valid user name
        sendTextToElement(By.name("username"),"Admin");
        //Enter valid Password
        sendTextToElement(By.name("password"),"admin123");
        //Click on login button
        clickOnElement(By.xpath("//button[@type='submit']"));

        // This is from requirement
        String expectedMessage= "Dashboard";

        // Find the text element and get the text
        String actualMessage = getTextFromElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']"));

        // Validate actual and expected message
        Assert.assertEquals(expectedMessage,actualMessage);
    }
    @After
    public void testDown(){
        closeBrowser();
    }

}
