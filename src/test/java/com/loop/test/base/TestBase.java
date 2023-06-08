package com.loop.test.base;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {
   public WebDriver driver;
    public String actual;
    public String expected;
    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

@AfterMethod
    public void teraDownMethod(){
      //  driver.close();
}
}
