package tests.Day13;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;
public class NoSuchElementException extends TestBase{


        @Test
        public void noSuchElementTest(){
            driver.get("https://techproeducation.com/");
//        Wrong locator
            driver.findElement(By.id("wrong-id"));// org.openqa.selenium.NoSuchElementException:
        }
    }

