package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateLeadRetry {

    @Test(retryAnalyzer =CheckAgain.class)  // Add the retry analyzer here
    public void createRun() {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://leaftaps.com/opentaps/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Login and Navigate to Create Lead page
        driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.id("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();

        // Fill in the Create Lead form
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");

        // Submit the form
        driver.findElement(By.name("submitButton")).click();
        
        // Close the browser
        driver.close();
    }
}
