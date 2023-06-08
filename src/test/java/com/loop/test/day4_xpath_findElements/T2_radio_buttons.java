package com.loop.test.day4_xpath_findElements;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T2_radio_buttons {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/radio-button");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement radioButton = driver.findElement(By.xpath("//label[@for='yesRadio']"));
        WebElement radioButtons = driver.findElement(By.xpath("//input[@id='noRadio']"));
        System.out.println("radioButton.isSelected() = " + radioButton.isSelected());
        radioButton.click() ;
        System.out.println("radioButtons.isSelected() = " + radioButton.isSelected());
        System.out.println(radioButtons.isEnabled());

    }
}