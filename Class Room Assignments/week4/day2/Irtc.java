package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Irtc {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.irctc.co.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.linkText("FLIGHTS")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> windowsList = new ArrayList<>(windowHandles); 
        driver.switchTo().window(windowsList.get(1));  
        String newWindowTitle = driver.getTitle();
        System.out.println("Title of the new window (AirTicket): " + newWindowTitle);
        driver.switchTo().window(windowsList.get(0));  
        driver.close();  
    }
}
