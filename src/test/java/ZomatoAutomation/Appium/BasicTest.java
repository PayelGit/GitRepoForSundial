package ZomatoAutomation.Appium;

import java.io.File;

import java.net.MalformedURLException;

import java.net.URL;


import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.android.options.UiAutomator2Options;

import io.appium.java_client.service.local.*;



public class BasicTest 
{

    @BeforeTest
    public void setUp() throws MalformedURLException {
    	
    
    }
//    @Test
//    public void googlePlayStoreTest()
//    {
//
//    	AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\anupd\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).withIPAddress("127.0.0.1").usingPort(4723).build();
//
//		 
//
//		//        service.start();
//
//		        
//
//		        UiAutomator2Options options = new UiAutomator2Options();
//
//		        options.setDeviceName("Payel Phone");
//
//		        options.setApp("C:\\Users\\anupd\\eclipse-workspace\\ZomatoAutomation\\src\\test\\java\\resources\\ApiDemos-debug.apk");
//
//		        
//
//		        AndroidDriver driver = new AndroidDriver( new URL("http://127.0.0.1:4723"), options);
//
//				Activity activity = new Activity();
//    }
//    @AfterTest
//    public void tearDown()
//    {
//
//        if(driver!= null)
//        {
//            driver.quit();
//        }
//    }
}
