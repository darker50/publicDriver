package test.MyCase;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import test.com.baseDriver;
public class testClass1 {
	
	AndroidDriver driver;
	@BeforeTest
	public void testGetOrder(){
		this.driver = baseDriver.getDriver();
	} 
	@Test
	public void testOne(){
		System.out.print("class111");
		this.driver.resetApp();
		System.out.print("class111111");
}
}
