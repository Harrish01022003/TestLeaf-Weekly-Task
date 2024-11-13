package homeWeek2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class FacebookLogin {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();


		//Launch the URL
		driver.get("https://en-gb.facebook.com/");
		
		//Maximize the window 
		driver.manage().window().maximize();
		
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("FB");
		driver.findElement(By.name("lastname")).sendKeys("ACCOUNT");	
		
		//driver.findElement(By.id("day")).click();
		WebElement element1 = driver.findElement(By.id("day"));
		element1.click();
		//WebElement element1 = driver.findElement(By.id("day"));
		Select obj= new Select (element1);
		obj.selectByVisibleText("23");
		
		WebElement element2 = driver.findElement(By.id("month"));
		element2.click();
		
		Select obj2= new Select (element2);
		obj2.selectByVisibleText("Nov");
		
		
		WebElement element3 = driver.findElement(By.id("year"));
		element3.click();
		
		Select obj3= new Select (element3);
		obj3.selectByVisibleText("1991");
		
		driver.findElement(By.xpath("(//input[@id='sex'])[2]")).click();
		
		driver.findElement(By.name("reg_email__")).sendKeys("facebook@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("facebook@01");		
		
	}

}