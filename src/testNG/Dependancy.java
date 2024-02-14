package testNG;

import org.testng.annotations.Test;


public class Dependancy {
	
	static String trackingnumber=null;
	
	@Test(priority=1)
	public void createshipment() {
		//System.out.println(5/0);
		System.out.println("createshipment");
        trackingnumber="sf";
		
	}
	
	@Test(priority=2, dependsOnMethods = {"createshipment"},alwaysRun=true )
	public void trackingshipment() throws Exception {
		//System.out.println(5/0);

		if(trackingnumber!=null) 
			System.out.println("trackingshipment");
		else
			throw new Exception("invalid tracking number");
		
	}

	
	@Test(priority=3, dependsOnMethods ={"createshipment","trackingshipment"} )
	public void cancelshipment() throws Exception {
	if(trackingnumber!= null)
		System.out.println("cancelshipment");
	else
		throw new Exception("invalid trackibg number");


	}

}
