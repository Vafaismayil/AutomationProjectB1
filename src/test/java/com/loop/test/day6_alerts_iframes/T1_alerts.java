package com.loop.test.day6_alerts_iframes;

import com.loop.test.base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class T1_alerts extends TestBase {


    @Test
    public void informationAlert() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
        WebElement click = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        click.click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(3000);
        alert.accept();
        WebElement success = driver.findElement(By.xpath("//p[@id='result']"));
        String actual = success.getText();
        String expected = "You successfully clicked an alert";
        assertEquals(actual, expected);
        //  WebElement clickOne = driver.findElement(By.xpath("") );
    }

    @Test
    public void confirmationAlert() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
        WebElement clickElemnet = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
        clickElemnet.click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        WebElement success = driver.findElement(By.xpath("//p[@id='result']"));
        String actual = success.getText();
        String expected = "You clicked: Ok";
        assertEquals(actual, expected);
        clickElemnet.click();
        driver.switchTo().alert().dismiss();
        String actual1 = success.getText();
        expected= "You clicked: Cancel";
       assertEquals(actual1,expected);

    }
@Test
    public void promptAlert(){
    driver.get("http://the-internet.herokuapp.com/javascript_alerts");
    WebElement clickJSPrompt = driver.findElement(By.xpath("//button[.='Click for JS Prompt']") );
    clickJSPrompt.click();
    driver.switchTo().alert().sendKeys("Loop Academy") ;
    driver.switchTo().alert().accept();
        WebElement successMessage =driver.findElement(By.xpath("//p[@id='result']"));
        String actual= successMessage.getText();
        String expected = "You entered: Loop Academy";
        assertEquals(actual,expected) ;
}}
