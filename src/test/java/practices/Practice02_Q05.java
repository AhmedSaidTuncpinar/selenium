package practices;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Practice02_Q05 extends TestBase {
    // Go to URL : https://demo.automationtesting.in/Static.html
    // Drag and drop elements.

    @Test
    public void test(){
        driver.get("https://demo.automationtesting.in/Static.html");

        WebElement angular = driver.findElement(By.id("angular"));
        WebElement mongo = driver.findElement(By.id("mongo"));
        WebElement node = driver.findElement(By.id("node"));

        WebElement droparea = driver.findElement(By.id("droparea"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(angular,droparea).perform();

        actions.dragAndDrop(mongo,droparea).perform();

        actions.dragAndDrop(node,droparea).perform();

    }
}
