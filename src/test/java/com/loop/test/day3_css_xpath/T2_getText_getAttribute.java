package com.loop.test.day3_css_xpath;

import com.loop.test.utilities.DemoQaConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.bouncycastle.asn1.x509.Holder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {

  /*
            * go to url: https://demoqa.com/automation-practice-form
            * verify header text expected
     * verify placeholder attribute value is expected
     */
  public static void main(String[] args) {


      WebDriver driver = WebDriverFactory.getDriver("chrome");
      driver.manage().window().maximize();
      driver.get("https:///demoqa.com/automation-practice-form");
      WebElement headerForForm = driver.findElement(By.tagName("h5"));
      String actualHeaderForForm = driver.findElement(By.tagName("h5")).getText();

      driver.quit();

      if (actualHeaderForForm.equals(DemoQaConstants.EXPECTED_HEADER_FOR_FORM)) {
          System.out.println("Expected header for form: \"" + DemoQaConstants.EXPECTED_HEADER_FOR_FORM + "\", matches actual header for from message: \"" + actualHeaderForForm + "\" = Test PASSED");
      } else {
          System.out.println("Expected header for from message: \"" + DemoQaConstants.EXPECTED_HEADER_FOR_FORM + "\", DOES NOT match actual header for from message: \"" + actualHeaderForForm);
          System.err.println("TEST FAILED");
      }
      WebElement firstNamePlaceHolder = driver.findElement(By.id("firstName"));
     String actualPlaceHolderFirstName = firstNamePlaceHolder .getAttribute("placeholder");
      System.out.println(firstNamePlaceHolder.getText() + "====> this from get text");
      if (actualPlaceHolderFirstName.equals(DemoQaConstants.EXPECTED_PLACEHOLDER_FIRST_NAME)) {
          System.out.println("Expected placeholder: \"" + DemoQaConstants.EXPECTED_PLACEHOLDER_FIRST_NAME + "\", matches actual message: \"" + actualHeaderForForm + "\" = Test PASSED");
      } else {
          System.out.println("Expected  placeholder\"" + DemoQaConstants.EXPECTED_PLACEHOLDER_FIRST_NAME + "\", DOES NOT match actual  message: \"" + actualHeaderForForm);
          System.err.println("TEST FAILED");
      }
  }
}
