package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Harrish");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("A");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		WebElement element = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select obj1 = new Select(element);
		obj1.selectByIndex(4);
		WebElement element2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select obj2 = new Select(element2);
		obj2.selectByVisibleText("Automobile");
		WebElement element3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select obj3 = new Select(element3);
		obj3.selectByValue("OWN_CCORP");
		driver.findElement(By.className("smallSubmit")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("View Lead | opentaps CRM")) {
			System.out.println("Verified");
		}
		else {
			System.out.println("Not Verified");
		}
			

	}

}
