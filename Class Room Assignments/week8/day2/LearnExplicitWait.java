package week8.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnExplicitWait {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/waits.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		driver.findElement(By.xpath("//span[text()='Click First Button']")).click();
		WebElement secondButton = driver.findElement(By.xpath("//span[text()='Click Second']"));

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("j_idt87:growl_container")));
		secondButton.click();

		driver.findElement(By.id("j_idt87:j_idt98")).click();
		wait.until(ExpectedConditions.textToBe(By.id("j_idt87:j_idt99"), "Did you notice?"));

		driver.get("https://leafground.com/window.xhtml");
		driver.findElement(By.id("j_idt88:j_idt95")).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> window = new ArrayList<String>(windowHandles);
		driver.switchTo().window(window.get(1));
		System.out.println("Completed!!");

		driver.get("https://leafground.com/frame.xhtml");
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
		driver.findElement(By.id("Click")).click();

	}

}