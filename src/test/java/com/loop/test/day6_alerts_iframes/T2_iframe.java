package com.loop.test.day6_alerts_iframes;

import com.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class T2_iframe extends TestBase  {
    @Test
    public void iframeTest()throws InterruptedException{
        driver.get("http://the-internet.herokuapp.com/iframe");
        //WebElement iframe = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        //driver.switchTo().frame(iframe);  // switching to iframe
        // driver.switchTo().frame(0);
        driver.switchTo().frame("mce_0_ifr");
        WebElement textBox = driver.findElement(By.xpath("//*[@id='tinymce']"));
        textBox.clear();
        textBox.sendKeys("Loop Academy");
        Thread.sleep(3000);
        driver.switchTo().defaultContent(); // it will take us directly to main html
        // driver.switchTo().parentFrame(); // this will take us to parent frame

        WebElement heading = driver.findElement(By.xpath("//h3[contains(text(),'An iFrame containing')]"));
        String actual = heading.getText();
        String expected = "An iFrame containing the TinyMCE WYSIWYG Editor";
        Assert.assertEquals(actual,expected);
    }
    @Test
   public void amazonIframe(){
        driver.get("https://www.amazon.com");
        List<WebElement>iframe = driver.findElements(By.xpath("//iframe") );
        System.out.println(iframe.size() );
//        driver.switchTo().frame(i) ;


    }



}
