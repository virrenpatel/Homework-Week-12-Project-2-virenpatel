package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class ForgotPasswordTest extends Utility {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        //Click on the 'Forgot your password' link
        clickOnElement(By.xpath("//p[@class ='oxd-text oxd-text--p orangehrm-login-forgot-header']"));
        // This is from requirement
        String expectedMessage= "Reset Password";
        // Find the text element and get the text
        String actualMessage = getTextFromElement(By.xpath("//button[@type='submit']"));
        // Validate actual and expected message
        Assert.assertEquals(expectedMessage,actualMessage);
    }
    @After
    public void testDown(){
        closeBrowser();
    }
}
