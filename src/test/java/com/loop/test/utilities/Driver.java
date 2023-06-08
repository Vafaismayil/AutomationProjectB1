package com.loop.test.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {

    private Driver(){}
    private static WebDriver driver;

    public static WebDriver getDriver(){
        if(driver==null){
            String browserType=ConfigurationReader.getProperty("browser") ;
            switch (browserType.toLowerCase()){
                case "chrome":
                    WebDriverManager.chromedriver() .setup();
                    driver= new ChromeDriver() ;
                    break;
                case "firefox":
                    WebDriverManager.chromedriver() .setup();
                    driver= new ChromeDriver() ;
                    break;
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10) );
        }
        return driver;
    }
        public static void closeDriver(){
        if(driver!=null){
            driver.quit();
            driver= null;
        }
        }


}
