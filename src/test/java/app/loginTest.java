package app;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginTest extends BaseTest {

    @Test
    public void loginPageTitle(){

        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
    }

    @Test
    public void logoDisplayed(){
        Assert.assertEquals(driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed(), true);
    }
}
