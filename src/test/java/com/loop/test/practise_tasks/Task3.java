package com.loop.test.practise_tasks;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Task3 {

    WebDriver driver;
    String actual;
    String expected;
    @BeforeMethod

    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterMethod
    public void tearDownMethod(){
       // driver.close();
    }
    @Test
    public void task(){
        driver.get("https://app.docuport.app/company-formation/resident") ;
        WebElement button = driver.findElement(By.xpath("//label[.='Industry *']"));
        button.click();
    }






}
