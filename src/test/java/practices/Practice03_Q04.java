package practices;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.util.Collections;
import java.util.List;

public class Practice03_Q04 extends TestBase {
     /*
  Given
    Go to  https://www.saucedemo.com/
  When
    Enter the username  as "standard_user"
  And
    Enter the password as "secret_sauce"
  And
    Click on login button
  And
    Order products by "Price (low to high)"
  Then
    Assert that last product costs $49.99, first product costs $7.99
   */

    @Test
    public void test(){

        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        WebElement dropDown= driver.findElement(By.xpath("//select[@class='product_sort_container']"));
        Select select = new Select(dropDown);
        select.selectByIndex(2);

        List<WebElement> priceList = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
        Assert.assertEquals("$49.99",priceList.get(priceList.size()-1).getText());
        Assert.assertEquals("$7.99",priceList.get(0).getText());




    }
}
