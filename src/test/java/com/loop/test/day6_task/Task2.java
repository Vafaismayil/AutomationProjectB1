package com.loop.test.day6_task;

import com.loop.test.base.TestBase;
import org.apache.commons.lang3.Validate;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task2 extends TestBase {
//1. go to https://demoqa.com/nestedframes
//            2. Validate "Child Iframe" text
//3. Validate "Parent Iframe" text
//4. Validate the "Sample Nested Iframe page. There are nested iframes in this page. Use browser inspecter or firebug to check out the HTML source. In total you can switch between the parent frame and the nested child frame."

    @Test
    public void iframeTest() {
        driver.get("https://demoqa.com/nestedframes");
        driver.switchTo().frame("frame1");
        driver.switchTo().frame(0);
        WebElement childIframe = driver.findElement(By.xpath("//p[.='Child Iframe']"));
        actual = childIframe.getText();
        expected = "Child Iframe";
        Assert.assertEquals(actual, expected);
        driver.switchTo().parentFrame();
        WebElement parentIframe = driver.findElement(By.xpath("//body[.='Parent frame']"));
        actual = parentIframe.getText();
        expected = "Parent frame";
        Assert.assertEquals(actual, expected);
        driver.switchTo().defaultContent();
        WebElement defaultContent = driver.findElement(By.xpath("//div[contains(text(),'Sample Nested Iframe page.')]"));
        actual = defaultContent.getText();
        expected = "Sample Nested Iframe page. There are nested iframes in this page. Use browser inspecter or firebug to check out the HTML source. In total you can switch between the parent frame and the nested child frame.";
        Assert.assertEquals(actual, expected);
    }}
