package pratic;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Practic04_Q03Review extends TestBase {
      /*
    Given
        Go to https://testpages.herokuapp.com/styled/events/javascript-events.html
    When
        Click all the buttons
    Then
        Assert all buttons clicked
     */
    @Test
    public void test(){
        driver.get("https://testpages.herokuapp.com/styled/events/javascript-events.html");

        driver.findElement(By.id("onblur")).click();
        waitFor(2);
        driver.findElement(By.id("onclick")).click();
        waitFor(2);
        driver.findElement(By.id("onclick")).click();

        Actions actions = new Actions(driver);
        WebElement contextMenu= driver.findElement(By.id("oncontextmenu"));
        actions.contextClick(contextMenu).perform();
        waitFor(2);

        WebElement doubleClick= driver.findElement(By.id("ondoubleclick"));
        actions.doubleClick(doubleClick).perform();
        waitFor(2);

        driver.findElement(By.id("onfocus")).click();
        waitFor(2);

        WebElement onKeyDown= driver.findElement(By.id("onkeydown"));
        actions.click(onKeyDown).sendKeys(Keys.ENTER).perform();
        waitFor(2);

        WebElement onKeyUp= driver.findElement(By.id("onkeyup"));
        actions.click(onKeyUp).sendKeys(Keys.ENTER).perform();
        waitFor(2);

        WebElement onKeyPress= driver.findElement(By.id("onkeypress"));
        actions.click(onKeyPress).sendKeys(Keys.ENTER).perform();
        waitFor(2);

        WebElement onMouseOver=driver.findElement(By.id("onmouseover"));
        actions.moveToElement(onMouseOver).perform();
        waitFor(2);

        WebElement onMouseLeave=driver.findElement(By.id("onmouseleave"));
        actions.moveToElement(onMouseLeave).perform();
        waitFor(2);

        WebElement onMouseDown=driver.findElement(By.id("onmousedown"));
        actions.click(onMouseDown).perform();
        waitFor(2);


       actions.click(onMouseDown).perform();
       waitFor(5);

       int allButtons=driver.findElements(By.xpath("//*[text()='Event Triggered']")).size();
        Assert.assertEquals(allButtons,11);


    }
}
