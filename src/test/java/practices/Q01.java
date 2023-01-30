package practices;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q01 {
// ...Practice 1...
    // Set Driver Path
    // Create chrome driver object
    // Maximize the window
    // Open google home page https://www.google.com/
    // Navigate to techproeducation home page https://techproeducation.com/
    // Navigate back to google
    // Navigate forward to techproeducation
    // Refresh the page
    // Close/Quit the browser
    // And last step : print "ALL OK" on console
public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver" );
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    driver.get("https://www.google.com/");
    driver.navigate().to("https://techproeducation.com/");
    Thread.sleep(1000);
    driver.navigate().back();

    Thread.sleep(1000);

    driver.navigate().forward();

    Thread.sleep(1000);

    driver.navigate().refresh();
    driver.quit();
    System.out.println("All Ok");

}
}
