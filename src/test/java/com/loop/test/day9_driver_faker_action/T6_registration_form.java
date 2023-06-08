package com.loop.test.day9_driver_faker_action;

import com.github.javafaker.Faker;
import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class T6_registration_form {

    @Test
    public void registration_test(){
        Driver.getDriver().get(ConfigurationReader.getProperty("loop.practice"));
        WebElement element = Driver.getDriver().findElement(By.xpath("//a[.='Registration Form']"));
        element.click();
        Faker faker = new Faker();
        WebElement firstname = Driver.getDriver().findElement(By.name("firstname") );
        firstname.sendKeys(faker.name().firstName() ) ;
        WebElement lastName = Driver.getDriver().findElement(By.name("lastname"));
        lastName.sendKeys(faker.name().lastName() ) ;
        WebElement userName= Driver.getDriver().findElement(By.name("username"));
        userName.sendKeys(faker.bothify("###???###") ) ;
        WebElement email= Driver.getDriver().findElement(By.name("email"));
       email.sendKeys(faker.internet().emailAddress() ) ;
        WebElement password= Driver.getDriver().findElement(By.name("password"));
       password.sendKeys(faker.internet().password() ) ;
        WebElement phoneNumber= Driver.getDriver().findElement(By.name("phone"));
       phoneNumber .sendKeys(faker.numerify("###-###-####") ) ;
       WebElement gender = Driver.getDriver().findElement(By.name("gender") );
        gender.click();
       WebElement date = Driver.getDriver().findElement(By.name("birthday") );
       date.sendKeys("08/09/2013") ;
        Select office = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        office.selectByIndex(faker.number().numberBetween(1,9) ) ;
        Select jobTitle = new Select(Driver.getDriver().findElement(By.name("job_title"))) ;
        jobTitle.selectByIndex(4 ) ;
        WebElement button = Driver.getDriver().findElement(By.xpath("//input[@id='inlineCheckbox2']") );
        button.click();
        WebElement singUp = Driver.getDriver().findElement(By.id("wooden_spoon"));
      //  singUp.click();
    }





}
