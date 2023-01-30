package tests.day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Review02_WebDriverManager {
    public static void main(String[] args) {


    WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.techproeducation.com");

      String actualTitle =  driver.getTitle();
      String expectedTitle = "Techpro Education | Online It Courses & Bootcamps";

      if (actualTitle.equals(expectedTitle)){
          System.out.println("PASS");
      }else {
          System.out.println("FAIL");
          System.out.println("Actual Title : " + actualTitle);
          System.out.println("But Expected Title :" + expectedTitle);
      }

driver.quit();
}
  }