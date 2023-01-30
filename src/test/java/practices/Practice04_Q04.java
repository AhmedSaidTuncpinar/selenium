package practices;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Practice04_Q04 extends TestBase {
      /*
  Given
      Go to https://testpages.herokuapp.com/
  When
      Click on File Downloads
  And
      Click on Server Download
  Then
      Verify that file is downloaded
   */

    @Test
    public void test04(){
        driver.get(" https://testpages.herokuapp.com/");
        driver.findElement(By.id("download")).click();
        driver.findElement(By.id("server-download")).click();

    }
}
