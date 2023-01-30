package pratic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class pratic01 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://amazon.com");
        driver.navigate().to("https://ebay.com");

        driver.navigate().back();
        Thread.sleep(8);
        driver.navigate().forward();
        driver.navigate().refresh();

        driver.quit();


    }
}
