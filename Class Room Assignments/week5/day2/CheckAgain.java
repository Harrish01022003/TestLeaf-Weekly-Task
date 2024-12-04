package week5.day2;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class CheckAgain implements IRetryAnalyzer {

    // Set the retry count to 3 for example
    private int retryCount = 0;
    private static final int maxRetryCount = 3;

    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            System.out.println("Retrying test: " + result.getName() + " for the " + retryCount + " time.");
            return true; // Retry the test
        }
        return false; // Do not retry if max retry count reached
    }
}
