import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogesh\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver= new ChromeDriver();
				
				driver.get("https://www.facebook.com/");
				
				driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();				
			
/*
System.out.println(driver.findElement(By.xpath("//a[contains(@id,'u_0_2')]")).isSelected());
System.out.println(driver.findElement(By.xpath("//a[contains(@id,'u_0_2')]")).isDisplayed());
System.out.println(driver.findElement(By.xpath("//a[contains(@id,'u_0_2')]")).isEnabled());	*/

Thread.sleep(2000);
					
		WebElement day=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		
		Select dates=new Select(day);
		
	  //dates.selectByValue("25");
        dates.selectByIndex(24);     //index starts from zero
      //dates.selectByVisibleText("25");
          Thread.sleep(2000);        
          System.out.println(dates.getOptions().size());
      
//## selecting options from dropdown without using the method
          List<WebElement>alloption = dates.getOptions();
          
          for(WebElement option: alloption) {
        	  if(option.getText().equals("27")) {
        		  option.click();
        		  break;  
        	  } 
          }
        
          
    
          
WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
selectoptionfrmdropdown(month, "May");

WebElement year= driver.findElement(By.xpath("//select[@id='year']"));
selectoptionfrmdropdown(year, "1998");


 
/* driver.findElement(By.xpath("//label[text()='Male']")).isDisplayed();
System.out.println(driver.findElement(By.xpath("//label[text()='Male']")).isDisplayed());

driver.findElement(By.xpath("//label[text()='Male']")).isSelected();
boolean status=driver.findElement(By.xpath("//label[text()='Female']")).isSelected();

if(status==false) {
	driver.findElement(By.xpath("//label[text()='Female']")).click();
}
*/


driver.close();
	}

	
		public static void selectoptionfrmdropdown(WebElement ele,String value){
			  Select drp=new Select(ele);
			  List<WebElement>optionfromdrop = drp.getOptions();
		    
		    for(WebElement option: optionfromdrop) {
		  	  if(option.getText().equals(value)) {
		  		  option.click();
		  		  break;  
		  	  } 
		    }
		}
		
}
