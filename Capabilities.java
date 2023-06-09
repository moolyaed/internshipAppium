package capabitity;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import org.openqa.selenium.remote.DesiredCapabilities;
import general.GeneralClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class Capabilities extends GeneralClass{
	
	public static Properties prop;
	
	public static AndroidDriver<AndroidElement> capability() throws MalformedURLException{
		
		DesiredCapabilities dc=new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, prop.getProperty("deviceName") );
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, prop.getProperty("platformName"));
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, prop.getProperty("appPackage") );
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, prop.getProperty("appActivity"));
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.ANDROID_UIAUTOMATOR2);
		dc.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, prop.getProperty("chromeDriver"));
		AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		return driver;
	}

}
