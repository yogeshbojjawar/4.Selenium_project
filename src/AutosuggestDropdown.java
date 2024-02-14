import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutosuggestDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogesh\\Downloads\\seleniumPractice\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.setBinary("C:\\Users\\Yogesh\\Downloads\\chrome-win64\\chrome-win64//chrome.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(co);
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.xpath("//textarea[@title=\"Search\"]")).sendKeys("java");
		
		Thread.sleep(3000);
		
		List<WebElement>searchlist=driver.findElements(By.xpath("//div[@class=\"mkHrUc\"]//div//div[@role=\"presentation\"]//ul//li"));
		
		for(WebElement options : searchlist) {
			if(options.getText().equalsIgnoreCase("java compiler")) {
				options.click();
				break;
			}
		}
		
	
        System.out.println("handling of autosuggestion box completed");
        
        driver.get("https://in.search.yahoo.com/search?fr=mcafee&type=E211IN714G0&p=zomato");
        String newtab=Keys.chord(Keys.CONTROL,Keys.RETURN);
        driver.findElement(By.linkText("Best Restaurants in India - Zomato")).sendKeys(newtab);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
