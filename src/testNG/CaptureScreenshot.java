package testNG;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners({screenshotListener.class})

public class CaptureScreenshot {

public static WebDriver driver;
@Test
public  void demo() throws InterruptedException {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(co);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String expectedtitle="orange hrm";
		String actualtitle=driver.getTitle();
		assertEquals(actualtitle, expectedtitle, "title is mismatched");
	}   


public void captureSS(String filename) throws IOException {
	TakesScreenshot takeSS=  (TakesScreenshot) driver;
	File sourcefile =  takeSS.getScreenshotAs(OutputType.FILE);
	File destfile = new File("./getscreens/"+filename);
	FileUtils.copyFile(sourcefile, destfile);
	
}
}
