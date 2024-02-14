package testNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parallel_execution {
	
	@Test(dataProvider = "databank")
	public  void BM(String user, String addpass) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogesh\\Downloads\\seleniumPractice\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.setBinary("C:\\Users\\Yogesh\\Downloads\\chrome-win64\\chrome-win64//chrome.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(co);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(user);
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(addpass);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}
	
	@DataProvider(name="databank", parallel=true)     //either we can use dataprovider name or method name
	public Object[][] testdata() {
		Object[][] obj=new Object[4][2];
		obj[0][0]="Admin";
		obj[0][1]="admin123";
		obj[1][0]="superman";
		obj[1][1]="547895"; 
		obj[2][0]="Admin";
		obj[2][1]="admin123";
		obj[3][0]="superman";
		obj[3][1]="547895";
		return obj;
	}
}
