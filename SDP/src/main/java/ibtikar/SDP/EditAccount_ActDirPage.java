package ibtikar.SDP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditAccount_ActDirPage extends PageBase{

	public EditAccount_ActDirPage(WebDriver driver) {
		super(driver);
	}
	
	//edit button
	@FindBy()
	WebElement editBtn;
	
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
	
	public void editAccount_ActDirMethod() {
		editBtn.click();
		corpType.click();
		corpsMenu.click();
		corp.click();
		rolesMenu.click();
		role.click();
		saveBtn.click();
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
}
