package Utility;

import org.apache.poi.ss.formula.functions.T;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.configuration.Theme;

import com.aventstack.extentreports.ExtentTest;

public class Extentreportmanager implements ITestListener {

	private static ExtentReports extent = Extentmanager.createInstance("extent.html");
	private static ThreadLocal<T> parentTest = new ThreadLocal();
    private static ThreadLocal<T> test = new ThreadLocal();
	
    @Override
	public synchronized void onStart(ITestContext context) {
    	ExtentTest parent = extent.createTest(getClass().getName());
        parentTest.set(parent);
	}

	@Override
	public synchronized void onFinish(ITestContext context) {
		extent.flush();
	}
	
	@Override
	public synchronized void onTestStart(ITestResult result) {
		ExtentTest child = parentTest.get().createNode(result.getMethod().getMethodName());
        test.set(child);
	}

	@Override
	public synchronized void onTestSuccess(ITestResult result) {
		test.get().pass("Test passed");
	}

	@Override
	public synchronized void onTestFailure(ITestResult result) {
		test.get().fail(result.getThrowable());
	}

	@Override
	public synchronized void onTestSkipped(ITestResult result) {

}
	test.get().skip(result.getThrowable());


@Override
public synchronized void onTestFailedButWithinSuccessPercentage(ITestResult result)
{
}


}
}
