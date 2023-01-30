package practices;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Practice03_Q02 extends TestBase {
     /*
    Given
        Go to "https://cgi-lib.berkeley.edu/ex/fup.html"
    When
       Type "My File" into "Notes about the file" input
    And
        Select the file to upload
    And
        Click "Choose File" button
    And
        Click on "Press" button
    Then
        Assert that "Your notes on the file were" equals "My File"
    And
        Assert that file Content contains "Hello, I am uploaded file"
     */

    @Test
    public void test01() throws InterruptedException {
        driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");

      driver.findElement(By.xpath("//input[@type='text']")).sendKeys("My File");

        WebElement chooseFileButton= driver.findElement(By.xpath("//input[@type='file']"));
        Thread.sleep(2000);
        String userHOME=System.getProperty("user.home");
        String pathOfFile = userHOME + "/Desktop/logo Small.jpeg";
        chooseFileButton.sendKeys(pathOfFile);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        String note = driver.findElement(By.xpath("//blockquote")).getText();
        Assert.assertEquals("My File", note);

        //Assert that file Content contains "Hello, I am uploaded file"
        String fileContent = driver.findElement(By.xpath("//pre")).getText();
        Assert.assertTrue(fileContent.contains("Hello, I am uploaded file"));
    }
}