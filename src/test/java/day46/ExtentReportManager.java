package day46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener
{

	public ExtentSparkReporter sparkReporter; //UI(user interface) of the report
	public ExtentReports extent;//populate common info of the report
	public ExtentTest test;//creating test cases entry of the report and update status of the test methods
	
	
	public void onStart(ITestContext context)
	  {
		sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/report/Myreport.html");
		sparkReporter.config().setDocumentTitle("Automation Report");
		sparkReporter.config().setReportName("Functional Testing");
		sparkReporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		extent.setSystemInfo("Computer Name", "localhost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Tester Name", "Chaithu");
		extent.setSystemInfo("Os", "window11");
		extent.setSystemInfo("Browser Name", "Chrome");
	  }
	
	public void onTestSuccess(ITestResult result)
	 {
		test=extent.createTest(result.getName());//create new entry in the report
		test.log(Status.PASS, "Test Case Passed is:"+result.getName());//update status
		  
	 }
	
	public void onTestFailure(ITestResult result)
	 {
		test=extent.createTest(result.getName());//create new entry in the report
		test.log(Status.FAIL, "Test Case Failed is:"+result.getName());
		test.log(Status.FAIL, "Test Case Failed cause:"+result.getThrowable());
	 }
	
	public void onTestSkipped(ITestResult result)
	 {
		test=extent.createTest(result.getName());//create new entry in the report
		test.log(Status.SKIP, "Test Case Skipped is:"+result.getName());
	 }
	public void onFinish(ITestContext context) {
	    extent.flush(); // This writes the report to disk! 
	}
}
