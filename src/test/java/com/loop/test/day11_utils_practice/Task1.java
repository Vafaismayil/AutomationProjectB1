package com.loop.test.day11_utils_practice;

import com.github.javafaker.Faker;
import com.loop.pages.WebOrderPage;
import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task1 {
    WebOrderPage webOrderPage;
    @BeforeMethod
    public void setUp() {
        webOrderPage = new WebOrderPage();
    }
    @Test
    public void webOrder() {
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        webOrderPage.username.sendKeys("Tester");
        webOrderPage.password.sendKeys("test");
        webOrderPage.login.click();
        webOrderPage.order.click();
        webOrderPage.quantity.sendKeys("2");
        webOrderPage.calculateButton.click();
        Faker faker = new Faker();
        webOrderPage.name.sendKeys(faker.name().firstName());
        webOrderPage.street.sendKeys(faker.address().streetAddress());
        webOrderPage.city.sendKeys(faker.address().city());
        webOrderPage.state.sendKeys(faker.address().state());
        webOrderPage.zip.sendKeys(faker.numerify("######") );
        webOrderPage.visa.click();
        webOrderPage.card.sendKeys(faker.numerify("###################"));
        webOrderPage.date.sendKeys(faker.expression("04/23") );
        webOrderPage.submit.click();
        Assert.assertEquals(webOrderPage.message.getText(),"New order has been successfully added.") ;
    }
}
