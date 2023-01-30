package tests.day05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.TestBase;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class HomeworkGoogle extends TestBase {

    /*

            Create a new class : GoogleSearchTest
        Create main method and complete the following task.
        When user goes to https://www.google.com/
        Search for “porcelain teapot”
        And print how many related results displayed on Google
     */


    @Test

    public void testGoogle() {

        driver.get("https://www.google.com/");




    }


}