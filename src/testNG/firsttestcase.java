package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class firsttestcase {

		
	@BeforeMethod
	public  void BM() {
		System.out.println("browser open");
	}
	@Test
	public void verify() {
		System.out.println("verify name");
	}
	@Test
	public void verify2() {
		System.out.println("verify password");
	}

	@AfterMethod
	public  void AM() {
		System.out.println("browser close");
	}


		}

	


