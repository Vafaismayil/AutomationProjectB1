package com.loop.test.day4_xpath_findElements;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class T1_findElements {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://www.nba.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//old selenium 3
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10) ) ;//selenium 4
        List<WebElement> nbaLinks = driver.findElements(By.tagName("a"));

        System.out.println("nbaLinks = " + nbaLinks.size());

        List<WebElement> nbaLinksXpath = driver.findElements(By.xpath("//a"));
        System.out.println("nbaLinksXpath = " + nbaLinksXpath.size());
        for (WebElement nbaLink : nbaLinks) {
            if(!nbaLink.getText().equals("")) {
                System.out.println("nbaLink = " + nbaLink.getText());
                System.out.println("nbaLink = " + nbaLink.getAttribute("href"));
            }
        }

        for (int i = 0; i < nbaLinks.size(); i++) {
            if(!nbaLinks.get(i).getText().equals("")) {
                System.out.println("nbaLink = " + nbaLinks.get(i).getText());
                System.out.println("nbaLink = " + nbaLinks.get(i).getAttribute("href"));
            }

    }}}
