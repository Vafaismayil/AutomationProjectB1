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

public class T1_simple_drodown {
WebDriver driver;
String expected= "Please select an option";
String actual;
    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

//1. Open Chrome browse
    //2. Go to http://the-internet.herokuapp.com/dropdown
    //3. Verify “Dropdown list” default selected value is correct - Expected: “Please select an option

   @Test
    public void test(){
        driver.get("http://the-internet.herokuapp.com/dropdown");
//        WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown']"));
//       Select dropdown1= new Select(dropdown) ;
       Select dropdown2 = new Select(driver.findElement(By.xpath("//select[@id='dropdown']") ));
     actual=  dropdown2.getFirstSelectedOption().getText() ;
       Assert.assertEquals(actual,expected,"Does not match") ;

   }
   @AfterMethod
    public void tearDown(){
        driver.close();
   }




}
