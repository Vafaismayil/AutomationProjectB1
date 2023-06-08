package com.loop.test.day5_testNg_dropdown;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T2_dropdown_options {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/select-menu");
    }

    /*
    1. Open Chrome browser
    2. Go to https://demoqa.com/select-menu
    3. go old style select menu
    4. Select Yellow and validate
    5. Select Red and validate
    6. Select White and validate
    Use all Select options. (visible text, value, index)
     */
    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }
    @Test
    public void colorTest(){

        Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='oldSelectMenu']")));
        dropdown.selectByIndex(0);
        Assert.assertEquals(dropdown.getFirstSelectedOption() .getText(), "Yellow") ;
        dropdown.selectByValue("saab") ;
        Assert.assertEquals(dropdown.getFirstSelectedOption() .getText(), "Red");


        Assert.assertEquals(dropdown.getFirstSelectedOption() .getText(), "White");
    }}
