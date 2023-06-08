package com.loop.test.practise_tasks;

import com.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Task6 extends TestBase  {
    @Test
            public void test() throws InterruptedException{
        driver.get("https://testedweb.com/");
        WebElement login = driver.findElement(By.xpath("//a[.='Login']"));
        login.click();
        Thread.sleep(2000);


        WebElement signup = driver.findElement(By.xpath("//a[@href='/sign-up']"));
        signup.click();
    }
}
