package app;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{
    @Test
    public void accountLoginTest(){
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//span//h6[@class=\"oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module\"]")), "Dashboard");

    }
}
