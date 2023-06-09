package hybridTest;

import java.net.MalformedURLException;
import java.util.Properties;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pages.LoginPage;

public class FacebookLite extends LoginPage {
	
	public static Properties prop;
	AndroidDriver<AndroidElement> driver;
	
	@BeforeMethod
	public void setup() throws MalformedURLException {
		driver = capability();
	}
	
	@Test
	public void login() throws InterruptedException {
		login_To_Facebook(prop.getProperty("userName"), prop.getProperty("passWord"));
		logout_Of_Facebook();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();

	}
}