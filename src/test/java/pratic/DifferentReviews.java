package pratic;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class DifferentReviews extends TestBase {


    @Test
    public  void reviewsTest(){
        driver.get("http://www.uitestpractice.com/");
        driver.findElement(By.linkText("Form")).click();
        driver.findElement(By.id("firstname")).sendKeys("Ahmed Said");
        driver.findElement(By.id("lastname")).sendKeys("Tuncpinar");
        driver.findElement(By.xpath("//input[@type='radio'][1]")).click();
        driver.findElement(By.xpath("//input[@value='dance']")).click();

        WebElement dropdown = driver.findElement(By.id("sel1"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Denmark");

        driver.findElement(By.id("datepicker")).sendKeys("02/04/1974");
        driver.findElement(By.id("phonenumber")).sendKeys("0766420918");
        driver.findElement(By.id("username")).sendKeys("astuncpinar");
        driver.findElement(By.id("email")).sendKeys("ahmtstncpnr@gmail.com");
        driver.findElement(By.id("comment")).sendKeys("I love my family");
        driver.findElement(By.id("pwd")).sendKeys("206920");
        driver.findElement(By.xpath("//button[@type='submit']")).click();


    }

    @Test
    public void calculateTest(){

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        driver.findElement(By.id("calculatetest")).click();
        driver.findElement(By.id("number1")).sendKeys("258");

        WebElement dropdown1= driver.findElement(By.id("function"));
        Select select = new Select(dropdown1);
        select.selectByVisibleText("times");

        driver.findElement(By.id("number2")).sendKeys("3");
        driver.findElement(By.id("calculate")).click();
        String result = driver.findElement(By.id("answer")).getText();
        Assert.assertEquals("774", result);

    }
    @Test
    public void alert(){
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        String text = driver.switchTo().alert().getText();
        Assert.assertEquals("I am a JS Alert",text);
        driver.switchTo().alert().accept();
        String result = driver.findElement(By.id("result")).getText();
        Assert.assertEquals("You successfully clicked an alert",result);

        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        String text1= driver.switchTo().alert().getText();
        Assert.assertEquals("I am a JS Confirm", text1);
        driver.switchTo().alert().accept();
        String result2 = driver.findElement(By.id("result")).getText();
        Assert.assertEquals("You clicked: Ok",result2);

        driver.findElement(By. xpath("//button[@onclick='jsPrompt()']")).click();
        String text2 = driver.switchTo().alert().getText();
        Assert.assertEquals("I am a JS prompt", text2);
        driver.switchTo().alert().sendKeys("Hello World");
        driver.switchTo().alert().accept();
        String result3= driver.findElement(By.id("result")).getText();
        Assert.assertTrue(result3.equals("You entered: Hello World"));
    }

}
