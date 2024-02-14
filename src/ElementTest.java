import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ElementTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogesh Bojjawar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver =new ChromeDriver();  

driver.get("https://profile.w3schools.com/log-in?redirect_url=https%3A%2F%2Fmy-learning.w3schools.com");

driver.manage().window().maximize();
//driver.findElement(By.name("email")).sendKeys("bojjawaryogesh@gmail.com");
//driver.findElement(By.id("modalusername")).sendKeys("bojjawaryogesh@gmail.com");
//driver.findElement(By.id("current-password")).sendKeys("yogeshbojjawar");
//


//driver.findElement(By.className("_ZsgaF")).sendKeys("bojjawaryogesh@gmail.com");
//driver.findElement(By.id("current-password")).sendKeys("bojjawaryogesh");
//
//driver.findElement(By.className("_1VfsI")).click();

           //*****xpath by attribute***********/////////
//driver.findElement(By.xpath("//input[@id='modalusername']")).sendKeys("bojjawaryogesh@gmail.com");
//driver.findElement(By.xpath("//span[text()='Please enter an email']")).sendKeys("bojjawaryogesh@gmail.com");   //some problem findout
//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("bojjawaryogesh@gmail.com");
//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("superman@gmail.com");

///////////**********below line is following sibling....here it first check email headline and then follow sibling
driver.findElement(By.xpath("//label[text()=\"Email\"]/parent::div/following-sibling::div/input[@class='_ZsgaF undefined']")).sendKeys("bojjawaryogesh@gmail.com");

//////////////**********
//driver.findElement(By.xpath("//input[@class='_lEWNL']")).sendKeys("dontaskagain");
//driver.findElement(By.xpath("//input[@name='current-password']")).sendKeys("dontaskagain");
//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("dontaskagain");
//driver.findElement(By.xpath("//input[@id='current-password']")).sendKeys("dontaskagain");
//
//driver.findElement(By.xpath("//div[@class='_2NfeO _UwuXC']")).sendKeys("dontaskagain");//...error
//driver.findElement(By.xpath("//input[contains(@class,'_lEWNL')]")).sendKeys("dontaskagain"); //x path by contains
//driver.findElement(By.xpath("//input[@id='current-password']")).sendKeys("goajaung")[1];            //...error
driver.findElement(By.xpath("//label[text()=\"Password\"]/parent::div/following-sibling::input[@class='_lEWNL']")).sendKeys("yesiblinghai");
	
	//driver.findElement(By.xpath("//div[@class='_20LW8']")).click();
	//driver.findElement(By.xpath("//button[@class='_1VfsI _OD95i _3_H0V']")).click();
	driver.findElement(By.xpath("//button[contains(@class,'_1VfsI _OD95i _3_H0V')]")).click();
	
	Thread.sleep(6000);
	
String title1=driver.findElement(By.xpath("//div[contains(@class,'_2NfeO _1Stji')]")).getText();
	System.out.println(title1);
	
	if(title1.equals("A user with this email does not exist")) {
		System.out.println("pass");
	}
	else {
		System.out.println("fail");
	}
	Thread.sleep(4000);
	
	driver.quit();
	
	}

			
	}

