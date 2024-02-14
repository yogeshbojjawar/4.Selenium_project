import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDropdown {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogesh\\Downloads\\seleniumPractice\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.setBinary("C:\\Users\\Yogesh\\Downloads\\chrome-win64\\chrome-win64//chrome.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(co);
		
		driver.get("https://www.hdfcbank.com");
		
		driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();
		
		List<WebElement>options = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']//li"));
		System.out.println("number of options: "+options.size());
	
		
		for(WebElement ptype : options) {
			if(ptype.getText().equals("EMI")) {
				ptype.click();
				break;
			}	
		}
		
	
       driver.findElement(By.xpath("//div[@class='drp2']//div[@class='dropdown']")).click();
       List<WebElement>seconddrop=driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']//li"));
       selectdropdown(seconddrop,"Lifestyle");
		
		
}
	//##This is generic method
	public static void selectdropdown(List<WebElement>ele, String data) {
		System.out.println("number of options: "+ele.size());
		
		for(WebElement ptype : ele) {
			if(ptype.getText().equals(data)) {
				ptype.click();
				break;
			}	
		}
	}
	
	
	/*###how to capture all the links on the page
	List<WebElement>links = driver.findElements(By.tagName("a"));
	System.out.println("No. of links present "+links.size());

              for(webelement links: listoflinks){
                    syso(links.getText());
                    syso(links.getAttribute("href");*/

   }