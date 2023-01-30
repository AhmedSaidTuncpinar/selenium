package practices;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class Q04Review extends TestBase {

    // Navigate to  "https://testpages.herokuapp.com/styled/index.html"
    // Click on  Calculator under Micro Apps
    // Type any number in the first input
    // Type any number in the second input
    // Click on Calculate
    // Get the result
    // Verify the result
    // Print the result

    @Test
    public void calculatorTest(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        driver.findElement(By.id("calculatetest")).click();
        driver.findElement(By.id("number1")).sendKeys("10");
        WebElement dropdown= driver.findElement(By.id("function"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("minus");
        driver.findElement(By.id("number2")).sendKeys("9");
        driver.findElement(By.id("calculate")).click();
       String text =  driver.findElement(By.id("answer")).getText();
       Assert.assertEquals("1",text);


    }







}
