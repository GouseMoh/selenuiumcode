package day34;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.IListeners;


public class MyListener implements ITestListener {
	public void onFinish(ITestContext Context)
	{
		System.out.println("On Finish");
	}
	public void onStart(ITestContext Context)
	{
		System.out.println("On Start");
	}
	public void onTestFailure(ITestResult result)
	{
		System.out.println("On TestFailure");
	}
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("On TestSkipped");
	}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("On TestSuccess");
	}
	public void onTestStart(ITestResult result)
	{
		System.out.println("On TestStart");
	}
}
