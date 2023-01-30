package practices;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.util.List;

public class Practice04_Q03 extends TestBase {
        /*
    Given
        Go to https://testpages.herokuapp.com/styled/events/javascript-events.html
    When
        Click all the buttons
    Then
        Assert all buttons clicked
     */

    @Test
    public void test03(){
        driver.get("https://testpages.herokuapp.com/styled/events/javascript-events.html");


        //        Click all the buttons
        driver.findElement(By.id("onblur")).click();
        waitFor(1);
        driver.findElement(By.id("onclick")).click();//This is for clicking on "on Blur" button
        waitFor(1);
        driver.findElement(By.id("onclick")).click();//This is for clicking on "on Click" button

        waitFor(2);

        Actions actions = new Actions(driver);

        WebElement contextMenu = driver.findElement(By.id("oncontextmenu"));
        actions.contextClick(contextMenu).perform();
        waitFor(3);

        WebElement doubleClick= driver.findElement(By.id("ondoubleclick"));
        actions.doubleClick(doubleClick).perform();
        waitFor(3);

        driver.findElement(By.id("onfocus")).click();

        //WebElement onFocus =driver.findElement(By.id("onfocus"));
        //actions.click(onFocus).perform();
        //waitFor(3);

        WebElement onKeyDown =driver.findElement(By.id("onkeydown"));
        actions.click(onKeyDown).sendKeys(Keys.ENTER).perform();
        waitFor(3);

       WebElement onKeyUp= driver.findElement(By.id("onkeyup"));
       actions.click(onKeyUp).sendKeys(Keys.ENTER).perform();
        waitFor(3);

        WebElement keyPress= driver.findElement(By.id("onkeypress"));
        actions.click(keyPress).sendKeys(Keys.ENTER).perform();

      WebElement onMouseOver= driver.findElement(By.id("onmouseover"));
      actions.moveToElement(onMouseOver).perform();
        waitFor(3);

      WebElement onMouseLeave= driver.findElement(By.id("onmouseleave"));
      actions.moveToElement(onMouseLeave).perform();
        waitFor(3);

      WebElement onMouseDown =driver.findElement(By.id("onmousedown"));
      actions.click(onMouseDown).perform();
      waitFor(1);
      actions.click(onMouseDown).perform();

        int numberOfClickedButtons = driver.findElements(By.xpath("//p[.='Event Triggered']")).size();
        Assert.assertEquals(11, numberOfClickedButtons);







}
    }
