package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
//Open the baseUrl
        openBrowser(baseUrl);
    }

    @Test
    public void UserShouldNavigateToComputerPageSuccessfully() {
        //Relative xpath
        WebElement computertab = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//li//a[contains(text(),'Computers')]"));
        computertab.click();
        String expectedcomputerstab = "Computers";
        WebElement actualcomputertabdisplay = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//li//a[contains(text(),'Computers')]"));
        //Using .getText() method---Retrieve the text for a particular WebElement
        String actualcomputertabbtn = actualcomputertabdisplay.getText();
        System.out.println(actualcomputertabbtn);
        //Using Assert to compare the expected and actual result
        Assert.assertEquals("Computers text matching:", expectedcomputerstab, actualcomputertabbtn);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        WebElement electronicstab = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//li//a[contains(text(),'Electronics')]"));
        electronicstab.click();
        String expectedelectronicstab = "Electronics";
        WebElement actualelectronicstabdisplay = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//li//a[contains(text(),'Electronics')]"));
        String actualelectronicstabbtn = actualelectronicstabdisplay.getText();
        System.out.println(actualelectronicstabbtn);
        Assert.assertEquals("Electronics text matching:", expectedelectronicstab, actualelectronicstabbtn);

    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        WebElement Appareltab = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[3]/a[1]"));
        Appareltab.click();
        String expectedappareltab = "Apparel";
        WebElement actualappareldisplay = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[3]/a[1]"));
        String actualappareldisplaytab = actualappareldisplay.getText();
        System.out.println(actualappareldisplaytab);
        Assert.assertEquals("Apparel tab text matching:",expectedappareltab, actualappareldisplaytab);
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        WebElement digitaldownloadtab= driver.findElement(By.xpath("//body[1]/div[6]/div[2]/ul[1]/li[4]/a[1]"));
        digitaldownloadtab.click();
        String expecteddigitaldownloadtabdiaplay="Digital downloads";
        WebElement actualdigitaldownloaddisplay= driver.findElement(By.xpath("//body[1]/div[6]/div[2]/ul[1]/li[4]/a[1]"));
        String actualdigitaldownloadTabDisplay=actualdigitaldownloaddisplay.getText();
        System.out.println(actualdigitaldownloadTabDisplay);
        Assert.assertEquals("Digital downloads tab  text matching:",expecteddigitaldownloadtabdiaplay,actualdigitaldownloadTabDisplay);
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        WebElement bookstab= driver.findElement(By.xpath("//body[1]/div[6]/div[2]/ul[1]/li[5]/a[1]"));
        bookstab.click();
        String expectedBookstabtextdisplay="Books";
        WebElement actualbookstabdisplay= driver.findElement(By.xpath("//body[1]/div[6]/div[2]/ul[1]/li[5]/a[1]"));
        String actualbooksTabDisplay= actualbookstabdisplay.getText();
        System.out.println(actualbooksTabDisplay);
        Assert.assertEquals("Books tab text matching:",expectedBookstabtextdisplay,actualbooksTabDisplay);
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        WebElement jewelrytab= driver.findElement(By.xpath("//body[1]/div[6]/div[2]/ul[1]/li[6]/a[1]"));
        jewelrytab.click();
        String expectedjewelrytabdisplay="Jewelry";
        WebElement actualjewelrytabdisplay= driver.findElement(By.xpath("//body[1]/div[6]/div[2]/ul[1]/li[6]/a[1]"));
        String actualJewelryTabTextDisplay= actualjewelrytabdisplay.getText();
        System.out.println(actualJewelryTabTextDisplay);
        Assert.assertEquals("Jewelry tab text matching ",expectedjewelrytabdisplay,actualJewelryTabTextDisplay);
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        WebElement giftcardstab= driver.findElement(By.xpath("//body[1]/div[6]/div[2]/ul[1]/li[7]/a[1]"));
        giftcardstab.click();
        String expectedgiftcardtabdisplay="Gift Cards";
        WebElement actualgiftcardstabtextdisplay= driver.findElement(By.xpath("//body[1]/div[6]/div[2]/ul[1]/li[7]/a[1]"));
        String actualgiftcardsTabDisplay= actualgiftcardstabtextdisplay.getText();
        System.out.println(actualgiftcardsTabDisplay);
        Assert.assertEquals("Gift cards Tabs text matching:",expectedgiftcardtabdisplay,actualgiftcardsTabDisplay);

    }
}
