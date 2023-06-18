package com.loop.pages;

import com.loop.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebOrderPage {
    public WebOrderPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
@FindBy(xpath="//input[@type='text']")
public WebElement username;

@FindBy(xpath="//input[@type='password']")
public WebElement password;
@FindBy(xpath="//input[@value='Login']")
    public WebElement login;
@FindBy(xpath="//a[.='Order']")
    public WebElement order;
@FindBy(xpath="(//input[@type='text'])[1]")
    public WebElement quantity;
@FindBy(xpath="//input [@type='submit']")
public WebElement calculateButton;

@FindBy(id="ctl00_MainContent_fmwOrder_txtName")
    public WebElement name;
@FindBy(id="ctl00_MainContent_fmwOrder_TextBox2")
public WebElement street;
@FindBy(id="ctl00_MainContent_fmwOrder_TextBox3")
    public WebElement city;
@FindBy(id="ctl00_MainContent_fmwOrder_TextBox4")
    public WebElement state;
@FindBy(id="ctl00_MainContent_fmwOrder_TextBox5")
    public WebElement zip;
@FindBy(xpath="//input[@value='Visa']")
    public WebElement visa;
@FindBy(id="ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement card;
@FindBy(id="ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement date;
@FindBy(xpath="//a[.='Process']")
    public WebElement submit;
@FindBy(xpath="//strong[contains(text(),' New order ')]")
    public WebElement message;
}
