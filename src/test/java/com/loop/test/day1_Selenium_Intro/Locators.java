package com.loop.test.day1_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver() ;
        driver.navigate().to("https://www.google.com/");
        driver.manage().window().maximize();
       // .id(WebElement searchBox = driver.findElement(By"APjFqb"));
        WebElement searchBoxWithID =driver.findElement(By.name("q"));
        WebElement abutLink = driver.findElement(By.linkText("About"));
       // abutLink.click();
        String textToSearch = "Loop Academy";
//       // searchBox.sendKeys(textToSearch + Keys.ENTER  );
      searchBoxWithID.sendKeys(textToSearch );
        searchBoxWithID.clear();



    }





}
