package test.MyCase;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import test.com.baseDriver;
public class testClass1 {
	static  AndroidDriver driver;
	baseDriver baseDriverinit = new baseDriver();
	
	@BeforeTest
	public void testGetOrder(){
		driver = baseDriver.getDriver();
	} 
	@Test
	public void testOne(){
		System.out.print("class111");
		baseDriverinit.waitToDisplayed("fdafdafda", driver);
		System.out.print("class111111");
		
}
}
