package com.thoughtworks.base;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener extends BaseClass implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        Screenshots screenshot = new Screenshots();
        System.out.println("In the OnTestStart method ");
        screenshot.getScreenShots(driver,result.getMethod().getMethodName());

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        Screenshots screenshot = new Screenshots();
        System.out.println("In the OnTestSuccess method ");
        screenshot.getScreenShots(driver,result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailure(ITestResult result) {

    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }
}
