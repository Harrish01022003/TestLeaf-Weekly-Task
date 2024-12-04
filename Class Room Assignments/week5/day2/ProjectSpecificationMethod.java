package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificationMethod {
	
	public  ChromeDriver driver;   // declaring it globally to acces in different metnod
	@Parameters({"url","password","username",})
	@BeforeMethod
	public void preCondition(String url, String password, String username) {
		System.out.println("Superclass:");
		System.out.println("url: "+url);
		System.out.println("username: "+password);
		System.out.println("username"+username);

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@AfterMethod
	public void postCondition() {
		driver.quit();
	}

}
