package tests.day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_URLVerification {

    public static void main(String[] args) {
        //1. Set up chrome driver
        System.setProperty("webdriver.chrome.driver","./src/resources/drivers/chromedriver");
        //2. CREATE CHROME DRIVER
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        //3. Now that we can do our automation
        driver.get("https://www.techproeducation.com");

        //Verify if homepage url is “https://techproeducation.com/”
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://techproeducation.com/";
        if (actualURL.equals(expectedURL)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUAL URL : "+actualURL);
            System.out.println("BUT EXPECTED URL : "+expectedURL);
        }
        driver.quit();

            /*
        WHAT IS YOUR APPROACH FOR AUTOMATION?
        -I read the acceptance criteria carefully.
        -I then create my test cases
        -Then I do my manual testing FIRST
         -If all good, then I start complete my automation script
         -If I find a bug/defect, then I talk to dev. Dev fixes the issue, then I retest.
         If all is good then complete my automation script
        -When teh automation is complete, I prepare the report for teh user story. In fact, My automation script
        generates html reports for us. I upload those reports to the JIRA.
        -For my manual test cases, I manually take screenshots and prepare reports and attach them to the JIRA.


        WHAT DO YOU DO WHEN YOUR TEST CASE PASS?

        WHAT DO YOU DO WHEN YOUR TEST CASE FAIL?

        WHAT DO YOU DO WHEN YOU FIND A BUG?



        * */

    }
}

