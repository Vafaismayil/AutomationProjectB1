package com.loop.test.day1_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLocatorsPractice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver() ;
        driver.navigate().to("https://demoqa.com/automation-practice-form/");
        driver.manage().window().maximize();
        WebElement firstName = driver.findElement(By.id("firstName"));
           firstName.sendKeys("Huseyn");
        WebElement lastName = driver.findElement(By.id("lastName"));
       lastName.sendKeys("Ismayilzada");

        WebElement genderName = driver.findElement(By.name("Gender"));
        genderName.click();



    }


}
