package practices;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class Practice04_Q05 extends TestBase {

       /*
    Given
        Go to https://testpages.herokuapp.com/styled/basic-html-form-test.html
    When
        Fill the username, password and textArea comment:
    And
        Choose a file and upload it
    And
        Select all checkboxes, radio item 1 and dropdown 1
    And
        Click on submit
   Then
        Verify that uploaded file name is on the Form Details
     */
    @Test
    public void test05(){
        driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");

        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("asTuncpinar");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("206920");
        waitFor(2);

        driver.findElement(By.xpath("//textarea[@name='comments']")).sendKeys("I love Selenium");
        waitFor(3);


        String userHome= System.getProperty("user.home");
        driver.findElement(By.xpath("//input[@name='filename']")).sendKeys( userHome +"/Desktop/logo Small.jpeg");




        waitFor(3);

        driver.findElement(By.xpath("//input[@value='cb1']")).click();
        driver.findElement(By.xpath("//input[@value='cb2']")).click();
        waitFor(1);
        driver.findElement(By.xpath("//input[@value='cb3']")).click();
        waitFor(2);

        driver.findElement(By.xpath("//input[@value='rd1']")).click();

        waitFor(2);

        WebElement dropDown = driver.findElement(By.xpath("//select[@name='dropdown']"));
        Select select = new Select(dropDown);
        select.selectByIndex(0);
        waitFor(2);
        driver.findElement(By.xpath("//input[@value='submit']")).click();
        waitFor(2);
        driver.findElement(By.xpath("//*[text()='Male']")).click();






    }

}
