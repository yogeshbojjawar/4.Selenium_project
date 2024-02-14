import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaSameclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Yogesh Bojjawar\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.get("https://www.instagram.com/accounts/login/");
driver.manage().window().maximize();
Thread.sleep(4000);

driver.findElement(By.xpath("(//input[@class='_2hvTZ pexuQ zyHYP'])[2]")).sendKeys("yogesh@23439");

driver.findElement(By.xpath("(//input[@class='_2hvTZ pexuQ zyHYP'])[1]")).sendKeys("yogeshkskdk@gmail.com");

Thread.sleep(4000);

driver.close();








	}

}
