package com.loop.test.day9_driver_faker_action;

import org.testng.annotations.Test;

public class T00_singleton_practice {

    @Test
    public void practice(){
        String str1= T0_singleton_pattern_example.getWord() ;
        System.out.println("str1 = " + str1);
        String str= T0_singleton_pattern_example.getWord() ;
        System.out.println("str = " + str);
    }




}
