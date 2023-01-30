package pratic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class practice05 {

    /*
    1- Amazona gir
    2- Sign In’e tıkla
    3- Email gir ve continue butonuna bas
    4- Şifre gir ve Giriş yap
    5- Giriş yaptığını onayla
     Eğer hesabınız yoksa amazonda, giriş yapamazsınız
     Bu durumda hesabı olmayanlardan ricam giriş yapamamaları ve giriş yapamadıklarını onaylamaları
     */
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com/");
    }


    @Test
    public void amazonLogIn(){
   // driver.findElement(By.xpath("/html/body/div[1]/header/div/div[4]/div[1]/div/div/div[3]/span[1]/span/input")).click();
    driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
     driver.findElement(By.id("ap_email")).sendKeys("ahmtstncpnr@gmail.com");






    }


}
