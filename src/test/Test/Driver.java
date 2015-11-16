package test.Test;

import java.net.URL;

import org.apache.xpath.operations.And;
import org.openqa.selenium.Capabilities;

import io.appium.java_client.android.AndroidDriver;

public class Driver extends NicePush {
	static URL remoteAddress;
	static Capabilities desiredCapabilities;
	static Driver androidDriver;
	public Driver(){
		super();
		System.out.println("Driver.NicePush");
		
	}
	
	public static Driver getShareIntanced( ){
		if (androidDriver == null) {
			androidDriver  = new Driver();
		}
		return androidDriver;
	}
}
class  NicePush{
	 public NicePush() {
		System.out.println("NicePush");
	}
}