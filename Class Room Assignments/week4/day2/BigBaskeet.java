
package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBaskeet {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//span[text()='Shop by'])[2]")).click();
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
		Actions builder=new Actions(driver);
		builder.moveToElement(ele).perform();
		Thread.sleep(3000);
		WebElement ele2 = driver.findElement(By.xpath("//a[text()='Rice & Rice Products']"));
		Actions builder2=new Actions(driver);
		builder2.moveToElement(ele2).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Boiled')]")).click();
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		driver.findElement(By.xpath("//div[contains(@class,'FilterSelection')]/input")).sendKeys("royal");
		WebElement element= driver.findElement(By.xpath("//input[@id='i-BBRoyal']"));
		JavascriptExecutor js = driver;
		js.executeScript("arguments[0].click();", element);
		WebElement element2= driver.findElement(By.xpath("//input[@id='i-PonniBoiledRice']"));
		JavascriptExecutor js2 = driver;
		js2.executeScript("arguments[0].click();", element2);
		WebElement element3= driver.findElement(By.xpath("//input[contains(@id,'5kg')]"));
		JavascriptExecutor js3 = driver;
		js3.executeScript("arguments[0].click();", element3);
		Thread.sleep(2000);
		String price = driver.findElement(By.xpath("//span[contains(@class,'Pricing')]")).getText();
		System.out.println(price);
		driver.findElement(By.xpath("//button[text()='Add']")).click();
		String successMsg = driver.findElement(By.xpath("//p[text()='An item has been added to your basket successfully']")).getText();
		System.out.println(successMsg);
		if(successMsg.contains("item has been added")) {
			System.out.println("Message verified");
		}else {
			System.out.println("Message not verified");
		}
		File src=driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snaps/grocery.png");
		FileUtils.copyFile(src, dest);
		
		Set<String> windows = driver.getWindowHandles();
		List<String> ls = new ArrayList(windows);
		driver.switchTo().window(ls.get(0));
		driver.close();
		
		

	}

}
