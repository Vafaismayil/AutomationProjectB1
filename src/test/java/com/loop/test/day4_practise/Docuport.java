package com.loop.test.day4_practise;

import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Docuport {
    public static void main(String[] args) throws InterruptedException {


//        1. go to docuport app
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get(DocuportConstants.DOCUPORT_URL);
        WebElement userName = driver.findElement(By.cssSelector("input#input-14"));
        userName.sendKeys("b1g1_client@gmail.com");
        WebElement password = driver.findElement(By.cssSelector("input#input-15"));
        password.sendKeys(DocuportConstants.PASSWORD_CLIENT);
        WebElement login = driver.findElement(By.cssSelector("span[class='v-btn__content']"));
        login.click();
//        2. validate that Home, Received docs, My uploads, Invitations are displayed
        // List<WebElement >elements= driver.findElements(By.xpath("//i[@aria-hidden='true']") ) ;
        Thread.sleep(3000);
        WebElement home = driver.findElement(By.cssSelector("i[class='v-icon notranslate mdi mdi-home theme--light']"));
        if (home.isDisplayed()) {
            System.out.println("Home is displayed");
        } else {
            System.out.println("Home is not displayed");
        }
        //  WebElement received= driver.findElement(By.cssSelector(""));

        WebElement received = driver.findElement(By.xpath("//i[@class='v-icon notranslate mdi mdi-folder-download theme--light']"));
        if (received.isDisplayed()) {
            System.out.println("My received is displayed");
        } else {
            System.out.println("My received is not displayed");
        }
        WebElement myupload = driver.findElement(By.cssSelector("i[class='v-icon notranslate mdi mdi-folder-upload theme--light']"));
        if (myupload.isDisplayed()) {
            System.out.println("My upload is displayed");
        } else {
            System.out.println("My upload is not displayed");
        }
        WebElement invitations = driver.findElement(By.xpath("//i[@class='v-icon notranslate mdi mdi-email-open theme--light']"));
        if (invitations.isDisplayed()) {
            System.out.println("My invitations is displayed");
        } else {
            System.out.println("My invitations is not displayed");
        }

//        3. press three lines
        WebElement threeLine = driver.findElement(By.cssSelector("i[class='v-icon notranslate mdi mdi-menu theme--light']"));
        threeLine.click();
        if (threeLine.isDisplayed()) {
            System.out.println("Three line  is displayed");
        } else {
            System.out.println("Three line is not displayed");
        }
        Thread.sleep(3000);
        System.out.println("=========*****=========");
        if (home.isDisplayed()) {
            System.out.println("Home is displayed");
        } else {
            System.out.println("Home is not displayed");
        }

        if (received.isDisplayed()) {
            System.out.println("Received is displayed");
        } else {
            System.out.println("Received is not displayed");
        }

        if (myupload.isDisplayed()) {
            System.out.println("My upload is displayed");
        } else {
            System.out.println("My upload is not displayed");


        }
        if (invitations.isDisplayed()) {
            System.out.println("My invitations is displayed");
        } else {
            System.out.println("My invitations is not displayed");
        }

    }
}
