package tests.day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Review02_GetPageSource {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");

       String actualPageSource = driver.getPageSource();
       String expectedPageSource = "Registry";

       if (actualPageSource.contains(expectedPageSource)){
           System.out.println("PASS");
       }else {
           System.out.println("FAIL");
       }
       driver.quit();
    }
}
