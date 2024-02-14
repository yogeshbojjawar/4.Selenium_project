package testNG;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ITestListenerClass.class})  //if we have multiple listener classes then add it by comma sepearated

public class Listener {

@Test
public void testmethod1() {
	System.out.println("I am inside testmethod1");

}

@Test
public void testmethod2() {
	System.out.println("I am inside testmethod2");
	Assert.assertTrue(false);
}

@Test(timeOut=1000)
public void testmethod3() throws InterruptedException {
	Thread.sleep(2000);
	System.out.println("I am inside testmethod3");

}

@Test(dependsOnMethods = "testmethod3")
public void testmethod4() {
	System.out.println("I am inside testmethod4");

}

@Test
public void testmethod5() {
	System.out.println("I am inside testmethod5");

}
}
