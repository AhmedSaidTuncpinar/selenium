package practices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q02 {

    public static void main(String[] args) throws InterruptedException {


    //  ...Practice 2...
    // Set Driver Path
    // Create chrome driver object
    // Maximize the window
    // Open google home page https://www.google.com/
    // Wait for 3 seconds
    // Go to the "https://techproeducation.com/"
    // Get the title and URL of the page
    // Check if the title contains the word "Bootcamps" print console "Title contains Bootcamps" or "Title does not contain Bootcamps"
    // Check if the URL contains the word "Courses" print console "URL contains Courses" or "URL does not contain Courses"
    // Then go to "https://medunna.com/"
    // Get the title and check if it contains the word "MEDUNNA" and print "Title contains MEDUNNA" or "Title does not contain MEDUNNA"
    // Back to the previous webpage
    // Refresh the page
    // Navigate to forward
    // Wait for 3 seconds
    // Close the browser

        System.setProperty("webdriver.chromeDriver","src/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Thread.sleep(3000);
        driver.navigate().to("https://techproeducation.com/");
        String techTitle = driver.getTitle();
        String techUrl = driver.getCurrentUrl();
        if (techTitle.contains("Bootcamps")){
            System.out.println("Title containes Bootcamp");
        }else {
            System.out.println("Title does not contain Bootcamp");
        }
        if (techUrl.contains("Courses")){
            System.out.println("The Url containes Courses");
        }else {
            System.out.println("The url does not contain Courses");
        }
        driver.navigate().to("https://medunna.com/");
       String titleMedunna= driver.getTitle();
       if (titleMedunna.contains("MEDUNNA")){
           System.out.println("Title contains MEDUNNA");
       }else {
           System.out.println("Title does not contain MEDUNNA");
       }
       driver.navigate().back();
       driver.navigate().refresh();
       driver.navigate().forward();
       Thread.sleep(3000);
       driver.close();
}
}