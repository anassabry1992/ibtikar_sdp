package ibtikar.SDP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddAccount_MOSPage extends PageBase{

	public AddAccount_MOSPage(WebDriver driver) {
		super(driver);
	}
	
	//add button
	@FindBy()
	WebElement addBtn;
	
	//user name
	@FindBy()
	WebElement userName;
	
	//verification menu
	@FindBy()
	WebElement verMenu;
		
	//verification
	@FindBy()
	WebElement ver;
	
	//full name
	@FindBy()
	WebElement fullName;
	
	//mobile number
	@FindBy()
	WebElement mobile;
			
	//email
	@FindBy()
	WebElement email;
		
	//password
	@FindBy()
	WebElement password;
	
	//corp type
	@FindBy()
	WebElement corpType;
		
	//corp
	@FindBy()
	WebElement corp;
	
	//roles menu
	@FindBy()
	WebElement rolesMenu;
	
	//role
	@FindBy()
	WebElement role;
	
	//save button
	@FindBy()
	WebElement saveBtn;
	
	//username in the table
	@FindBy()
	WebElement userNameTable;
	
	//verification in the table
	@FindBy()
	WebElement verTable;
	
	public void addAccount_MOSMethod(String user_name) {
		addBtn.click();
		userName.sendKeys(user_name);
		verMenu.click();
		ver.click();
		corp.click();
		rolesMenu.click();
		role.click();
		saveBtn.click();
	}
	
	public String getFullName() {
		return fullName.getText();
	}
	
	public String getMobile() {
		return mobile.getText();
	}
	
	public String getEmail() {
		return email.getText();
	}
	
	public String getPassword() {
		return password.getText();
	}
	
	public String getCorpType() {
		return corpType.getText();
	}
	
	public String getCorp() {
		return corp.getText();
	}
	
	public String usernameInTable() {
		return userNameTable.getText();
	}
	
	public String verInTable() {
		return verTable.getText();
	}
}
