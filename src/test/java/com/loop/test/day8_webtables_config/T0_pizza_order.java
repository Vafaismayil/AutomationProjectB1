package com.loop.test.day8_webtables_config;

import com.loop.test.base.TestBase;
import com.loop.test.utilities.PizzaOrderWebTableUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class T0_pizza_order extends TestBase {
    @BeforeMethod
    public void test(){
     driver.get("https://loopcamp.vercel.app/web-tables.html");
    }
    @Test
    public void test_pizza_type(){
        //driver.get("https://loopcamp.vercel.app/web-tables.html");
        String name = "Alexandra Gray";
        String expectedPizzaType = "Thin Crust";
        assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, "Pizza type"), expectedPizzaType);}

    @Test
    public void test_amount(){

        String name = "John Doe";
        String expectedAccount = "3";
        assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, "Amount"), expectedAccount);}
    @Test
    public void test_date(){
        String name = "Stewart Dawidson";
        String expectedAccount="03/29/2021";
        assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver,name,"Date"),expectedAccount) ;}

    @Test
    public void test_street(){
        String name = "Bart Fisher";
        String expectedAccount="35, Rock st.";
        assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver,name,"Street"),expectedAccount) ;}

    @Test
    public void test_city(){
        String name = "Samuel Jackson";
        String expectedAccount="13, Owl st.";
        assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver,name,"Street"),expectedAccount) ;}

    @Test
    public void test_state(){
        String name = "Bob Martin";
        String expectedAccount="US";
        assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver,name,"State"),expectedAccount) ;}

    @Test
    public void test_zip(){
        String name = "Ned Stark";
        String expectedAccount="21444";
        assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver,name,"Zip"),expectedAccount) ;}

    @Test
    public void test_card(){
        String name = "Samuel Jackson";
        String expectedAccount="MasterCard";
        assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver,name,"Card"),expectedAccount) ;}

    @Test
    public void test_card_number(){
        String name = "Alexandra Gray";
        String expectedAccount="VISA";
        assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver,name,"Card"),expectedAccount) ;}

    @Test
    public void test_exp(){
        String name = "Robert Baratheon";
        String expectedAccount="03/26";
        assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver,name,"Exp"),expectedAccount) ;}
}




