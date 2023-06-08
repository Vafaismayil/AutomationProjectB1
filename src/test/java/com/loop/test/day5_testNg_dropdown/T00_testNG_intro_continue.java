package com.loop.test.day5_testNg_dropdown;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T00_testNG_intro_continue {

    @BeforeClass
            public void setUp(){
        System.out.println("Before class is running");
    }
    @AfterMethod
    public void afterClass(){
        System.out.println("After class is running");
    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("Before method is running");
    }
@AfterMethod
public void tearDownMethod(){
    System.out.println("After method is running");

}
    @Test(priority = 2)
    public void test1(){
        System.out.println("TestNG test 1 is running");
   String actual = "Loop";
   String expected ="Loop";
        Assert.assertEquals(actual,expected, actual + ": is not passing with " + expected) ;}

@Test(priority =1)
public void test2(){
    System.out.println("TestNG test 2 is running");
    }

}
