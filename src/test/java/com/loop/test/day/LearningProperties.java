package com.loop.test.day;

import org.testng.annotations.Test;

public class LearningProperties {

  @Test
  public void java_properties_reading_test(){
      //key          = value
      // os.name=      Mac Os X
      //user.name=      kananismayilzada
      System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
      System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));
  }






}
