package testNG;

import org.testng.annotations.Test;

public class groupclass {
	
	@Test(groups= {"sanity","regression"})
	public  void browseron() {
		System.out.println("sanity and regression from another class");
	}

	@Test(groups= {"sanity"})
	public void test2() {
		System.out.println("only sanity from another class");
	}

	@Test(groups= {"sanity","smoke"})   //because of dependson it will execute parent and then child which depend on parent method
	public void first() {
		System.out.println("sanity and smoke test from another class");
	}

	@Test(groups= {"regression","functional"})
	public void test3() {
		System.out.println("regression and functional from another class");
	}

	@Test(groups= {"functional","smoke"})                  
	public void forth() {                           
		System.out.println("functional and smokde from another class");
	}

	@Test(groups= {"functional","regression"})
	public  void browseroff() {
		System.out.println("functional and regression from another class");

	}
}
