package appiumBasic;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class basicTest {

	@Test
	public void basicAppiumTest() throws MalformedURLException
	{
		UiAutomator2Options opt = new UiAutomator2Options();
		opt.setDeviceName("TestPhone");
		opt.setApp("C:\\Users\\Payel\\eclipse-workspace\\Appium\\src\\test\\java\\resources\\ApiDemos-debug.apk");
		
		AppiumDriver driver = new AppiumDriver(new URL("http://127.0.0.1:4723"), opt);
		driver.quit();
		System.out.println("done!!!!");
		
	}
}
