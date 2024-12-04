package week7.day2;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {

	public static void main(String[] args) {
		ExtentHtmlReporter repo = new ExtentHtmlReporter("./report/result.html");
		ExtentReports obj = new ExtentReports();
		obj.attachReporter(repo);
		
		
	}

}
