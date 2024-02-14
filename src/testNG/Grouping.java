package testNG;

import org.testng.annotations.Test;

@Test(groups= {"allgroup"})  //if group mentioned at class level then we can  called all methods in class by grouping

public class Grouping {
	
	@Test(groups= {"sanity","regression"})
	public  void browseron() {
		System.out.println("sanity and regression");
	}

	@Test(groups= {"sanity"})
	public void test2() {
		System.out.println("only sanity");
	}

	@Test(groups= {"sanity","smoke"})   //because of dependson it will execute parent and then child which depend on parent method
	public void first() {
		System.out.println("sanity and smoke test");
	}

	@Test(groups= {"regression","functional"})
	public void test3() {
		System.out.println("regression and functional");
	}

	@Test(groups= {"functional","smoke"})                  
	public void forth() {                           
		System.out.println("functional and smokde");
	}

	@Test(groups= {"functional","regression"})
	public  void browseroff() {
		System.out.println("functional and regression");

	}

}
