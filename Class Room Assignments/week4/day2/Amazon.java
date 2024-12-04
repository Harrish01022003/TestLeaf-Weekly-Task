
package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement ele = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		ele.sendKeys("oneplus 9 pro");
		ele.sendKeys(Keys.ENTER);
		String currencySymbol = driver.findElement(By.xpath("//span[@class='a-price-symbol']")).getText();
		String firstPrice = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		String total=currencySymbol+firstPrice;
		System.out.println(total);
		String customerRatings = driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text']")).getText();
		System.out.println(customerRatings);
		String text = driver.findElement(By.xpath("//h2[contains(@class,'clamp')]//span")).getText();
		System.out.println(text);
		File src=driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snaps/phone.png");
		FileUtils.copyFile(src, dest);
		driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
		String subTotal = driver.findElement(By.xpath("//h2[@class='a-size-mini a-color-price a-text-bold']")).getText();
		System.out.println(subTotal);
		if(total.equals(subTotal)){
			System.out.println("Amount matched perfectly");
		}
		else {
			System.out.println("Amount not matched");
		}
		
		driver.close();
		

	}

}
