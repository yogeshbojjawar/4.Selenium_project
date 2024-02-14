package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerClass implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("this is when test case start");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
    	System.out.println("this is when test case success");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("this is when test case failure");

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("this is when test case skipped");

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("this is when test case failed with timeout error");

	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("this is when test case initialization");

	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("this is when test case on finish");

	}

}
