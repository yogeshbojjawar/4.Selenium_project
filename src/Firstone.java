import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Firstone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(co);
        
        
//       driver.get("https://in.linkedin.com/");
//        String title=driver.getTitle();
//        System.out.println(driver.getTitle());
//        
//        String url=driver.getCurrentUrl();          //checks it is url same url or not
//		System.out.println(url);
//		
//        if (title.equals("LinkedIn India: Log In or Sign Up")) {
//        	System.out.println("pass"); 	
//        }
//        else {
//        	System.out.println("fail");
//        }
//        
//        driver.close();            ///close the current window
//        driver.quit();             //close all window    
	//*********************************************************//
        
		driver.navigate().to("https://in.linkedin.com/");          //another way to visit the page
		
		System.out.println(driver.getPageSource());
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
        driver.navigate().refresh();
       
        driver.navigate().forward();
      driver.manage().window().maximize();
      driver.manage().window().minimize();
      System.out.println("driver.getPageSource()");
    
        
        
        
        
        
        
	}

}
