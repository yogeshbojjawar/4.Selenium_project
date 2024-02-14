import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementTest2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Yogesh Bojjawar\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
       WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();  

		driver.get("https://profile.w3schools.com/log-in?redirect_url=https%3A%2F%2Fmy-learning.w3schools.com");

		driver.manage().window().maximize();
		
	
  driver.findElement(By.xpath("//label[text()=\"Email\"]/parent::div/following-sibling::div/input[@class='_ZsgaF undefined']")).sendKeys("bojjawaryogesh@gmail.com");

//	WebElement element=driver.findElement(By.id("modalusername"));
//	element.click();
//	element.sendKeys("bojjawaryogesh@gmail.com");
	
		//driver.findElement(By.xpath("//label[text()=\"Password\"]/parent::div/following-sibling::input[@class='_lEWNL']")).sendKeys("yesiblinghai");
			
	WebElement password=driver.findElement(By.id("current-password"));
	password.click();
	password.sendKeys("thisispassword");
	
	
			driver.findElement(By.xpath("//button[contains(@class,'_1VfsI _OD95i _3_H0V')]")).click();
			
//			JavascriptExecutor js=((JavascriptExecutor)driver);
//			js.executeScript("history.go(0)");
			
			Thread.sleep(6000);
			
		String title1=driver.findElement(By.xpath("//div[contains(@class,'_2NfeO _1Stji')]")).getText();
			System.out.println(title1);
			
			if(title1.equals("A user with this email does not exist")) {
				System.out.println("pass");
			}
			else {
				System.out.println("fail");
			}
			Thread.sleep(4000);
			
			driver.quit();
			
			}

					
		


	}


