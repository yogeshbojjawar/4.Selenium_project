package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Movetoelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogesh Bojjawar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver =new ChromeDriver();     //to launch the chromedriver
       driver.get("https://www.amazon.in/");  
      
       driver.manage().window().maximize();
       
       driver.getCurrentUrl();
       System.out.println(driver.getCurrentUrl());
       
       
       
       
      WebElement btn= driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
      
      Actions act=new Actions(driver);
      act.moveToElement(btn).click().perform();
     
      WebElement signin= driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
      act.moveToElement(signin).click().perform();
      
      //act.moveToElement(btn).moveToElement(signin).click().perform();    
      
      
      driver.close();

	}

}
