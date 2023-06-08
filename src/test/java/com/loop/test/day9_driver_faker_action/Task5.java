package com.loop.test.day9_driver_faker_action;

import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.DocuportUtils;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Task5 {
//    1. login docuport as a advisor
//2. go to my loads
//3. try to upload a file
//            (do not spend more than 20 mins, if you can not, can not)

@Test
    public void test(){
    Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    DocuportUtils.login(Driver.getDriver() ,"advisor") ;
    WebElement myUpload = Driver.getDriver().findElement(By.xpath("//span[.='My uploads']") ) ;
    myUpload.click();
    WebElement button  = Driver.getDriver().findElement(By.xpath("(//span[.='Upload file'])[1]") );
    String path = "/Users/kananismayilzada/Downloads/some-file.txt";
    myUpload.sendKeys(path) ;
}
}
