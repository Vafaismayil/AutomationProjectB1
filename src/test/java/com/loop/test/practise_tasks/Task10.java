package com.loop.test.practise_tasks;

import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.testng.annotations.Test;

public class Task10 {
//    AC1: Given user is in the loopcamp page.
//    When they visit  Practice - Loopcamp
//    Then they should be able see Registration Form
//
//    When the user fill up the form till the end (by using faker)
//    Then they need to click "Sign up" button.
//            Then "registration was successful" message should be appeared.

    @Test
    public void docuport(){
        Driver.getDriver().get(ConfigurationReader.getProperty(""));
    }


}
