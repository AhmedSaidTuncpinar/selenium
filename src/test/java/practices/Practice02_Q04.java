package practices;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Practice02_Q04 extends TestBase {
    /*
    Given
    Go to https://www.gmibank.com/
    When
    Hover over "Premium" Deposit Package
    And
    Click on "Book Now"
    Then
    Verify url contains "services"
            */
    @Test
    public void test(){
        driver.get("https://www.gmibank.com/");
       WebElement premiumDeposit= driver.findElement(By.xpath("//h4[@class='pricing-title'][2]"));
       Actions actions= new Actions(driver);
       actions.moveToElement(premiumDeposit).perform();

       driver.findElement(By.linkText("Book Now")).click();

       String url =driver.getCurrentUrl();
        Assert.assertTrue(url.contains("services"));

    }
}
