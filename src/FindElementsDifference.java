import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsDifference {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogesh\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.swiggy.com/");
		
		//findelement  --->return only single webelement
		
		//1 this locator is pointing to single element
		WebElement searchbox = driver.findElement(By.xpath("//input[@id='location']"));  
		searchbox.sendKeys("Mumbai");
		
		//2 among 22 matching elements it will point to only one element i.e first element
		WebElement multiele = driver.findElement(By.xpath("//div[@class=\"_3ipKA\"]//a"));
		System.out.println(multiele.getText());                 // it will point only first element
		
		//3. if element is not present then it throw exception i.e. nosuchelement excpetion
		
		
		//fINDELEMENTS ---->return multiple webelement
		List<WebElement>links = driver.findElements(By.xpath("//div[@class=\"_3ipKA\"]//a"));
		System.out.println("Number of elements captured " +links.size());
		
		//2. it can hold single and multiple elements as well
		List<WebElement>image = driver.findElements(By.xpath("(//img[@class='_2dYjq'])[2]\r\n")); //this is single webelement
		System.out.println("Number of elements captured " +image.size());
		
		//3. if locator is not matching it doesn't give any excptions
		List<WebElement>exceptioncheck = driver.findElements(By.xpath("//div[@class=\"yogeshBojjawar\"]//a"));  //this elelmetn doesn't exist 
		System.out.println(exceptioncheck.size());

		
		/*for(WebElement list : links) {
			System.out.println(list.getText());
		}*/

		//####how to capture all the links on the page
		List<WebElement>listoflinks = driver.findElements(By.tagName("a"));
		System.out.println("No. of links present "+links.size());
	}

	}
	
