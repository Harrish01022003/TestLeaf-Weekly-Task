package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificationMethod{
	
	@Test(dataProvider = "sendData")
	public void runCreateLead(String cname, String fname, String lname) {
		
		/*ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();*/
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.name("submitButton")).click();
		//driver.close();
}
	@DataProvider
	public String[][] sendData() {
		
		//datatype[][] variablename = new datatype[rowsize][colsize]
		
		String[][] data = new String[2][3];
		
		data[0][0] = "Testleaf";
		data[0][1] = "Gokul";
		data[0][2] = "sekar";
		
		
		data[1][0] = "Qeagle";
		data[1][1] = "Harrish";
		data[1][2] = "A";
		
		
		return data;
	
	}
}

