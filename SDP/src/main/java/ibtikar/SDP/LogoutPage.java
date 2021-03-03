package ibtikar.SDP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends PageBase{

	public LogoutPage(WebDriver driver) {
		super(driver);
	}
	
	//drop down menu
	@FindBy()
	WebElement ddm;
	
	//logout button
	@FindBy()
	WebElement logoutBtn;
	
	public void logoutMethod() {
		
		ddm.click();
		logoutBtn.click();
		driver.getCurrentUrl();
	}
	
	public String getUrl() {
		return driver.getCurrentUrl();
	}
	
}
