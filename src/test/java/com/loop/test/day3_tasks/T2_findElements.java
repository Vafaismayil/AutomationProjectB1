package com.loop.test.day3_tasks;

import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T2_findElements {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(DocuportConstants.DOCUPORT_URL);
        WebElement userName = driver.findElement(By.id("input-14"));
      userName.sendKeys(DocuportConstants.USERNAME_CLIENT) ;
        WebElement password = driver.findElement(By.id("input-15"));
        password.sendKeys(DocuportConstants.PASSWORD_CLIENT);
//        WebElement login= driver.findElement(By.className("v-btn__content") );
//        login.click() ;
//        WebElement name= driver.findElement(By.xpath("//h3[.='Services']") );
//
//
//        System.out.println("name.isDisplayed() = " + name.isDisplayed());

        //span(contains(text(),'Log in'))


//        System.out.println("docu.isDisplayed() = " + docu.isDisplayed());
//       List< WebElement > elements= driver.findElements(By.tagName("input"));
//        System.out.println("elements.size() = " + elements.size());
//        for (WebElement element : elements) {
//            System.out.println("element.getText() = " + element.getText());
//        }

    }
}
