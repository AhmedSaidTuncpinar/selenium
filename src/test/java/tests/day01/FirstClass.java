package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {

    public static void main(String[] args) {
        //1. Set up chrome driver
        System.setProperty("webdriver.chrome.driver","./src/resources/drivers/chromedriver");
        //2. CREATE CHROME DRIVER
        WebDriver driver= new ChromeDriver();
        //3. Now that we can do our automation
        driver.get("https://www.techproeducation.com");



    }
}
