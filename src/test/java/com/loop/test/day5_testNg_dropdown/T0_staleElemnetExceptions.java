package com.loop.test.day5_testNg_dropdown;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T0_staleElemnetExceptions {
    //1. Open Chrome browser
    public static void main(String[] args) {


    WebDriver driver = WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10) );

//        2. Go to http://the-internet.herokuapp.com/add_remove_elements/
       driver.get("http://the-internet.herokuapp.com/add_remove_elements/") ;
//        3. Click to “Add Element” button
        //3. Click to “Add Element” button
        WebElement addButton = driver.findElement(By.xpath("//button[contains(text(),'Add Element')]"));
        addButton.click();

        WebElement deleteButton = driver.findElement(By.xpath("//button[contains(text(),'Delete')]"));
        if (deleteButton.isDisplayed()){
            System.out.println("Delete button is displayed ---> TEST PASS");
        } else {
            System.out.println("Delete button is NOT displayed ---> TEST FAIL");
        }

        deleteButton.click();
        try {
            deleteButton.isDisplayed();
        } catch(StaleElementReferenceException e){
            System.out.println("Exception handled");
            System.out.println("Element is not displayed anymore");
        }driver.quit() ;
    }}
