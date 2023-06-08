package com.loop.test.day7_window_webtable;

import com.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class T1_windows extends TestBase {
// 1. Open a chrome browser
//    2. Go to : http://the-internet.herokuapp.com/windows
//            3. Assert: Title is “The Internet”
//            4. Click to: “Click Here” link
//    5. Switch to new Window.
//    6. Assert: Title is “New Window”

    @Test
    public void test_window_handla(){
        driver.get("http://the-internet.herokuapp.com/windows");
        Assert.assertEquals(driver.getTitle(),"The Internet");
        WebElement click= driver.findElement(By.xpath("//a[.='Click Here']"));
        click.click();
       // Assert
        //h3[.='New Window']

//        WebElement newWindow= driver.findElement(By.xpath("//h3[.='New Window']"));
//        System.out.println(newWindow.getText());
     Set<String> windowHandles=driver.getWindowHandles();
       // System.out.println("this is my window " + driver.getWindowHandle() );

        for (String each : windowHandles) {
            System.out.println(each);
            driver.switchTo().window(each);
            System.out.println();
        }
        WebElement newWindow= driver.findElement(By.xpath("//h3[.='New Window']"));
        System.out.println(newWindow.getText());
//        System.out.println(driver.getTitle());

    }
}
