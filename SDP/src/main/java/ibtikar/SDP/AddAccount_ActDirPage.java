package ibtikar.SDP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddAccount_ActDirPage extends PageBase{

	public AddAccount_ActDirPage(WebDriver driver) {
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
	
	//corp type menu
	@FindBy()
	WebElement corpTypeMenu;
	
	//corp type
	@FindBy()
	WebElement corpType;
	
	//corps menu
	@FindBy()
	WebElement corpsMenu;
		
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
	
	public void addAccount_ActDirMethod(String user_name) {
		addBtn.click();
		userName.sendKeys(user_name);
		verMenu.click();
		ver.click();
		corpTypeMenu.click();
		corpType.click();
		corpsMenu.click();
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
	
	public String usernameInTable() {
		return userNameTable.getText();
	}
	
	public String verInTable() {
		return verTable.getText();
	}
}
