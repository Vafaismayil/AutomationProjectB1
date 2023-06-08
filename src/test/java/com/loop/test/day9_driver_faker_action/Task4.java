package com.loop.test.day9_driver_faker_action;

import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;

public class Task4 {
    @Test
    public void test(){
        Driver.getDriver().get("https://loopcamp.vercel.app/upload.html");
//        WebElement fileUploadButton = Driver.getDriver().findElement(By.xpath("//a[@href='upload.html']"));
//        fileUploadButton.click();
        WebElement chooseFile = Driver.getDriver().findElement(By.id("file-upload"));
        String path = "/Users/kananismayilzada/Downloads/some-file.txt";
        chooseFile.sendKeys(path);
        WebElement upload = Driver.getDriver().findElement(By.className("button"));
        upload.click();
        String expected = "File uploaded";
        String actual = Driver.getDriver().findElement(By.className("error-code")).getText();
        assertFalse((actual.equals(expected)),"Actual does not match expected");

    }}
