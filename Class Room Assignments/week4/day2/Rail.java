package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Rail {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://erail.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        WebElement from = driver.findElement(By.id("txtStationFrom"));
        from.clear();
        from.sendKeys("MAS",Keys.ENTER);
        WebElement to = driver.findElement(By.id("txtStationTo"));
        to.clear();
        to.sendKeys("MDU",Keys.ENTER);
        WebElement cBox = driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']"));
        cBox.click();
//        WebElement sortCheckbox = driver.findElement(By.id("chkSelectDateOnly"));
//        if (sortCheckbox.isSelected()) {
//            sortCheckbox.click();  // Uncheck the box if it is checked
//        }
        
    }
}
