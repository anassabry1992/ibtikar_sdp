package ibtikar.SDP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangePasswordPage extends PageBase{

	public ChangePasswordPage(WebDriver driver) {
		super(driver);
	}
	
	//drop down menu
	@FindBy()
	WebElement ddm;
	
	//change password button
	@FindBy()
	WebElement changePasswordBtn;
	
	//current password field
	@FindBy()
	WebElement crntPassword;
	
	//new password field
	@FindBy()
	WebElement newPassword;
		
	//confirm password field
	@FindBy()
	WebElement cnfrmPassword;
		
	//submit button
	@FindBy()
	WebElement submitBtn;
	
	//message
	@FindBy()
	WebElement message;
	
	public void changePasswordMethod(String crntPass, String newPass, String cnfrmPass) {
		
		ddm.click();
		changePasswordBtn.click();
		crntPassword.sendKeys(crntPass);
		newPassword.sendKeys(newPass);
		cnfrmPassword.sendKeys(cnfrmPass);
		submitBtn.click();
	}
	
	public String getMessage() {
		
		return message.getText();
	}
}
