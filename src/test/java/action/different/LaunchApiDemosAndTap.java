package action.different;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class LaunchApiDemosAndTap {

	static AppiumDriver<WebElement> driver;
	@Test
	public void launchApiDemos() throws MalformedURLException
	{
DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Pixel 5");
		cap.setCapability("automationName", "Appium");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9");
		cap.setCapability("UDID", "emulator-5554");
		
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		
		cap.setCapability("noReset", true);
		URL url = new URL("http://localhost:4723/wd/hub");
		driver = new AndroidDriver(url,cap);
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement element = driver.findElementByAccessibilityId("Accessibility");
		
		driver.tap(1, element, 500);
		
		System.out.println("Pass");
	}
	
	public void tapOnElement(WebElement element)
	{
		driver.tap(1, element, 500);	
	}
	
	public static void scrollToElement(AndroidDriver driver, String an, String av) {
		  try {
		   Thread.sleep(3000);
		   driver.findElementByAndroidUIAutomator(
		     "new UiScrollable(new UiSelector()).scrollIntoView(" + an + "(\"" + av + "\"))");
		  } catch (InterruptedException ie) {
		  }
		 }

}
