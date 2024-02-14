package testNG;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class screenshotListener extends CaptureScreenshot implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getMethod().getMethodName());    
		try {
			captureSS(result.getMethod().getMethodName() +".png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
