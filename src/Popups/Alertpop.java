package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogesh Bojjawar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 
		WebDriver driver =new ChromeDriver();    
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
		Alert a=driver.switchTo().alert();
		System.out.println();
		System.out.println("the message displayed on the alert"+a.getText());
		
		//a.sendkeys("if popup needs any text")
		
		a.accept();
	//	driver.switchTo().alert().accept();         //other one is dismiss
	a.getText();
	System.out.println(a.getText());
		
		
		
		/*
		 driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth")
		 
		          https://user:password@URL
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
