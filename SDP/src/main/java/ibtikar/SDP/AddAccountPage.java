package ibtikar.SDP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddAccountPage extends PageBase{

	public AddAccountPage(WebDriver driver) {
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
	
	public void addAccountMethod(String user_name, String full_name, String mobile_no,
			String email_add,String passwrd) {
		addBtn.click();
		userName.sendKeys(user_name);
		verMenu.click();
		ver.click();
		fullName.sendKeys(full_name);
		mobile.sendKeys(mobile_no);
		email.sendKeys(email_add);
		password.sendKeys(passwrd);
		corpTypeMenu.click();
		corpType.click();
		corpsMenu.click();
		corp.click();
		rolesMenu.click();
		role.click();
		saveBtn.click();
	}
	
	public String userNameInTable() {
		return userNameTable.getText();
	}
}
