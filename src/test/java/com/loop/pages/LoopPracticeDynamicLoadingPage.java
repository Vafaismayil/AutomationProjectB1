package com.loop.pages;


import com.loop.test.utilities.BrowserUtils;
import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoopPracticeDynamicLoadingPage {


    public LoopPracticeDynamicLoadingPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//div[@id='alert']")
    public WebElement doneMessage;

    @FindBy(xpath = "//img[@src='/img/a-few-moments.jpg']")
    public WebElement image;
    LoopPracticeDynamicLoadingPage page;

    @BeforeMethod
    public void setUp(){
        page = new LoopPracticeDynamicLoadingPage();
        Driver.getDriver().get(ConfigurationReader.getProperty("loop.practice"));
    }
    @Test
    public void test_method(){
        BrowserUtils.loopLinkClick("Context Menu");
    }




}



//    public static void loopLinkClick(String nameOfthePage){
//        WebElement element = Driver.getDriver().findElement(By.xpath("//a[.='" + nameOfthePage + "']"));
//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.elementToBeClickable(element));
//        element.click();}
//
//
//    LoopPracticeDynamicLoadingPage page;
//
//    @BeforeMethod
//    public void setUp(){
//        page = new LoopPracticeDynamicLoadingPage();
//        Driver.getDriver().get(ConfigurationReader.getProperty("loop.practice"));
//    }

//    @Test
//    public void test_method(){
//        BrowserUtils .loopLinkClick("Context Menu");
//    }


