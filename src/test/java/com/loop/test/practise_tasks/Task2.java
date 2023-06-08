package com.loop.test.practise_tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
/*1- Open a chrome browser
2- Go to: https://google.com
3- Click to Gmail from top right.
4- Verify title contains:
Expected: Gmail
5- Go back to Google by using the .back();
6- Verify title equals:
Expected: Google

*/
public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://google.com");
    WebElement google = driver.findElement(By.linkText("Gmail") );
    google.click();
    String expectedTittle = "Gmail";
    String actualTittle = driver.getTitle();
    if (actualTittle.contains(expectedTittle)) {
        System.out.println("Actual tittle: " + actualTittle + ", matched expected tittle: " + expectedTittle + " => TEST PASS");
    } else {
        System.out.println("Actual tittle: " + actualTittle + ", DOES NOT match expected tittle: " + expectedTittle + " => TEST FAIL");
    }
    driver.navigate().back() ;
        String expectedTittle1 = "Google";
        String actualTittle1 = driver.getTitle();
    if (actualTittle1.contains(expectedTittle1)) {
        System.out.println("Actual tittle: " + actualTittle1 + ", matched expected tittle: " + expectedTittle1 + " => TEST PASS");
    } else {
        System.out.println("Actual tittle: " + actualTittle1 + ", DOES NOT match expected tittle: " + expectedTittle1 + " => TEST FAIL");
    }
}}