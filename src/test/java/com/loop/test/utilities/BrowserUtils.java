package com.loop.test.utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
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

    public static void loopLinkClick(String nameOfPage){
        WebElement element = Driver.getDriver().findElement(By.xpath("//a[.='" + nameOfPage + "']"));
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();}

   public  static void hoverOverAnyElement(WebElement element){
       Actions actions = new Actions(Driver.getDriver());
       actions.moveToElement(element).perform();
   }




   public static void  scrollToElemnet(WebElement element){
      JavascriptExecutor js = (JavascriptExecutor )Driver.getDriver();
      js.executeScript("arguments[0[.scrollIntoView(true);",element);
   }

    /**
     * method which scroll to element and click js
     *
     * @param element
     */
    public static void scrollAndClick (WebElement element) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoVie(true);", element);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click;", element);
    }

    /**
     * this method will double click any given element
     * @param element
     *
     */
//    public static  void doubleClick(WebElement element){
//       new Actions(Driver.getDriver().(element) .perform();
//    }

    /**
     * waits for providing element to be visible
     * @param element
     * @param timeToWaitSec
     * return element
     * @author Nadir
     */
    public static WebElement waitForVisibility(WebElement element,int timeToWaitSec){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(timeToWaitSec));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    /**
     * Waits for the provided element to be invisible on the page
     * @param element
     * @param timeToWaitInSec
     *
     * @author nsh
     */
    public static void waitForInVisibility(WebElement element, int timeToWaitInSec) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeToWaitInSec));
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    /**
     * Waits for provided element to be clickable
     * @param element
     * @param timeout
     * @return
     * @author nsh
     */
    public static WebElement waitForClickable(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    /**
     * performs a pause
     * @param seconds
     * @author nsh
     */
    public static void justWait(int seconds){
        try{
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}




