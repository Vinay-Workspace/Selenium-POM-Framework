package resuableComponent;


import java.text.SimpleDateFormat;
import java.util.Date;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class ExtentSetup {
	
	public static  ExtentReports setupExtentReport() {
		
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
		Date date = new Date();
		String ActualDate = format.format(date);
		
		
		String Reports = System.getProperty("user.dir")+
				"/Reports/ExecutionReport_"+ActualDate+".html";
		
		
		ExtentSparkReporter sparkReport = new ExtentSparkReporter(Reports);
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(sparkReport);
		
		sparkReport.config().setDocumentTitle("DocumentTitle");
		sparkReport.config().setTheme(Theme.DARK);
		sparkReport.config().setReportName("ReportName");
		
		return extent;
		
		
		
	}

}
