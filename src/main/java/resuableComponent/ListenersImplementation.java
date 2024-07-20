package resuableComponent;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

import testBase.ObjectRepo;



public class ListenersImplementation extends ObjectRepo implements ITestListener {

	
	@Override
	public void onTestStart(ITestResult result) {
		
		test = extent.createTest(result.getMethod().getMethodName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		test.log(Status.PASS ,"Test Case:" +result.getMethod().getMethodName()+ "is Passed.");
	}

	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL ,"Test Case:" +result.getMethod().getMethodName()+ "is Failed.");
		test.log(Status.FAIL ,result.getThrowable());
		
		// addScreenshot for this
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
		Date date = new Date();
		String ActualDate = format.format(date);
		
		String screenshotPath = System.getProperty("user.dir")+
				"/Reports/ScreenShots_"+ActualDate+".jpeg";
		File dest = new File(screenshotPath);
		
		try {
			FileUtils.copyFile(src,dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.addScreenCaptureFromPath(screenshotPath, "TestCaseFailed");
	}
	

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		extent = ExtentSetup.setupExtentReport();  //setup a method	
	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();		

	}

}
