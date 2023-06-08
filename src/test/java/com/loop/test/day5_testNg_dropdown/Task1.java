package com.loop.test.day5_testNg_dropdown;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.loop.test.utilities.WebDriverFactory;
import org.apache.commons.lang3.Validate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Task1 {
    WebDriver driver;
    String actual;
    String expected;


    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    //1. go to http://the-internet.herokuapp.com/dropdown
//            2. validate "Please select an option" is selected by default
//3. Choose option 1 and validate that it is selected
//4. Choose option 2 and validate that it is selected
//5. Validate dropdown name is "Dropdown List"
    @Test
    public void test() {
        driver.get("http://the-internet.herokuapp.com/dropdown");
        WebElement name=driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select dropdown = new Select(name);
       // Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        actual = dropdown.getFirstSelectedOption().getText();

        expected = "Please select an option";
        Assert.assertEquals(actual, expected);
        dropdown.selectByValue("1");
        actual = dropdown.getFirstSelectedOption().getText();
        expected = "Option 1";
        Assert.assertEquals(actual,expected);
        dropdown.selectByVisibleText("Option 2") ;
        Assert.assertEquals(dropdown.getFirstSelectedOption().getText(),"Option 2");
            WebElement dropdownList =driver.findElement(By.xpath("//div[@class='example']/h3"));
        Assert.assertEquals(dropdownList.getText(),"Dropdown List");
    }


}
