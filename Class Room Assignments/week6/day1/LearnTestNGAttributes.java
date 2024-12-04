package week6.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnTestNGAttributes {

	@Test(priority = 3, enabled = false)
	public void runLogin() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Login TC");
	}
	// it will execute as per the lowest asci value so we can use (priority = 2) to prioritize it
	// if the priority was same for two method based on the low asci value it will execute
	@Test(priority = 2, dependsOnMethods = {"runLogin"}, alwaysRun = true)
	public void runCreateLead() {
		System.out.println("Create lead tc");
	}
	
	//invocationCount = 3 to execute 3 times 3 can be changed
	@Test(priority = 1 , invocationCount = 3, threadPoolSize = 2)
	public void runCreateAccount() throws InterruptedException {
		//ChromeDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		System.out.println("Create account");
	}
}
