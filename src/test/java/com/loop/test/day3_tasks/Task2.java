package com.loop.test.day3_tasks;

import com.loop.test.utilities.DemoQaConstants;
import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*=============
1. navigate to docuport application
2. validate placeholders for user name and password
3. without sending username and password click login button
4. validate username and password error messages
*/
public class Task2 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get(DocuportConstants.DOCUPORT_URL );

        //validate placeholders for user name and password
        WebElement userName  = driver.findElement(By.cssSelector("div[class='v-text-field__slot']"));
       String actualUserName= userName.getText() ;
        if(actualUserName.equalsIgnoreCase(DemoQaConstants.EXPECTED_PLACEHOLDER_USER_NAME)){
            System.out.println("Expected placeholder username  " + DemoQaConstants.EXPECTED_PLACEHOLDER_USER_NAME + " matches,with actual username" + actualUserName + ": Tess Passed") ;
        }else{
            System.out.println(" Expected placeholder username " +  DemoQaConstants.EXPECTED_PLACEHOLDER_USER_NAME + " does not matches,with actual username" + actualUserName + "Test Faile");
        }

        WebElement password  = driver.findElement(By.cssSelector("label[for='input-15']"));
        String actualPassword = userName.getText() ;
            if(actualPassword.equalsIgnoreCase(DemoQaConstants.EXPECTED_PLACEHOLDER_USER_PASSWORD)){
                System.out.println("Expected password " + DemoQaConstants.EXPECTED_PLACEHOLDER_USER_PASSWORD + " matches,with actual password" +actualPassword+ ": Tess Passed") ;
            }else{
                System.out.println("Expected password " + DemoQaConstants.EXPECTED_PLACEHOLDER_USER_PASSWORD + " does not matches,with actual password " +actualPassword+ ": Tess Passed") ;
            }

            WebElement login = driver.findElement(By.cssSelector("span[class='v-btn__content']"));
       login.click();
    // validate username and password error messages
       WebElement   userNameError = driver.findElement(By.cssSelector("div[class='v-messages__message']"));
        String actualUserNameError =userNameError .getText() ;

       if(actualUserNameError.equalsIgnoreCase(DocuportConstants.EXPECTED_ERROR_FOR_USERNAME)){
           System.out.print("Test " );
           System.err.println("Pass ");

       }else{
          System.out.println("Tet failed");
       }
       WebElement   passwordErrorMessage = driver.findElement(By.xpath("(//div[@class='v-messages__message'])[2]"));

        String actualPasswordErrorMessage =passwordErrorMessage .getText() ;
        if(actualPasswordErrorMessage.equalsIgnoreCase(DocuportConstants.ERROR_FOR_EMPTY_PASSWORD)){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }}}









