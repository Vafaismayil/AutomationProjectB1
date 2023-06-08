package com.loop.test.day8_webtables_config;

import com.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T3_payment extends TestBase {


    @Test
    public void docuportRegistration() throws InterruptedException {
        driver.get("https://app.docuport.app/company-formation/resident");
        driver.findElement(By.xpath("(//input[@role='radio'])[2]//following-sibling::div")).click();
        driver.findElement(By.xpath("(//input[@role='radio'])[5]//following-sibling::div")).click();
        driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Loop Academy");
        driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("IT");
        driver.findElement(By.xpath("(//input[@type='text'])[4]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Education & Training')]")).click();
        driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("Mary");
        driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("Bingo");
        driver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys("maryB@gmail.com");
        driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("7036665678");
        driver.findElement(By.xpath("(//input[@type='text'])[9]")).sendKeys("7033457865");
        driver.findElement(By.xpath("(//span[.=' Next '])[1]")).click();
        driver.findElement(By.xpath("(//input[@type='text'])[10]")).sendKeys("Huseyn");
        driver.findElement(By.xpath("(//input[@type='text'])[11]")).sendKeys("Ismayilzada");
        driver.findElement(By.xpath("(//input[@type='text'])[13]")).sendKeys("121000");
        driver.findElement(By.xpath("(//input[@type='text'])[15]")).sendKeys("Fairfax");
        driver.findElement(By.xpath("(//input[@type='text'])[16]")).click();
        driver.findElement(By.xpath("//div[.='Alexandria']")).click();
        driver.findElement(By.xpath("(//input[@type='text'])[17]")).sendKeys("22033");
        driver.findElement(By.xpath("(//input[@type='text'])[19]")).sendKeys("244555355");
        driver.findElement(By.xpath("(//span[.=' Next '])[2]")).click();
        driver.findElement(By.xpath("//label[.='Member managed']")).click();
        driver.findElement(By.xpath("//div[.='Title *']")).click();
        driver.findElement(By.xpath("//div[.='President']")).click();
        driver.findElement(By.xpath("(//input[@type='text'])[21]")).sendKeys("Zeyneb");
        driver.findElement(By.xpath("(//input[@type='text'])[22]")).sendKeys("Ismayilzada");
        driver.findElement(By.xpath("(//input[@type='text'])[24]")).sendKeys("444224444");
        driver.findElement(By.xpath("(//input[@type='text'])[25]")).sendKeys("Huseyn");
        driver.findElement(By.xpath("(//input[@type='text'])[26]")).sendKeys("Ismayilzada");
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys("4");
        driver.findElement(By.xpath("//span[.=' Go to payment ']")).click();
        Thread.sleep(5000);
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//input[@placeholder='Card number']")).sendKeys("4441910078461144");
        driver.switchTo().parentFrame();
        driver.switchTo().frame(1);
        driver.findElement(By.xpath("//input[@placeholder='MM/YY']")).sendKeys("11.26");
        driver.switchTo().defaultContent();
        driver.switchTo().frame(2);
        driver.findElement(By.xpath("//input[@placeholder='CVC']")).sendKeys("444");
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//span[.=' Pay $203 ']")).click();
        WebElement element = driver.findElement(By.xpath("//span[@class='body-1']"));
        String actual = element.getText();
        String expected = "Your card number is invalid.";
        Assert.assertEquals(actual, expected);
    }
}




