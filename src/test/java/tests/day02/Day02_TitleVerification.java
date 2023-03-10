package tests.day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_TitleVerification {
    public static void main(String[] args) {

        //1. Set up chrome driver
        System.setProperty("webdriver.chrome.driver","./src/resources/drivers/chromedriver");
        //2. CREATE CHROME DRIVER
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        //3. Now that we can do our automation
        driver.get("https://www.techproeducation.com");

        //get the title
        String actualTitle= driver.getTitle();
        String expectedTitle= "Techpro Education | Online It Courses & Bootcamps";

        //Verify if page title is “Techpro Education | Online It Courses & Bootcamps”

        if (actualTitle.equals(expectedTitle)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("ACTUAL TITLE : "+actualTitle);
            System.out.println("BUT EXPECTED TITLE : "+expectedTitle);
        }
        driver.quit();
    }
}