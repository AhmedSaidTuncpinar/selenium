package practices;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Practice03_Q01 extends TestBase {

     /*
    Given
        Go to https://demo.guru99.com/test/drag_drop.html
    When
        Drag orange elements on proper boxes below them

    Then
        Verify they are dropped.
  */

    @Test
    public void test01() {

        driver.get("https://demo.guru99.com/test/drag_drop.html");

       WebElement iFrame= driver.findElement(By.id("gdpr-consent-notice"));
       driver.switchTo().frame(iFrame);
       driver.findElement(By.xpath("(//*[@class='action-wrapper'])[3]")).click();
       driver.switchTo().defaultContent();
        waitFor(5);

        //1. 5000 -> 1. Amount
        WebElement source = driver.findElement(By.xpath("(//*[@data-id='2'])[1]"));
        WebElement target = driver.findElement(By.id("amt7"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(source,target).build().perform();


        //2. 5000 -> 2. Amount
      WebElement source2 = driver.findElement(By.xpath("(//*[@data-id='2'])[2]"));
      WebElement target2 = driver.findElement(By.id("amt8"));
      actions.dragAndDrop(source2,target2).build().perform();

        //3. Bank -> 1. Account
        WebElement source3 = driver.findElement(By.id("credit2"));
        WebElement target3 = driver.findElement(By.xpath("//*[@id='bank']"));
        actions.dragAndDrop(source3, target3).build().perform();

        //4.Sales-> 2. Account
        WebElement source4 = driver.findElement(By.id("credit1"));
        WebElement target4 = driver.findElement(By.id("loan"));
        actions.dragAndDrop(source4, target4).build().perform();

        WebElement text = (driver.findElement(By.xpath("//*[@class='table4_result']")));
        Assert.assertTrue(text.isDisplayed());


    }
}
