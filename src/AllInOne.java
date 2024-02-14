import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllInOne {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogesh\\Downloads\\seleniumPractice\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.getTitle();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		 
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();	
		Thread.sleep(4000);
		
	String text=driver.findElement(By.xpath("//p[contains(text(),'By clicking Sign Up')]")).getText();
	System.out.println(text);
	
	Actions act=new Actions(driver);
	WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
	
	Select sel=new Select(day);
 
      Thread.sleep(2000);        
      System.out.println(sel.getOptions().size());
	
	 	
//		System.out.println(driver.findElement(By.xpath("//a[contains(@id,'u_0_2')]")).isSelected());
//System.out.println(driver.findElement(By.xpath("//a[contains(@id,'u_0_2')]")).isDisplayed());
//System.out.println(driver.findElement(By.xpath("//a[contains(@id,'u_0_2')]")).isEnabled());	
driver.close();
	}

}
