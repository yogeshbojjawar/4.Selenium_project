import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FollowingPreceeding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Yogesh Bojjawar\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();     //to launch the chromedriver

		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_2')]")).click();
		
		
		
		//div[@id='reg_form_box']/child::div[10]/button
		//button[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']/parent::*/parent::*/child::div/div[1]/div/div
		//input[@class='inputtext _58mg _5dba _2ph-' and @id='u_3_g_6Z']/parent::*/parent::*/parent::*/following-sibling::div[2]/div/div/div
		
		//input[@data-type='password']/preceding::input[2]
		//label[text()='Female']/preceding::input[6]
		
	}

}
