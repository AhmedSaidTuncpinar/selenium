package tests.Day13;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;
public class TimeOutException extends TestBase{

        @Test
        public void timeOutTest(){
            driver.get("https://techproeducation.com/");
            waitForVisibility(By.id("wrong-id"),15);

        }

    }

