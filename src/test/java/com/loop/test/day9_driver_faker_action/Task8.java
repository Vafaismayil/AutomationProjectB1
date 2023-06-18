package com.loop.test.day9_driver_faker_action;

import com.github.javafaker.Faker;
import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class Task8 {
    @Test
    public void registration_test() {
        Driver.getDriver().get(ConfigurationReader.getProperty("loop.practice"));
        WebElement element = Driver.getDriver().findElement(By.xpath("//a[.='Registration Form']"));
        element.click();
        Select jobTitle = new Select(Driver.getDriver().findElement(By.name("job_title"))) ;
        jobTitle.selectByIndex(4 ) ;
        WebElement button = Driver.getDriver().findElement(By.xpath("//input[@id='inlineCheckbox2']") );
        button.click();
        WebElement singUp = Driver.getDriver().findElement(By.id("wooden_spoon"));
        singUp.click();
        List<WebElement> elements =Driver.getDriver().findElements(By.xpath(""));
    }
}
