package tests.Day13;


import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import utilities.TestBase;




public class NullPointerException extends TestBase {
    //    DECLARED BUT NEVER INSTANTIALTED
    WebDriver driver;
    Faker faker;
    @Test
    public void nullPointerTest(){

        driver.get("https://techproeducation.com/");//NullPointerException
    }
    @Test
    public void nullPointerTest1(){
        System.out.println(faker.name().fullName());//NullPointerException
    }
}

