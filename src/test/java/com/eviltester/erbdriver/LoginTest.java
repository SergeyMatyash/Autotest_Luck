package com.eviltester.erbdriver;

import junit.framework.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest {
    @Test
    public void startWebDriver(){

        //Setup
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://luck.com");

        //Waiting until page is loaded
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement login_button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class=\"main-menu-items\"]/li[3]")));

        //Login button detection and clicking
        driver.findElement(By.xpath("//li[@ data-index=\"2\"]")).click();

    /*
        driver.close();
        driver.quit(); */
    }
}
