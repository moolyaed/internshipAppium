package general;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.android.AndroidDriver;

public class GeneralClass {

	public static Properties prop;
	public static AndroidDriver<WebElement> driver;
	
	public GeneralClass(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\admin\\Documents\\workspace-spring-tool-suite-4-4.17.1.RELEASE\\appiumIntership\\src\\main\\"
					+ "java\\config\\config.properties");
			prop.load(ip);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void waitFor_VisibilityOf(WebElement locator , int timeout){
		new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(locator));
	}
}
