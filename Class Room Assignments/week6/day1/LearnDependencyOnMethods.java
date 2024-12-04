package week6.day1;

import org.testng.annotations.Test;

public class LearnDependencyOnMethods {
	@Test
	public void runLogin() {
		System.out.println("LOGIN");
	}
	@Test(dependsOnMethods = {"runLogin","week5.day1.CreateLead.runCreateLead"})
	public void runLead() {
		System.out.println("created");
	}

}
