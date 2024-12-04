package week8.day2;

import java.util.Locale;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class GenerateDynamicData {

	@Test
	public void generateTestData() {
		Faker fake = new Faker(Locale.ENGLISH);
		String fullName = fake.name().fullName();
		String firstName = fake.name().firstName();
		String lastName = fake.name().lastName();
		String email = firstName+lastName+"@testleaf.com";
		String phoneNumber = fake.phoneNumber().phoneNumber();
		System.out.println("fullName is :  "+fullName);
		System.out.println("fname is : "+ firstName);
		System.out.println("lnaem is : "+lastName);
		System.out.println("email is : "+email);
		System.out.println("ph is : "+phoneNumber);
	
	
	}
	
}
