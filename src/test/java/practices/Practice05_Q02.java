package practices;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.io.IOException;

public class Practice05_Q02 extends TestBase {

     /*
    Given
        Go to "http://webdriveruniversity.com/Popup-Alerts/index.html"
    When
        Click on Ajax Loader
    And
        Click on "Click Me!" button
    Then
        Assert that button is clicked
    And
        Take screenshot after each step
     */

    @Test
    public void test02() throws IOException {
        driver.get("http://webdriveruniversity.com/Popup-Alerts/index.html");
        takeScreenshotOfPage();
        driver.findElement(By.xpath("//span[@id='button3']")).click();
        takeScreenshotOfPage();
        waitFor(5);
        driver.findElement(By.xpath("//span[@id='button1']")).click();
        takeScreenshotOfPage();

        Assert.assertTrue(driver.findElement(By.xpath("//h4[@class='modal-title']")).getText().contains("Well Done For Waiting....!!!"));


        // String text= driver.findElement(By.xpath("//h4[@class='modal-title']")).getText();
        // Assert.assertEquals(""Well Done For Waiting....!!!"",text);
       // takeScreenshotOfPage();
    }

}
