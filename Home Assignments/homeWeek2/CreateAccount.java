package homeWeek2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
		
		//Preconditions
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		
		driver.manage().window().maximize();
		
		//Input Username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		//input password
		driver.findElement(By.id("password")).sendKeys("crmsfa");	
		
		
		//click on submit button
		WebElement Submitbtn = driver.findElement(By.className("decorativeSubmit"));
		Submitbtn.click();
	
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		
		//Fill the details
		driver.findElement(By.id("accountName")).sendKeys("Karthika");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("numberEmployees")).sendKeys("5");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		driver.findElement(By.className("smallSubmit")).click();
		
		//Verify the title
		
		
		String ExpectedStr ="Account Details | opentaps CRM";
		String Title =driver.getTitle();
		System.out.println("Title of the Page is : " +Title);
		
		if(Title.equals(ExpectedStr)) {
			
			System.out.println("Passed: Title Matched");
		}
		else
		{
			System.out.println("Failed: Title is not matched");
		}
		
		
		
		driver.close();
		
		
	}

}