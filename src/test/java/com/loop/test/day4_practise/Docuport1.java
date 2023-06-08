package com.loop.test.day4_practise;

import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Docuport1 {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get(DocuportConstants.DOCUPORT_URL );
        WebElement userName = driver.findElement(By.cssSelector("input#input-14"));
        userName.sendKeys("b1g1_client@gmail.com");
        WebElement password = driver.findElement(By.cssSelector("input#input-15"));
        password.sendKeys(DocuportConstants.PASSWORD_CLIENT);
        WebElement login = driver.findElement(By.cssSelector("span[class='v-btn__content']"));
        login.click();
           }
        }




