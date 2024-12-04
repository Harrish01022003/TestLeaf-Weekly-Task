package week7.day2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
	public static void main(String[] args) throws IOException{
		//set the file path into fileinputstream constructor
		FileInputStream fis = new FileInputStream("./src/main/resources/Credentials.properties");
		//create obj reference for properties clas
		Properties prop = new Properties();
		//Load the fileInputStream into the properties by load()
		prop.load(fis);
		//read the values by using key, use method getProperty(String key)
		String name = prop.getProperty("username");
		String pwd = prop.getProperty("password");
//		String pass = prop.getProperty("pass value");
		System.out.println("User name is "+name);
		prop.setProperty("username2", "democsr");
		System.out.println("password is "+pwd);
		
	}

}
