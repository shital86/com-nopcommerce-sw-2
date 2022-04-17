package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void UserShouldNavigateToLoginPageSuccessfully() {
        //Find Login Link and Click on Login Link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        //This is frame requirement
        String expectedText = "Welcome, Please Sign In!";
        //Find the welcome Text element and get the text
        WebElement actualMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String actualMessage = actualMessageElement.getText();
        System.out.println(actualMessage);
        //Validate Actual and Expected message
        Assert.assertEquals("Not navigate to Login Page", expectedText, actualMessage);
    }
        @Test
        public void uservalidCShouldLoginSuccessfullyWithvalidcredentials(){
            //Find Login Link and Click on Login Link
            WebElement loginLink=driver.findElement(By.linkText("Log in"));
            loginLink.click();
            System.out.println("Current Url:" + driver.getCurrentUrl());
            String loginUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
            driver.navigate().to(loginUrl);
            // System.out.println("Current Url:" +driver.getCurrentUrl());
            WebElement emailField = driver.findElement(By.id("Email"));
            System.out.println(emailField);
            emailField.sendKeys("abc@yahoo.com");
            // driver.close();//Close the browser
            WebElement passwordField = driver.findElement(By.name("Password"));//sending password to password field element
            passwordField.sendKeys("abc1234");
            System.out.println(passwordField);
            driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
            String expectedlogoutdisplay="Log out";
            WebElement logoutbtndisplay= driver.findElement(By.xpath("//a[@class='ico-logout']"));
            String logooutbtnDisplay=logoutbtndisplay.getText();
            System.out.println(logooutbtnDisplay);
            Assert.assertEquals("Login successfully:",expectedlogoutdisplay,logooutbtnDisplay);
        }
    @Test
    public void verifyErrorMessageWithInvalidCredentials(){
        //Find Login Link and Click on Login Link
        WebElement loginLink=driver.findElement(By.linkText("Log in"));
        loginLink.click();
        System.out.println("Current Url:" + driver.getCurrentUrl());
        String loginUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        driver.navigate().to(loginUrl);
        // System.out.println("Current Url:" +driver.getCurrentUrl());
        WebElement emailField = driver.findElement(By.id("Email"));
        System.out.println(emailField);
        emailField.sendKeys("abc@yahoo.com");
        // driver.close();//Close the browser
        WebElement passwordField = driver.findElement(By.name("Password"));//sending password to password field element
        passwordField.sendKeys("Boots1519");
        System.out.println(passwordField);
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
        String expectedErrorMessage="Login was unsuccessful. Please correct the errors and try again.\n" +
                "The credentials provided are incorrect";
        WebElement actualErrorMessage= driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
        String actualerrorMessage=actualErrorMessage.getText();
        System.out.println(actualerrorMessage);

        //  WebElement actualErrorMessage= driver.findElement(By.xpath("//button[normalize-space()='Log in']\n"));
        Assert.assertEquals("Error message not Displayed:",expectedErrorMessage,actualerrorMessage);

    }
    @After
    public void tearDown() {
        closeBrowser();
    }
}
