package waits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class explitwait {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys(Keys.RETURN);
		Thread.sleep(2000);
		
		
		
   WebElement search=driver.findElement(By.xpath("//h3[text()='Selenium']"));
 
   waitforpresent(driver,10,search);
   search.click();
			
		System.out.println("successful");
		
		
	}
	
	public static  void waitforpresent(WebDriver driver, int time, WebElement element) {
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(time));
		mywait.until(ExpectedConditions.visibilityOf(element));
	}

}
