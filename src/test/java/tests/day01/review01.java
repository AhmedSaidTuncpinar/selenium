package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class review01 {
    public static void main(String[] args) {

        //Set up
        System.setProperty("webdriver.chrome.driver","./src/resources/drivers/chromedriver");
        //Create driver
        WebDriver driver = new ChromeDriver();
        //Maximize the web app
        driver.manage().window().maximize();
        // Reach the website with driver.get or driver.navigate
        driver.get("https://www.walmart.com/");//Same
        driver.navigate().to("https://www.walmart.com/");//same
        //get back to the webpage
        driver.navigate().back();
        //forward to
    }
}
