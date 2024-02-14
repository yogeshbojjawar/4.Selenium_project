package Popups;
 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getwindowhandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogesh\\Downloads\\seleniumPractice\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.setBinary("C:\\Users\\Yogesh\\Downloads\\chrome-win64\\chrome-win64//chrome.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(co);
		

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='Open Window']")).click();
		
		Set<String>list=driver.getWindowHandles();   //getwindowhandles returns parent and child window address
		
		System.out.println(list);
		
		String parentID=driver.getWindowHandle();  //getwindowhandle returns parent window address
		System.out.println(parentID);

		Iterator<String> it=list.iterator();
		
		String parentID1=it.next();  //parent
		String childID=it.next();     //child

		System.out.println(parentID1);
		System.out.println(childID);
		
		driver.switchTo().window(parentID1);
		System.out.println(driver.getTitle());
		driver.switchTo().window(childID);
		              //driver.close();
		
		
		//####2. SECOND APPROACH     //to use this approach please comment the first approach.
		
    	 List<String>windowslist = new ArrayList(list);   //converting set to list
		/*String parentID11= windowslist.get(0);   //parent windows id
		String childID1 =windowslist.get(1);     //child windows id */
		
		//for each loop
		for(String listofwindow: windowslist) {
			
			String title=driver.switchTo().window(listofwindow).getTitle();
            System.out.println(title);
		}
		
		Thread.sleep(2000);
		driver.close();  //close the browser to which driver is pointing
		//driver.quit(); //close all the browser windows
		
		
		
		
		

	}

}
