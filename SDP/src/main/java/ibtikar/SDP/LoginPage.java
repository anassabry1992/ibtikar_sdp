package ibtikar.SDP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	//username field
	@FindBy(name = "userName")
	WebElement userNameTxt;
	
	//password field
	@FindBy(name = "password")
	WebElement passwordTxt;
	
	//login button
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[1]/div/div[2]/form/div[4]/button")
	WebElement loginBtn;
	
	//response message
	@FindBy(className = "invalid-feedback")
	WebElement resMsg;
	
	public void loginMethod(String username,String password) {
		
		userNameTxt.clear();
		userNameTxt.sendKeys(username);
		passwordTxt.clear();
		passwordTxt.sendKeys(password);
		loginBtn.click();
	}
	
	public void emptyLoginMethod() {
		
		loginBtn.click();
	}
	
	public String getMessage() {
		return resMsg.getText();
	}
	
}
