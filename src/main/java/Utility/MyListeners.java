package Utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListeners implements ITestListener{
	
	@Override
	public void onFinish(ITestContext contextFinish) {
		System.out.println("method finish aipoindi");

		}

		@Override
		public void onStart(ITestContext contextStart) {
		System.out.println("method start aindi");
		}

		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Method failed with certain success percentage"+ result.getName());

		}

		@Override
		public void onTestFailure(ITestResult result) {
			System.out.println("fail aindi "+ result.getName());

		}

		@Override
		public void onTestSkipped(ITestResult result) {
		System.out.println("Method skipped "+ result.getName());

		}

		@Override
		public void onTestStart(ITestResult result) {
		System.out.println("Method started "+ result.getName());

		}

		@Override
		public void onTestSuccess(ITestResult result) {
			System.out.println("pass aindi "+ result.getName());

		}
		
	
		}

		

