package tests.day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Review02_TitleVerification {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","./src/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.techproeducation.com");
    }
}
