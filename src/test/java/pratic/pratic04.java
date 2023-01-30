package pratic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class pratic04 {

    WebDriver driver;
    @Before
    public void setUp(){
//        user goes to http://a.testaddressbook.com/sign_in
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
//        IMPLICIT WAIT
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//15 seconds wait in case needed
        driver.manage().window().maximize();
        driver.get("https://amazon.com");



    }
    @Test
    public void signIn(){
        driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
        driver.findElement(By.id("ap_email")).sendKeys("ahmtstncpnr@gmail.com");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Admin123");
        driver.findElement(By.cssSelector("input[id='signInSubmit']")).click();

        WebElement a = driver.findElement(By.className("a-alert-heading"));
        Assert.assertTrue(a.isDisplayed());

    }
}
