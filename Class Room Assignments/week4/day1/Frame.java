package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String verify = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		if(verify.equals("You pressed OK!")) {
			System.out.println("correct");
			
		}
		}
}
