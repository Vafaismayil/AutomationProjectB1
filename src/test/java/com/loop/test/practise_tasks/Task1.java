package com.loop.test.practise_tasks;

import com.google.common.base.Verify;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    /*
1. Open Chrome browser
2. Go to https://www.etsy.com/
            3. Search for “wooden spoon”
            4. Verify title:
    Expected: “Wooden spoon | Etsy”
  */
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(" https://www.etsy.com/");
        driver.manage().window().maximize();
        WebElement searchBoxWithName= driver.findElement(By.name("search_query") );
        searchBoxWithName.click() ;
        String textToSearch= "wooden spoon";
        searchBoxWithName.sendKeys(textToSearch + Keys.ENTER );

        String expectedTittle2 = "Wooden Spoon | Etsy";
        String actualTittle2= driver.getTitle();
        if (actualTittle2.contains(expectedTittle2)) {

            System.out.println("Actual tittle: " + actualTittle2 + ", matched expected tittle: " + expectedTittle2 + " => TEST PASS");
        }else {

            System.out.println("Actual tittle: " + actualTittle2 + ",   match expected tittle: " + expectedTittle2+ " => TEST FAIL");
        }}}