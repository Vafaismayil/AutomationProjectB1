package com.loop.pages;

import com.loop.test.utilities.BrowserUtils;
import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoopPracticeDynamicLoadingPage {

    /**
     *

     @param nameOfthePage from loop practice page
     once you on the page call it
     @nsh*/
    public static void loopLinkClick(String nameOfthePage){
        WebElement element = Driver.getDriver().findElement(By.xpath("//a[.='" + nameOfthePage + "']"));
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();}


    LoopPracticeDynamicLoadingPage page;

    @BeforeMethod
    public void setUp(){
        page = new LoopPracticeDynamicLoadingPage();
        Driver.getDriver().get(ConfigurationReader.getProperty("loop.practice"));
    }

//    @Test
//    public void test_method(){
//        BrowserUtils .loopLinkClick("Context Menu");
//    }

}
