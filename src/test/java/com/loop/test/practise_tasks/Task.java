package com.loop.test.practise_tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
  /*1. Open Docuport app
2. Send UserName
3. Send password
4. Click login

make sure inputs which have numbers are dynamic or not

*/
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://beta.docuport.app/");
        driver.manage().window().maximize();
        WebElement firstName = driver.findElement(By.id("input-14"));
        firstName.sendKeys("b1g1_supervisor@gmail.com") ;
        WebElement lastName = driver.findElement(By.id("input-15"));
       lastName.sendKeys("Group1") ;
       WebElement login= driver.findElement(By.className("v-btn__content") );
       login.click() ;
        driver.quit() ;
    }
}
