package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import capabitity.Capabilities;
import io.appium.java_client.android.AndroidDriver;

public class LoginPage extends Capabilities{
	
	AndroidDriver<WebElement> driver;

	//Page factory
		@FindBy( id= "com.android.packageinstaller:id/permission_allow_button")
		WebElement permission_Allow_Button;
		
		@FindBy( id= "com.android.packageinstaller:id/username_button")
		WebElement userName;
		
		@FindBy( id= "com.android.packageinstaller:id/password_button")
		WebElement passWord;
		
		@FindBy( id= "com.android.packageinstaller:id/login_button")
		WebElement loginBtn;
		
		@FindBy( id= "com.android.packageinstaller:id/logout_button")
		WebElement logoutBtn;
			
		public LoginPage() {
			PageFactory.initElements(driver, this);
		}
		
		public void login_To_Facebook(String un ,String pwd) {
			
			waitFor_VisibilityOf(permission_Allow_Button, 3);
			permission_Allow_Button.click();
			
			waitFor_VisibilityOf(userName, 3);
			userName.sendKeys(un);
			passWord.sendKeys(pwd);
			loginBtn.click();
		
		}
		
		public void logout_Of_Facebook() {
			
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true)", logoutBtn);
		

		}
		
}
