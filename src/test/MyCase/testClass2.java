package test.MyCase;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import test.com.baseDriver;
public class testClass2 {
	
	public AndroidDriver driver;
	@BeforeTest
	public void getDriver(){
		driver = baseDriver.getDriver();
	} 
	@Test
	public void testTwo(){
		System.out.print("class2222");
		driver.resetApp();
		System.out.print("class22222");
}
}
