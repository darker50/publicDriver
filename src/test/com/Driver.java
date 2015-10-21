package test.com;

import java.net.URL;

import org.openqa.selenium.Capabilities;

import io.appium.java_client.android.AndroidDriver;

public class Driver extends AndroidDriver {
	static URL remoteAddress;
	static Capabilities desiredCapabilities;
	private Driver(URL remoteAddress, Capabilities desiredCapabilities) {
		super(remoteAddress, desiredCapabilities);
	}
	static  AndroidDriver  androidDriver;
	public static AndroidDriver getSharedInstance(URL remoteAddress, Capabilities desiredCapabilities){
		if (androidDriver==null) {
			androidDriver=new Driver(remoteAddress, desiredCapabilities);
		}
		return androidDriver;
	}

}
