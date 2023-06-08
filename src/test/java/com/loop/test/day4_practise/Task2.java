package com.loop.test.day4_practise;

import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.util.List;

public class Task2 {
   @Test
    public void docuportTest() throws InterruptedException {
//
//       WebDriver driver = WebDriverFactory.getDriver("chrome");
//       driver.manage().window().maximize();
//       driver.get(DocuportCostants.DOCUPORT_URL);
//       //2. sign as adviser
//       WebElement userName = driver.findElement(By.cssSelector("input#input-14"));
//       userName.sendKeys("b1g1_advisor@gmail.com");
//       WebElement password = driver.findElement(By.cssSelector("input#input-15"));
//       password.sendKeys("Group1");
//       WebElement login = driver.findElement(By.cssSelector("span[class='v-btn__content']"));
//       login.click();
//
//       Thread.sleep(3000);
//       //3.store left navigate items to (Home, Received docs, My uploads, Invitations etc) to the List
//       List<WebElement> leftItems = driver.findElements(By.xpath("//a[contains(@class,'v-list-item')]"));
//       System.out.println("leftItems= " + leftItems.size());
//       Thread.sleep(3000);
//       for (WebElement each : leftItems) {
//           if (!each.getText().equals("")) {
//               System.out.println("leftItems= " + each.getText());
//               System.out.println("leftItems= " + each.getAttribute("href"));
//           }
//       }
//
//
//       String[] expected = {"Home", "Received docs", "My uploads", "Clients", "Invitations", "Users", "Leads", "Bookkeping", "1099 Form", "Reconciliations"};
//       String[] actual = new String[leftItems.size()];
//       for (int i = 0; i < leftItems.size(); i++) {
//           actual[i] = leftItems.get(i).getText();
//       }
//

       WebDriver driver = WebDriverFactory.getDriver("chrome");
       driver.manage().window().maximize();
       driver.get(DocuportConstants.DOCUPORT_URL);

       WebElement userName = driver.findElement(By.id("input-14"));
       userName.sendKeys(DocuportConstants.USERNAME_ADVISOR);
       WebElement password = driver.findElement(By.id("input-15"));

       password.sendKeys(DocuportConstants.PASSWORD_ADVISOR);
       WebElement login = driver.findElement(By.className("v-btn__content"));
       login.click();

       Thread.sleep(3000);

       //3.store left navigate items to (Home, Received docs, My uploads, Invitations etc) to the List
       List<WebElement> leftItems = driver.findElements(By.xpath("//a[contains(@class,'v-list-item')]"));
       System.out.println("leftItems= " + leftItems.size());
       Thread.sleep(3000);

       //  4. iterate and print out href values
       for (WebElement each : leftItems) {
           if(!each.getText().equals("")) {
               System.out.println("leftItems= " + each.getText());
               System.out.println("leftItems= " + each.getAttribute("href"));   //href is always link
           }
       }

       // 5. Validate that expected matching to actual
       Thread.sleep(3000);

       System.out.println("TestNG is running");
       String [] expected = {"Home", "Received docs", "My uploads", "Clients", "Invitations", "Users", "Leads", "Bookkeeping", "1099 Form", "Reconciliations"};
       String [] actual = new String[leftItems.size()];

       for (int i = 0; i < leftItems.size(); i++) {
           actual[i] = leftItems.get(i).getText();
       }
       Assert.assertEquals(actual, expected);

   }

}
