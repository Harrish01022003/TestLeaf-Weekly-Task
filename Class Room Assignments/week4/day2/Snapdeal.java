
package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import dev.failsafe.internal.util.Assert;

public class Snapdeal {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'Fashion')]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(ele).perform();
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
		String shoeCount = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println(shoeCount);
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Popularity')]")).click();
		driver.findElement(By.xpath("//li[@class='search-li']")).click();
        WebElement priceRangeFrom = driver.findElement(By.xpath("//input[@name='fromVal']"));
		priceRangeFrom.clear();
		priceRangeFrom.sendKeys("500");
		WebElement priceRangeTo = driver.findElement(By.xpath("//input[@name='toVal']"));
		priceRangeTo.clear();
		priceRangeTo.sendKeys("700");
		driver.findElement(By.xpath("//div[contains(text(),'GO')]")).click();
		WebElement cli = driver.findElement(By.xpath("//a[text()=' White & Blue']"));
		JavascriptExecutor js3 = driver;
		js3.executeScript("arguments[0].click();", cli);
		Thread.sleep(3000);
		String verifyFilter = driver.findElement(By.xpath("//div[@class='filters']")).getText();
		System.out.println(verifyFilter);
		if (verifyFilter.contains(" White & Blue") && verifyFilter.contains("Rs. 500 - Rs. 700")) {
			System.out.println("Filter applied successfully");
		} else {
			System.out.println("Filter not applied");
		}
		WebElement firstResult = driver.findElement(By.xpath("//p[@class='product-title']"));
		Actions builder2 = new Actions(driver);
		builder2.moveToElement(firstResult).perform();
		driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();
		String amount = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		System.out.println("Rs." + amount);
		String discountPercentage = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println(discountPercentage);
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/shoes.png");
		FileUtils.copyFile(src, dest);
		driver.findElement(By.xpath("//div[contains(@class,'close')]")).click();
		Set<String> windows = driver.getWindowHandles();
		List<String> ls = new ArrayList(windows);
		driver.switchTo().window(ls.get(0));
		driver.close();
        }
}
