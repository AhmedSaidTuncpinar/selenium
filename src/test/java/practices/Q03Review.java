package practices;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.util.List;

public class Q03Review extends TestBase {

    @Test
    public void reviewQ03(){
        // Go to url : http://www.uitestpractice.com/
        driver.get("http://www.uitestpractice.com/");
        // Click on 'Form'
        driver.findElement(By.xpath("//a[@href='/Students/Form']")).click();
        // Fill the First Name: John
        driver.findElement(By.id("firstname")).sendKeys("John");
        // Fill the Last Name: Doe
        driver.findElement(By.id("lastname")).sendKeys("Doe");
        // Check the Marital Status: Married
        driver.findElement(By.xpath("//input[@type='radio'][1]")).click();
        // Check the Hobby: Reading
        driver.findElement(By.xpath("//input[@value='read']")).click();
        // Select the Country : Canada
        WebElement dropdown=driver.findElement(By.id("sel1"));
        Select select =new Select(dropdown);
        select.selectByVisibleText("Canada");
        //Print all country list on the console
        //List<WebElement> alloptions = select.getOptions();
        //for (WebElement w: alloptions){
         //   System.out.println(w.getText());
            // Fill the Date Of Birth with: 1st February 2000
            driver.findElement(By.id("datepicker")).sendKeys("02/01/200");
            // Fill the Phone Number: 12345
            driver.findElement(By.id("phonenumber")).sendKeys("12345");
            // Fill the Username with : john_doe
        driver.findElement(By.id("username")).sendKeys("john_doe");
            // Fill the Email: john@doe.com
            driver.findElement(By.id("email")).sendKeys("john@doe.com");
            // Fill the About Yourself: My name is John Doe. I am a famous man. Because my name is used as a mock data everywhere.
            driver.findElement(By.id("comment")).sendKeys("My name is John Doe. I am a famous man. Because my name is used as a mock data everywhere.");
            // Fill the Password: John.123
            driver.findElement(By.id("pwd")).sendKeys("John.123");
            // Click on Submit Button
           WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
           submit.sendKeys(Keys.ENTER);




        }

    }


