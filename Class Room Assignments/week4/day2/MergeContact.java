package week4.day2;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("(//input[contains(@class,'input')])[2]")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Merge')]")).click();
		driver.findElement(By.xpath("//input[@id='partyIdFrom']/following::a")).click();
		Set<String> contactID = driver.getWindowHandles();
		List<String> ls = new ArrayList(contactID);
		driver.switchTo().window(ls.get(1));
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//div")).click();
		driver.switchTo().window(ls.get(0));
		driver.findElement(By.xpath("(//input[@id='partyIdFrom']/following::a)[2]")).click();
		Set<String> contactID2 = driver.getWindowHandles();
		List<String> ls2 = new ArrayList(contactID2);
		driver.switchTo().window(ls2.get(1));
		driver.findElement(By.xpath("(//div[contains(@class,'partyId')])[3]/a")).click();
		Set<String> contactID3 = driver.getWindowHandles();
		List<String> ls3 = new ArrayList(contactID3);
		driver.switchTo().window(ls3.get(0));
		driver.findElement(By.xpath("//a[text()='Merge']")).click();

		
		driver.switchTo().alert().accept();
		String contactName = driver.findElement(By.xpath("//span[@id='viewContact_fullName_sp']")).getText();
		System.out.println(contactName);
		String title = driver.getTitle();
		String expTitle = "View Contact | opentaps CRM";

		if (title.equals(expTitle)) {
			System.out.println("Title matched");
		} 
		else {
			System.out.println("Title not matched");
		}
	}
}
