package app.install;

import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class InstallApp {
static AppiumDriver<WebElement> driver;
	
@Test
	public static void installApp() throws Exception {

DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Pixel 5");
		cap.setCapability("automationName", "Appium");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9");
		cap.setCapability("UDID", "emulator-5554");
		
		//To Install App
		cap.setCapability("app", "C:\\Users\\ankus\\Desktop\\Appium\\ApiDemos-debug.apk");
		
		URL url = new URL("http://localhost:4723/wd/hub");
		driver = new AndroidDriver<WebElement>(url,cap);
		System.out.println("Pass");
}
}
