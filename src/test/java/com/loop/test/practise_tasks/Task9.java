package com.loop.test.practise_tasks;

import com.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class Task9 extends TestBase {

    @Test
    public void test(){
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        List<WebElement> elements=driver.findElements(By.xpath("//table[@rules='all']//tr") );
        System.out.println("elements .size() = " + elements.size());
        List<WebElement> elements1=driver.findElements(By.xpath("//table[@rules='all']//tr//td") );
        System.out.println("elements .size() = " + elements1.size());
       String index="";

        for (int i = 0; i < elements.size(); i++) {

            for (int j = 0; j < elements1.size(); j++) {
                if(elements.get(i).getText().equals("Pizza Type") ){
                    index="[1]";
                } else if (elements.get(1).getText().equals("Amount") ) {
                    index = "[2]";
                } else if (elements.get(i).getText().equals("Date")) {
                    index = "[3]";
                }
            }
        } //WebElement element = driver.findElement(By.xpath("//td[.='" + elements + "']//following-sibling::td" + index));

    }


}
