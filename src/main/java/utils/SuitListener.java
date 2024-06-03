package utils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.IAnnotationTransformer;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

import base.BaseTest;
import org.testng.ITestContext;

public class SuitListener implements ITestListener, IAnnotationTransformer {

    @Override
    public void onStart(ITestContext context) {
    }

    @Override
    public void onFinish(ITestContext context) {
    }

    @Override
    public void onTestStart(ITestResult result) {
    }

    @Override
    public void onTestSuccess(ITestResult result) {
    }

    @Override
    public void onTestFailure(ITestResult result) {
        captureScreenshot(result);
    }

    @Override
    public void onTestSkipped(ITestResult result) {
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        annotation.setRetryAnalyzer(RetryAnalyzer.class);
    }

    private void captureScreenshot(ITestResult result) {
        String methodName = result.getMethod().getMethodName();
        String filename = System.getProperty("user.dir") + File.separator + "screenshots" + File.separator + methodName + ".png";

        try {
            TakesScreenshot screenshot = (TakesScreenshot) BaseTest.driver;
            File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(srcFile, new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void captureScreenshotOnStep(String methodName) {
        String filename = System.getProperty("user.dir") + File.separator + "screenshots" + File.separator + methodName + ".png";

        try {
            TakesScreenshot screenshot = (TakesScreenshot) BaseTest.driver;
            File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(srcFile, new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
