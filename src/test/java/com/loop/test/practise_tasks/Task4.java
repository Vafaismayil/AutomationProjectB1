package com.loop.test.practise_tasks;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Task4 {
   WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterMethod
    public void tearDown(){
    }
    @Test
    public void testAlert(){
        driver.get("https://demoqa.com/alerts");
       // "alertButton"
        WebElement alert = driver.findElement(By.id("confirmButton") );
        alert.click();
        Alert alert1 = driver.switchTo().alert();
        alert1.accept(); ;
    }

}
