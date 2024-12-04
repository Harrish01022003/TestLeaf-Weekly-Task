package week4.day1;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		// Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		// Load the URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		// Maximize the browser window
		driver.manage().window().maximize();
		// Add an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Enter the username and password
		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("(//input[contains(@class,'input')])[2]")).sendKeys("crmsfa");
		// Click on the Login button
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		// Click on the CRM/SFA link.
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		// Click on the Contacts button.
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		// Click on Merge Contacts.
		driver.findElement(By.xpath("//a[contains(text(),'Merge')]")).click();
		// Click on the widget of the "From Contact".
		driver.findElement(By.xpath("//input[@id='partyIdFrom']/following::a")).click();
		Set<String> contactID = driver.getWindowHandles();
		List<String> ls = new ArrayList(contactID);
		driver.switchTo().window(ls.get(1));
		// Click on the first resulting contact.
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//div")).click();
		driver.switchTo().window(ls.get(0));
		// Click on the widget of the "To Contact".
		driver.findElement(By.xpath("(//input[@id='partyIdFrom']/following::a)[2]")).click();
		Set<String> contactID2 = driver.getWindowHandles();
		List<String> ls2 = new ArrayList(contactID2);
		driver.switchTo().window(ls2.get(1));
		// Click on the second resulting contact
		driver.findElement(By.xpath("(//div[contains(@class,'partyId')])[3]/a")).click();
		Set<String> contactID3 = driver.getWindowHandles();
		List<String> ls3 = new ArrayList(contactID3);
		driver.switchTo().window(ls3.get(0));
		// Click on the Merge button.
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		// Accept the alert.
		driver.switchTo().alert().accept();
		String contactName = driver.findElement(By.xpath("//span[@id='viewContact_fullName_sp']")).getText();
		System.out.println(contactName);
		String title = driver.getTitle();
		String expTitle = "View Contact | opentaps CRM";
		// Verify the title of the page.
		if (title.equals(expTitle)) {
			System.out.println("Title matched");
		} else {
			System.out.println("Title not matched");
		}
	}
}
