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

import static org.testng.Assert.assertEquals;

public class Task2 {

    //1. go to https://www.etsy.com/
//            2. search for rings
//3. validate that Estimated Arrival shows any time
//3. click Estimated Arrival dropdown
//4. click Select custom date
//5. choose may 30 from dropdown
//6. validate Estimated Arrival shows may 30
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
    public void etsy() {
        driver.get("https://www.etsy.com/");
    WebElement search = driver.findElement(By.xpath("//input[@data-id='search-query']") );
    search.sendKeys("rings") ;
    WebElement searchElement = driver.findElement(By.xpath("(//li[contains(@class,'as-wrap')])[1]"));
    searchElement.click();
    WebElement searchBox = driver.findElement(By.xpath("//span[contains(.,' Estimated Arrival ')]"));
    assertEquals( searchBox.getText(),"Estimated Arrival Any time");
    searchBox.click();
    Select dropdown =new Select( driver.findElement(By.xpath("//select[@name='delivery_days']")));
dropdown.selectByVisibleText("By May 30");
    WebElement may30 = driver.findElement(By.xpath("//span[contains(text(),'Estimated Arrival')]"));
    assertEquals(may30.getText(), "Estimated Arrival By May 30");

}
}
