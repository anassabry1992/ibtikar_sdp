package ibtikar.SDP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditAccountPage extends PageBase{

	public EditAccountPage(WebDriver driver) {
		super(driver);
	}
	
	//edit button
	@FindBy()
	WebElement editBtn;
	
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
	
	//user name in the table
	@FindBy()
	WebElement userNameTable;
	
	//full name in the table
	@FindBy()
	WebElement fullNameTable;
	
	//corp type in the table
	@FindBy()
	WebElement corpTypeTable;
	
	//corp in the table
	@FindBy()
	WebElement corpTable;
	
	//role in the table
	@FindBy()
	WebElement roleTable;
		
	//verification in the table
	@FindBy()
	WebElement verTable;
	
	public void editAccountMethod(String full_name, String mobile_no, String email_add) {
		editBtn.click();
		verMenu.click();
		ver.click();
		fullName.sendKeys(full_name);
		mobile.sendKeys(mobile_no);
		email.sendKeys(email_add);
		corpTypeMenu.click();
		corpType.click();
		corpsMenu.click();
		corp.click();
		rolesMenu.click();
		role.click();
		saveBtn.click();
	}
	
	public String fullNameInTable() {
		return fullNameTable.getText();
	}
	
	public String corpTypeInTable() {
		return corpTypeTable.getText();
	}
	
	public String corpInTable() {
		return corpTable.getText();
	}
	
	public String roleInTable() {
		return roleTable.getText();
	}
	
	public String verInTable() {
		return verTable.getText();
	}
}
