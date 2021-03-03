package ibtikar.SDP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgetPasswordPage extends PageBase{

	public ForgetPasswordPage(WebDriver driver) {
		super(driver);
	}
	
	//forgetpassword link
	@FindBy()
	WebElement forgetPassword;
	
	//email field
	@FindBy()
	WebElement email;
	
	//send button
	@FindBy()
	WebElement sendBtn;
	
	//response message
	@FindBy()
	WebElement resMsg;
	
	//login url
	@FindBy()
	WebElement loginUrl;
	
	public void forgetPasswordMethod(String email_add) {
		
		forgetPassword.click();
		email.sendKeys(email_add);
		sendBtn.click();
	}
	
	public String getMessage() {
		return resMsg.getText();
	}
}
