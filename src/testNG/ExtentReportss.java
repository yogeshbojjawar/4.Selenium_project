package testNG;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentXReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportss {
	
	ExtentReports extent;   //specify the location of reports
	ExtentTest test;          //what details should populate in the report
	  


	@Test
	public  void extentcode() throws IOException {
		//create extent report and attach extent report
     ExtentHtmlReporter htmlreporter = new ExtentHtmlReporter("reportsof.html");

      
     ExtentReports extent = new ExtentReports();
     extent.attachReporter(htmlreporter);
     
     extent.setSystemInfo("Host name", "local host");
     extent.setSystemInfo("user", "yogesh");
     htmlreporter.config().setDocumentTitle("title of report");
     htmlreporter.config().setReportName("functional testing");
     htmlreporter.config().setTestViewChartLocation(ChartLocation.TOP);  //location of chart
     htmlreporter.config().setTheme(Theme.DARK);
     
     
     test = extent.createTest("Myfirsttet","login to orangeHRM");
     
     ChromeOptions co = new ChromeOptions();
	 co.addArguments("--remote-allow-origins=*");
     WebDriverManager.chromedriver().setup();
	 WebDriver driver= new ChromeDriver(co);
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     //test.fail("status", MediaEntityBuilder.createScreenCaptureFromPath("screenshoot.png").build());

     test.log(Status.INFO, "starting of the test case");
     
     test.pass("this is pass description");
     test.info("this shows info of usage details");
     
     test.fail("status", MediaEntityBuilder.createScreenCaptureFromPath("screenshoot.png").build());
     test.addScreenCaptureFromPath("added.png");
     extent.flush();

		
		 
	}
	

}
