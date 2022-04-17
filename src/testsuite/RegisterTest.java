package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }@Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
        WebElement registerbtn= driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
        registerbtn.click();
        String expectedregisterbtndisplay="Register";
        WebElement actualregisterbtn=driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
        String actualRegisterTabDisplay= actualregisterbtn.getText();
        System.out.println(actualRegisterTabDisplay);
        Assert.assertEquals("verify the text Register:",expectedregisterbtndisplay,actualRegisterTabDisplay);

    }
    @Test
    public void userSholdRegisterAccountSuccessfully(){
        WebElement registerbtn= driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
        registerbtn.click();
     WebElement genderbtn= driver.findElement(By.xpath("//label[contains(text(),'Gender:')]"));
      genderbtn.isDisplayed();
        WebElement male = driver.findElement(By.xpath("//input[@id='gender-male']"));
        WebElement female = driver.findElement(By.xpath("//input[@id='gender-female']"));
        female.click();
        WebElement firstname= driver.findElement(By.xpath("//input[@id='FirstName']"));
        firstname.sendKeys("Kim");
        WebElement lastname= driver.findElement(By.xpath("//input[@id='LastName']"));
        lastname.sendKeys("Marsh");
        WebElement dateofbirthday= driver.findElement(By.name("DateOfBirthDay"));
        dateofbirthday.sendKeys("10");
        WebElement dateofbirthmonth= driver.findElement(By.name("DateOfBirthMonth"));
        dateofbirthmonth.sendKeys("10");
        WebElement dateofbirthyear= driver.findElement(By.name("DateOfBirthYear"));
        dateofbirthyear.sendKeys("2010");
        WebElement emailField = driver.findElement(By.id("Email"));
        System.out.println(emailField);
        emailField.sendKeys("xyz1@yahoo.co.uk");
        WebElement passwordField = driver.findElement(By.name("Password"));
        System.out.println(passwordField);
        passwordField.sendKeys("Happy12345");
        WebElement confirmpasswordField = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        System.out.println(confirmpasswordField);
        confirmpasswordField.sendKeys("Happy12345");
        driver.findElement(By.id("register-button")).click();
        String expectedregistrationmsgdisplay="Your registration completed";
        WebElement actualregistrationmsgdisplay=driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]"));
        String actualRegistrationmsgDisplay= actualregistrationmsgdisplay.getText();
        System.out.println(actualRegistrationmsgDisplay);
        Assert.assertEquals("verify the Registration msg:",expectedregistrationmsgdisplay,actualRegistrationmsgDisplay);



    }
}
