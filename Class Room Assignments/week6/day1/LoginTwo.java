package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTwo {
	public ChromeDriver driver;

	@Given("Launch the Browser and Load the Url")
	public void launch_the_browser_and_load_the_url() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

//	@When("Enter the username as {string}")
//	public void enter_the_username_as_demo_sales_manager(String user) {
//		driver.findElement(By.id("username")).sendKeys(user);
//		// Write code here that turns the phrase above into concrete actions
//		// throw new io.cucumber.java.PendingException();
//	}
//
//	@And("Enter the passWord as {string}")
//	public void enter_the_pass_word_as_crmsfa(String password) {
//		driver.findElement(By.id("password")).sendKeys(password);
//		// Write code here that turns the phrase above into concrete actions
//		// throw new io.cucumber.java.PendingException();
//	}
//
//	@And("Click on Login Button")
//	public void click_on_login_button() {
//		driver.findElement(By.className("decorativeSubmit")).click();
//		;
//		// Write code here that turns the phrase above into concrete actions
//		// throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("Verify the login is successful")
//	public void verify_the_login_is_successful() {
//		String title = driver.getTitle();
//		if (title.contains("Leaftaps")) {
//			System.out.println("Title is verified");
//		} else {
//			System.out.println("Not verified");
//		}
//		// Write code here that turns the phrase above into concrete actions
//		// throw new io.cucumber.java.PendingException();
//	}
	@When("Enter the username as demoSalesManager")
	public void enter_the_username_as_demo_sales_manager() {
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("Enter the passWord as crmsfa")
	public void enter_the_pass_word_as_crmsfa() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("password")).sendKeys("crmsfa");//
		throw new io.cucumber.java.PendingException();
	}
	@And("Click on Login Button")
	public void click_on_login_button1() {
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}
	@Then("Verify the login is not successful")
	public void verify_the_login_is_not_successful1() {
	    // Write code here that turns the phrase above into concrete actions
		String title = driver.getTitle();
		if (title.contains("Leaftaps")) {
			System.out.println("Title is verified");
		} else {
			System.out.println("Not verified");
		}
		//throw new io.cucumber.java.PendingException();
	}

	@And("Enter the username as 23demoSalesManager")
	public void enter_the_username_as_23demo_sales_manager() {
		driver.findElement(By.id("username")).sendKeys("23demoSalesManager");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@And("Enter the passWord as ggcrmsfa")
	public void enter_the_pass_word_as_ggcrmsfa() {
		driver.findElement(By.id("password")).sendKeys("ggcrmsfa");
		// Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@And("Click on Login Button")
	public void click_on_login_button2() {
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}
	@But("Verify the login is not successful")
	public void verify_the_login_is_not_successful2() {
	    // Write code here that turns the phrase above into concrete actions
		String title = driver.getTitle();
		if (title.contains("Leaftaps")) {
			System.out.println("Title is verified");
		} else {
			System.out.println("Not verified");
		}
		//throw new io.cucumber.java.PendingException();
	}
}
