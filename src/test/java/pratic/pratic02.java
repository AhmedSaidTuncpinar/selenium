package pratic;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class pratic02 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://amazon.com");

       String actualTitle = driver.getTitle();
       String expectedTitle = "Amazon.com. Spend less. Smile more.";

        Assert.assertEquals(actualTitle,expectedTitle);

       String actualUrl= driver.getCurrentUrl();
       String expectedUrl = "https://amazon.com";

       Assert.assertEquals(actualUrl, expectedUrl);

      String actualSource = driver.getPageSource();
      String expectedSource = "Registry";

      Assert.assertTrue(actualSource.contains(expectedSource));


    }
}
