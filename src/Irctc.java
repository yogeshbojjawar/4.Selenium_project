import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Yogesh Bojjawar\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
driver.findElement(By.xpath("(//input[@role='searchbox'])[1]")).sendKeys("AURANGABAD - AWB");

driver.findElement(By.xpath("(//input[@role='searchbox'])[2]")).sendKeys("H SAHIB NANDED - NED");

		
		
		driver.findElement(By.xpath("//span[@class='ui-dropdown-trigger-icon ui-clickable ng-tns-c66-12 pi pi-chevron-down']")).click();
		Thread.sleep(4000);
WebElement sel=driver.findElement(By.xpath("(//span[@class='ng-star-inserted'])[5]"));
System.out.println(sel.getText());
boolean status=sel.isDisplayed();

if(status==true) {
	sel.click();
}

	
	
	driver.findElement(By.xpath("//div[@class='ng-tns-c66-11 ui-dropdown ui-widget ui-state-default ui-corner-all']")).click();
	
	driver.findElement(By.xpath("//li[@aria-label='AC 2 Tier (2A)']")).click();
	driver.findElement(By.xpath("//label[@for='availableBerth']")).click();
	String txt=driver.findElement(By.xpath("//label[@for='availableBerth']")).getText();
	System.out.println(txt);
	
	if(txt.equals("Train with Available Berth")){
		driver.findElement(By.xpath("//button[@class='search_btn train_Search']")).click();
	}

	}

}
