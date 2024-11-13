package homeWeek2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountWithSelect {

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
		driver.findElement(By.id("accountName")).sendKeys("qwertp4");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");

		WebElement element1 = driver.findElement(By.name("industryEnumId"));
		Select s= new Select(element1);
		s.selectByVisibleText("Computer Software");

		WebElement element2 = driver.findElement(By.name("ownershipEnumId"));
		Select so= new Select(element2);
		so.selectByVisibleText("S-Corporation");

		WebElement element3 = driver.findElement(By.id("dataSourceId"));
		Select sor= new Select(element3);
		sor.selectByValue("LEAD_EMPLOYEE");


		WebElement element4 = driver.findElement(By.id("marketingCampaignId"));
		Select smc= new Select(element4);
		smc.selectByIndex(6);

		WebElement element5 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select pr= new Select(element5);
		pr.selectByValue("AL");
		
		driver.findElement(By.className("smallSubmit")).click();

		WebElement AccName = driver.findElement(By.xpath("//span[contains(text(),'qwertp4')]"));
		String text = AccName.getText();
		
//		String inputtext = text.substring(0,6);
//		System.out.println(inputtext);

		text.trim();
		System.out.println(text);


		if(text.equals("qwertp4")) {

			System.out.println("Passed: Acc name Matched");
		}
		else
		{
			System.out.println("Failed: Acc Name is not matched");
		}
		driver.close();
	}

}