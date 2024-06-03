package utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
	private int retryCount = 0;
    private static final int maxRetryCount = 2; // Maximum number of retry attempts

    @Override
    public boolean retry(ITestResult result) {
    	if (retryCount < maxRetryCount) {
            retryCount++;
            return true;
        }
        return false;
    }
}


//if (!result.isSuccess() && count < MAX_RETRY_COUNT) {
//    count++;
//    return true;