package week5.day1;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Leaftaps {
	

	@Test
	public void runLead() {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.id("username")).sendKeys("Democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("QEAGLE");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("TESTER");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("A");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("tester@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("3465785465");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("raj");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("32A Gandhipuram");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Coimbatore");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("641012");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("India");
		driver.findElement(By.className("smallSubmit")).click();
		
		String title2 = driver.getTitle();
		if(title2.contains("View Lead")) {
			System.out.println("Title is verified");
		}
		else {
			System.out.println("Title is not verified");
		}
		
		
	}

}