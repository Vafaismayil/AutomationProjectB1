package com.loop.test.practise_tasks;

import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Practice4 {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get(DocuportConstants.DOCUPORT_URL);
        WebElement firstName = driver.findElement(By.id("input-14"));
        firstName.sendKeys("b1g1_supervisor@gmail.com") ;
        WebElement lastName = driver.findElement(By.id("input-15"));
        lastName.sendKeys("Group1") ;
        WebElement login= driver.findElement(By.className("v-btn__content") );
        login.click() ;
    }
}
