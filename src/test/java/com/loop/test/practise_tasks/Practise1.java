package com.loop.test.practise_tasks;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Practise1 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.tesla.com");
        WebElement name= driver.findElement(By.xpath("(//h1[contains(text(),'Solar Panels')])[1]"));
        System.out.println(name.isDisplayed());
    }
}
