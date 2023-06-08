package com.loop.test.practise_tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup() ;
        WebDriver driver = new ChromeDriver() ;
        driver.manage().window().maximize();
        driver.navigate().to("https://www.gooogle.com");
        WebElement element = driver.findElement(By.id("Loop Academy"));
         element.click() ;

}}
