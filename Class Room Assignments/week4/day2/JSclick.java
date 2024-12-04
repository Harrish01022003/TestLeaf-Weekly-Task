package week4.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;

public class JSclick {

    public static void main(String[] args) {
        
        // Set up ChromeDriver with options (disable notifications, etc.)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        
        // Open the target website
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Step 1: Locate the "Show Message" button
        WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Show Message')]"));

        // Step 2: Use JavascriptExecutor to click the button using JavaScript
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", button);  // Perform JavaScript click

        // Step 3: Verify the result (for demonstration)
        String message = driver.findElement(By.id("user-message")).getText();
        System.out.println("Message displayed: " + message);  // It should display: "Hello World!"

        // Close the browser
        driver.quit();
    }
}
