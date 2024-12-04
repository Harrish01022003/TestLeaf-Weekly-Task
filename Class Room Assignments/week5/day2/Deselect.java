package week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselect {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml;jsessionid=node0zip0ot4177ky1g187jbvdidvx7673624.node0");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.className("//select[@class='ui-selectonemenu']"));
		Select obj = new Select(element);
		obj.selectByIndex(1);
	}

}
