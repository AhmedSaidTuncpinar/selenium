package practices;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Practice04_Q02 extends TestBase {

      /*
  Given
      Go to https://testpages.herokuapp.com/styled/challenges/growing-clickable.html
  When
      Click on "click me" button
  Then
      Verify that "Event Triggered"
   */

    @Test
    public void test02(){
        driver.get("https://testpages.herokuapp.com/styled/challenges/growing-clickable.html");

        waitFor(5);
        driver.findElement(By.xpath("//button[@id='growbutton']")).click();
        waitFor(5);
      String eventTriggered = driver.findElement(By.id("growbuttonstatus")).getText();
      Assert.assertEquals("Event Triggered",eventTriggered);
    }

}
