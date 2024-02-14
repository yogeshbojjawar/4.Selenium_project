package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parameteres {
	
	
	@Parameters({"Browser","user","addpass"})
	@BeforeMethod
	public  void BM(String addbrowser, String user, String addpass) throws InterruptedException {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(co);
		driver.get(addbrowser);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(user);
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(addpass);
		
		
		
	}
	
	@Test
	public void verify() {
		System.out.println("verify name");
	}
	@Test
	public void verify2() {
		System.out.println("verify password");
	}

	@AfterMethod
	public  void AM() {
		System.out.println("browser close");
	}

}
