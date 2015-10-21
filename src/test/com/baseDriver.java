package test.com;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.appium.java_client.android.AndroidDriver;

public class baseDriver {
	private static AndroidDriver driver = null;
	public static AndroidDriver getDriver(){
		return creatDriver();
	}
	
	private static AndroidDriver creatDriver(){
		File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "apps");
        File app = new File(appDir, "t.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Android");
        capabilities.setCapability("platformVersion", "Android");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appPackage", "com.onebirds.xiaomi_t");
        capabilities.setCapability("appActivity", ".SplashActivity");
//      添加支持中文输入   Appium 1.3.3后
        capabilities.setCapability("unicodeKeyboard", true);
        capabilities.setCapability("resetKeyboard", false);
        
		try {
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver =Driver.getSharedInstance(url, capabilities);
		} catch (MalformedURLException  e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		return driver;
	}
	
	//智能等待的方法
	public boolean waitToDisplayed(String id, int outTime, AndroidDriver driver){
		boolean waitDisplayed = false;
		final By input_loc = By.id(id);
		waitDisplayed = new WebDriverWait(driver, outTime).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				return d.findElement(input_loc).isDisplayed();
			}
		});
		return waitDisplayed;
	}
	
	//智能等待的方法，默认10秒中
		public boolean waitToDisplayed(String id, AndroidDriver driver){
			boolean waitDisplayed = false;
			final By input_loc = By.id(id);
			waitDisplayed = new WebDriverWait(driver, 10).until(new ExpectedCondition<Boolean>() {
				public Boolean apply(WebDriver d) {
					return d.findElement(input_loc).isDisplayed();
				}
			});
			return waitDisplayed;
		}
}
