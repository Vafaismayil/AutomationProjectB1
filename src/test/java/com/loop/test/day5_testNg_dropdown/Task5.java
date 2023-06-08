package com.loop.test.day5_testNg_dropdown;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Task5 {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://app.docuport.app/company-formation/resident");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDownMethod() {
        //driver.close();
    }

    @Test()
    public void testOfVirginia() {
        //What type of business do you want to start? - choose corporation
        //Validate that corporation has been selected
        WebElement corporationButton = driver.findElement(By.xpath("//label[contains(text(),'Corporation')]"));
        corporationButton.click();
        WebElement radioButonOdCorporation = driver.findElement(By.xpath("(//input[@role='radio'])[2]"));
        Assert.assertTrue(radioButonOdCorporation.isSelected());
        WebElement virginiaButton = driver.findElement(By.xpath("//label[contains(text(),'Virginia')]"));
        virginiaButton.click();
        WebElement radioButtonOfVirginia = driver.findElement(By.xpath("(//input[@role='radio'])[5]"));
        Assert.assertTrue(radioButtonOfVirginia.isSelected());
        List<WebElement> elements = driver.findElements(By.xpath("//p[contains(@class,'subtitle-2')]"));
        List<WebElement> elementsPrices = driver.findElements(By.xpath("//p[contains(@class,'text-right body-2')]"));
        Map<String, String> actualMap = new LinkedHashMap<>();
        Map<String, String> expectedMap = new LinkedHashMap<>();
        expectedMap.put("State registration fee", "$50");
        expectedMap.put("Payment processing", "$3");
        expectedMap.put("Service fee", "$150");
        expectedMap.put("Total", "$203");
        for (int i = 0; i < elements.size(); i++) {
            actualMap.put(elements.get(i).getText(), elementsPrices.get(i).getText());
        }
        for (String eachKey : actualMap.keySet()) {
            System.out.println(eachKey + " " + actualMap.get(eachKey));
        }
        Assert.assertEquals(actualMap ,expectedMap);
    }
    @Test ()
    public void testOfMaryland () {
        WebElement MarylandButton = driver.findElement(By.xpath("//label[contains(text(),'Maryland')]"));
        MarylandButton.click();
        WebElement radioButtonOfMaryland = driver.findElement(By.xpath("(//input[@role='radio'])[4]"));
        radioButtonOfMaryland.isSelected();
        List<WebElement> elements = driver.findElements(By.xpath("//p[contains(@class,'subtitle-2')]"));
        List<WebElement> elementsPrices = driver.findElements(By.xpath("//p[contains(@class,'text-right body-2')]"));
        Map<String, String> actualMapTwo = new LinkedHashMap<>();
        Map<String, String> expectedMapTwo = new LinkedHashMap<>();
        Assert.assertTrue(radioButtonOfMaryland.isSelected());
        expectedMapTwo.put("State registration fee", "$170");
        expectedMapTwo.put("Payment processing", "$10.20");
        expectedMapTwo.put("Service fee", "$150");
        expectedMapTwo.put("Total", "$330.20");
        for (int i = 0; i < elements.size(); i++) {
            actualMapTwo.put(elements.get(i).getText(), elementsPrices.get(i).getText());
        }
        for (String eachKey : actualMapTwo.keySet()) {
            System.out.println(eachKey + " " + actualMapTwo.get(eachKey));
        }
        Assert.assertEquals(actualMapTwo, expectedMapTwo);

    }}
