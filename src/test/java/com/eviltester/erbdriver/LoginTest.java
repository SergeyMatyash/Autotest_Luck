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
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class=\"main-menu-items\"]/li[3]")));

        //Login button detection and clicking
        WebElement logginButton = driver.findElement(By.xpath("//li[@ data-index=\"2\"]")); //.click();
        logginButton.click();


        WebElement usernameField = driver.findElement(By.name("userName"));
        WebElement passwordField = driver.findElement(By.name("password"));
        WebElement submit_button = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        usernameField.clear();
        usernameField.sendKeys("greesnm40");
        passwordField.clear();
        passwordField.sendKeys("123asdQ!");
        submit_button.click();



    /*
        driver.close();
        driver.quit(); */
    }
}
