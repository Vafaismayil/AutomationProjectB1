package com.loop.test.practise_tasks;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T1_Practice {
   WebDriver driver;
    @BeforeMethod
        public void setUpMethod(){
             driver=WebDriverFactory .getDriver("chrome") ;
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10) );
        driver.get("https://google.com");
        }






    @Test
    public void googleTitle(){
//        WebDriver driver= WebDriverFactory.getDriver("chrome") ;
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10) );

       // WebElement title= driver.findElement(By.xpath("") );
        String actual = driver.getTitle();
        String expected ="Google";
        Assert .assertEquals(actual,expected);

    }
@Test
public void about(){
        WebElement about= driver.findElement(By.xpath("//a[contains(.,'About')]") );
       String actual = about.getText();
        String expected= "About";
        Assert.assertEquals(actual,expected) ;
}

}
