package com.loop.test.day1_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        String expectedTitle = "Google";
        String expectedUrl = "https://www.google.com/";
        String actualyTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualyTitle);


        if (actualyTitle.contains(expectedTitle)) {
            System.out.println("Actual title : " + actualyTitle + ", matched expected title: " + expectedTitle + ", =>TEST PASS");
        } else {
            {
                System.err.println("Actual title: " + actualyTitle + ", DOES NOT match expected title: " + expectedTitle + ", => TEST FAIL");
            }

            String actualUrl = driver.getCurrentUrl();

            if (expectedUrl.contains(expectedUrl)) {
                System.out.println("Actual Url : " + actualUrl + ", matched expected Url: " + expectedUrl + ", =>TEST PASS");
            } else {
                {
                    System.err.println("Actual Url: " + actualUrl + ", DOES NOT match expected Url: " + expectedUrl + ", => TEST FAIL");
                }
                driver.quit();
            }

        }
    }}
