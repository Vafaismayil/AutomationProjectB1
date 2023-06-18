package com.loop.test.day8_webtables_config;

import com.loop.pages.LoopPracticeDragDropPage;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T3_drag_drop_pom {
    /*
    Loop Practice Drag and Drop Test
    1. Open a chrome browser
    2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
    3. Verify expected default text appears on big circle
    Expected = "Drag the small circle here."

    Loop Practice Drag and Drop Test
    1. Open a chrome browser
    2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
    3. Click and hold small circle
    4. Verify "Drop here." text appears on big circle

    1. Open a chrome browser
    2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
    3. Click and hold small circle
    4. Move it on top of the big circle
    5. Verify “Now drop…” text appears on big circ

    1. Open a chrome browser
    2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
    3. Click and hold small circle
    4. Dropped anywhere outside of big circle
    5. Verify “Try again!” text appears on big circle
     */
    String expected;
    LoopPracticeDragDropPage loopPracticeDragDropPage;
    String actual;
    Actions actions;

    @Test
    public void drag_small_here_test() {
        Driver.getDriver().get("https://loopcamp.vercel.app/drag-and-drop-circles.html");
        expected = "Drag the small circle here.";
        loopPracticeDragDropPage = new LoopPracticeDragDropPage();
        actual = loopPracticeDragDropPage.bigCircle.getText();
        Assert.assertEquals(actual, expected, "Actual does not match the expected");
    }

    @Test
    public void practice_drag_drop_test() {
        Driver.getDriver().get("https://loopcamp.vercel.app/drag-and-drop-circles.html");
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));
        actions = new Actions(Driver.getDriver());
        actions.moveToElement(smallCircle)
                .clickAndHold()
                .moveToElement(bigCircle)
                .release()
                .perform();

        WebElement successMsg = Driver.getDriver().findElement(By.xpath("//div[contains(text(),'great')]"));
        actual = successMsg.getText();
        expected = "You did great!";
        Assert.assertEquals(actual, expected, "Actual does not match expected");
    }

//    @Test
//    public void test() {
//        Driver.getDriver().get("https://loopcamp.vercel.app/drag-and-drop-circles.html");
//        LoopPracticeDragDropPage loopPracticeDragDropPage = new LoopPracticeDragDropPage();
//        actions.moveToElement(loopPracticeDragDropPage.smallCircle)
//                .clickAndHold()
//                .moveByOffset(100, 100)
//                .pause(2000)
//                .perform();
//        Assert.assertEquals(loopPracticeDragDropPage.bigCircle.getText(), "Drop here.");
//    }

    @Test
    public void now_drop() {

        Driver.getDriver().get("https://loopcamp.vercel.app/drag-and-drop-circles.html");
        LoopPracticeDragDropPage loopPracticeDragDropPage1 = new LoopPracticeDragDropPage();
        actions.moveToElement(loopPracticeDragDropPage1.smallCircle)
                .clickAndHold()
                .moveByOffset(30, -150)
                .pause(100)
                .perform();
        Assert.assertEquals(loopPracticeDragDropPage1.bigCircle.getText(), "Now drop...");

//
//        @Test
//        public void try_again () {
//            LoopPracticeDragDropPage loopPracticeDragDropPage2 = new LoopPracticeDragDropPage();
//            actions.moveToElement(loopPracticeDragDropPage2.smallCircle)
//                    .clickAndHold()
//                    .moveToElement(loopPracticeDragDropPage2.smallCircle)
//                    .moveByOffset(200, -300)
//                    .release()
//                    .pause(100)
//                    .perform();
//            Assert.assertEquals(loopPracticeDragDropPage2.bigCircle.getText(), "Try again!");
//        }

//    @AfterClass
//    public void tearDown(){
//        Driver.closeDriver();
    }
}


