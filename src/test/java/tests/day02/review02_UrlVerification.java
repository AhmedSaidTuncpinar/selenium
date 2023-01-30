package tests.day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class review02_UrlVerification {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","./src/resources/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://techproeducation.com/");

        //Verify if homepage url is “https://techproeducation.com/”

       String actualUrl = driver.getCurrentUrl();
       String expectedUrl = "https://techproeducation.com/";

       if (actualUrl.equals(expectedUrl)){
           System.out.println("PASS");
       }else {
           System.out.println("FAIL");
           System.out.println("Actual Url : " + actualUrl);
           System.out.println("But expected Url : " + expectedUrl);
       }
          driver.quit();

    }
}
