package com.loop.test.day1_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {
        //setting up the web driver
        WebDriverManager.chromedriver().setup();


        // create amn instance of driver
        WebDriver driver = new ChromeDriver() ;
       // Thread.sleep(3000);

      // driver.get("https://www.etsy.com/");
        driver.manage().window().maximize();
        //Thread.sleep(3000);


        // driver.manage().window().fullscreen();
       // navigate back
        driver.navigate().to("https://www.etsy.com/") ;
        //Thread.sleep(3000);
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

    }}