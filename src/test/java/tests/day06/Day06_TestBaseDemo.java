package tests.day06;

import org.junit.Test;
import utilities.TestBase;

public class Day06_TestBaseDemo extends TestBase {

    @Test
    public void test1(){

        driver.get("https://testcenter.tehcproeductaion.com/");
        System.out.println(driver.getTitle());
    }
    @Test
    public void test2(){
        driver.get("https://techproeducation.com/");
        System.out.println(driver.getTitle());
    }
}
