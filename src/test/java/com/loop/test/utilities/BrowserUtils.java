package com.loop.test.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {
    /**
     * @param driver
     * @param expectedUrl
     * @param expectedTitle
     **/

    public static void switchWindowAndValidate(WebDriver driver, String expectedUrl, String expectedTitle) {
        Set<String> windowsHandles = driver.getWindowHandles();
        expectedUrl = expectedUrl.toLowerCase();
        expectedTitle = expectedTitle.toLowerCase();
        for (String each : windowsHandles) {
            // System.out.println("each window handle:  = " + each);
            driver.switchTo().window(each);
            if (driver.getCurrentUrl().toLowerCase().contains(expectedUrl)) {
                break;
            }
        }
        Assert.assertTrue(driver.getTitle().toLowerCase().contains(expectedTitle));
    }

    public static void switchToWindow(WebDriver driver, String targetTitle) {
        String origin = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
            if (driver.getTitle().contains(targetTitle)) {
                return;
            }
        }
        driver.switchTo().window(origin);}

        /**
         *
         */
        public static void validateTitle(WebDriver driver,String expectedTitle) {
       Assert.assertEquals(driver.getTitle() ,expectedTitle); ;
    }
}




