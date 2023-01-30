package practices;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class Practice05_Q03 extends TestBase {
    /*
    Given
        Go to https://www.facebook.com/
    When
        Click on "Create New Account"
    And
        Fill all the boxes by using keyboard actions class
     */

    @Test
    public void test03(){
     //  driver.get("https://www.facebook.com/");
     //  waitFor(3);
     //  driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _9xo6 _4jy3 _4jy1 selected _51sy'][1]")).click();
     //  waitFor(2);
     //  driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy'][1]")).sendKeys(Keys.ENTER);
     //  driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ahmet");
     //  driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Çıldırlı");
     //  driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("ahmetcildirli@gmail.com");
     //  driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("ahmetcildirli1984");
     //  waitFor(2);

     //  WebElement month= driver.findElement(By.xpath("//select[@name='birthday_month']"));
     //  Select select =new Select(month);
     //  select.selectByVisibleText("Apr");

     //  WebElement birthDay=driver.findElement(By.xpath("//select[@name='birthday_day']"));
     //  Select select1=new Select(birthDay);
     //  select.selectByIndex(8);

     //  waitFor(3);

     //  WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
     //  Select select2=new Select(year);
     //  select.selectByIndex(30);
     //  waitFor(3);

     //  driver.findElement(By.xpath("//*[text()='Male']")).click();

     //  waitFor(2);
     //  driver.findElement(By.xpath("//button[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']")).click();x

        //Hocanın Çözümü


        driver.get("https://www.facebook.com/");
          waitFor(3);
          driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _9xo6 _4jy3 _4jy1 selected _51sy'][1]")).click();
          waitFor(2);
          driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy'][1]")).sendKeys(Keys.ENTER);

          WebElement faceBook= driver.findElement(By.xpath("//input[@name='firstname']"));
          Actions actions=new Actions(driver);
        actions.click(faceBook).
                sendKeys("John").
                sendKeys(Keys.TAB).
                sendKeys("Doe").
                sendKeys(Keys.TAB).
                sendKeys("1234").
                sendKeys(Keys.TAB).
                sendKeys("John.123").
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys("11").
                sendKeys(Keys.TAB).
                sendKeys("Feb").
                sendKeys(Keys.TAB).
                sendKeys("2000").
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).
                perform();


    }
}
