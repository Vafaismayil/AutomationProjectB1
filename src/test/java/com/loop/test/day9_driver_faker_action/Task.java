package com.loop.test.day9_driver_faker_action;

import com.github.javafaker.Faker;
import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class Task {
    @Test
   public void test() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("etsy.url") );
        WebElement element = Driver.getDriver().findElement(By.id("email-list-signup-email-input") );
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(element ).perform() ;
        Faker faker = new Faker();
        element.sendKeys(faker.internet().emailAddress() + Keys.ENTER);

        Thread.sleep(3000);
        WebElement message = Driver.getDriver().findElement(By.className("wt-alert wt-alert--inline wt-alert--success-01 wt-text-body-01") );
       String actual = message.getText();
        Assert.assertEquals(actual,"Great! We've sent you an email to confirm your subscription.",message + "dosen't match");
    }
}
