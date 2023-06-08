package com.loop.test.day4_xpath_findElements;

import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.ScriptTimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T00_xpath_getText_staleElement {
    public static void main(String[] args) throws InterruptedException{
//        1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


//        2. Go to docuport
        driver.get("https://beta.docuport.app/");
//        3. Click on forgot passwor
        WebElement password = driver.findElement(By.xpath(("//a[.='Forgot password?']")));
        password.click();
//        4. validate URL contains: reset-password

        String actualPassword = driver.getCurrentUrl();
        if (actualPassword.contains(DocuportConstants.RESET_PASSWORD_URL)) {
            System.out.println("Actual " + actualPassword + " contains url: " + DocuportConstants.RESET_PASSWORD_URL);
        } else {
            System.out.println("Actual " + actualPassword + " does not contains url: " + DocuportConstants.RESET_PASSWORD_URL);
        }

        // 5 . validate - Enter the email address associated with your account

        WebElement validateMessage = driver.findElement(By.xpath("//div[@class='v-messages__message']"));
        String actualValidateMessage = validateMessage.getText();
        System.out.println("actualValidateMessage = " + actualValidateMessage);
        if (actualValidateMessage.contains(DocuportConstants.RESET_PASSWORD_MESSAGE)) {
            System.out.println("Actual validate message: \"" + actualValidateMessage + "\" contains expected message \"" + DocuportConstants.RESET_PASSWORD_MESSAGE);
        } else {
            System.out.println("Actual validate message: \"" + actualValidateMessage + "\" doesnt contains expected message \"" + DocuportConstants.RESET_PASSWORD_MESSAGE);
        }


//        6. enter forgotpasswordg1@gmail.com to email box
        WebElement emailBox = driver.findElement(By.xpath("//input[@type='email']") );
        emailBox.sendKeys(DocuportConstants.EMAIL_FOR_RESET_PASSWORD);

//        7. validate cancel button is displayed
        WebElement cancel = driver.findElement(By.xpath("//span[.=' Cancel ']") );
        System.out.println("cancel.isDisplayed() = " + cancel.isDisplayed());
//        8. validate send button is displayed
        System.err.println("cancel.isDisplayed() = " + cancel.isDisplayed());
//        9. click send button
        WebElement sendButton= driver.findElement(By.xpath("//span[.=' Send ']") );
        if(sendButton.isDisplayed()){
            System.out.println("TEST PASS => Send button is displayed");
        } else {
            System.err.println("TEST FAILED => Send button is NOT displayed");
        }
        sendButton.click() ;
        Thread.sleep(3000) ;
//        10. validate - We've sent you an email with a link to reset your password. Please check your email

        WebElement successMesage = driver.findElement(By.xpath("//span[@class='body-1']") );
   Thread.sleep(50000);
       // System.out.println("successMesage.getText() = " + successMesage.getText());



        try{
            System.out.println("successMesage.getText() = " + successMesage.getText());
        }catch(ScriptTimeoutException e){
            System.out.println("Element is not accessible anymore");
            e.printStackTrace();
        }
   }


}