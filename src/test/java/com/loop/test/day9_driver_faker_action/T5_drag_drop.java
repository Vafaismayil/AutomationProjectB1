package com.loop.test.day9_driver_faker_action;

import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T5_drag_drop {
    /*
   1- Open a chrome browser
   2- Go to: https://demo.guru99.com/test/drag_drop.html
   3- Drag “BANK” and drop into Account area under Debit Side
   4- Drag “5000” and drop into Amount area under Debit Side
   5- Drag “SALES” and drop into Account area under Credit Side
   6- Drag “5000” and drop into Amount area under Credit Side

   7- Validate “Perfect!” text displayed.
    */
    @Test
    public void drag_drop(){
        Driver.getDriver().get(ConfigurationReader.getProperty("guru.drag"));
        WebElement bank =Driver.getDriver().findElement(By.partialLinkText("BANK"));
        WebElement deb = Driver.getDriver().findElement(By.id("bank"));
        Actions action = new Actions(Driver.getDriver());
        action.dragAndDrop(bank,deb).perform();
        WebElement five = Driver.getDriver().findElement(By.xpath("//a[.=' 5000 ']") );
        WebElement debitAmount = Driver.getDriver().findElement(By.id("amt7") );
        action.dragAndDrop(five,debitAmount ).perform();
        WebElement sales = Driver.getDriver().findElement(By.xpath("//a[contains(text(),'SALES')]"));
        WebElement creditAccount = Driver.getDriver().findElement(By.xpath("//*[@id='loan']/li"));

        action.dragAndDrop(sales,creditAccount).perform();

        WebElement creditAmount = Driver.getDriver().findElement(By.id("amt8"));

        action.dragAndDrop(five, creditAmount).perform();

        WebElement successMessage = Driver.getDriver().findElement(By.xpath("//a[contains(.,'Perfect')]"));
        String expected = "Perfect!";
        String actual = successMessage.getText();

        Assert.assertEquals(actual, expected, "actual: " + actual + " does not match expected: " + expected);




    }




}