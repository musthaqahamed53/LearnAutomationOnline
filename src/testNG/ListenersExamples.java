package testNG;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.ITestContext;

public class ListenersExamples implements ITestListener {
	@Override
	public void onTestStart(ITestResult result) {
	
		System.out.println("Test case is going to execute");
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Test case is passed");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test case is failed");
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Test case is skipped");
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		System.out.println("Test case is within success percent");
	}
	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("Test case is onStart");
	}
	@Override
	public void onFinish(ITestContext context) {
		
		System.out.println("Test case is onFinish");
	}
}
