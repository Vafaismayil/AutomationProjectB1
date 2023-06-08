package com.loop.test.day6_task;

import com.loop.test.base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task1 extends TestBase {

    //1. go to https://demoqa.com/alerts
//            2. click - click button to see alert
//3. handle alert
//4. click - On button click, alert will appear after 5 seconds
//5. handle alert
//6. click - On button click, confirm box will appear
//7. click ok and validate - You selected Ok
//8. after that do it again this time cancel and validate - You selected Cancel
//9. click - On button click, prompt box will appear
//10. enter "Loop Academy" and validate You entered Loop Academy
 //   String actual;
 //   String expected;

    @Test
    public void alert() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        WebElement clickElement = driver.findElement(By.id("alertButton"));
        clickElement.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        WebElement clickButton = driver.findElement(By.id("timerAlertButton"));
         clickButton.click();
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
       Thread.sleep(5000);
        WebElement clickElements = driver.findElement(By.id("confirmButton"));
        clickElements.click();
        driver.switchTo().alert().accept();
        WebElement confirm = driver.findElement(By.id("confirmResult"));
        actual = confirm.getText();
        expected = "You selected Ok";
        Assert.assertEquals(actual, expected);
        WebElement clickElementsCancel = driver.findElement(By.id("confirmButton"));
        clickElements.click();
        driver.switchTo().alert().dismiss();
        WebElement confirmBox = driver.findElement(By.id("confirmResult"));
        actual = confirmBox.getText();
        expected = "You selected Cancel";
        Assert.assertEquals(actual, expected);
        WebElement clickPrompt = driver.findElement(By.id("promtButton"));
        clickPrompt.click();
        driver.switchTo().alert().sendKeys("Loop Academy");
        driver.switchTo().alert().accept();
        WebElement appearBox= driver.findElement(By.id("promptResult") );
        actual = appearBox.getText() ;
        expected ="You entered Loop Academy";
        Assert.assertEquals(actual,expected);
    }
}
