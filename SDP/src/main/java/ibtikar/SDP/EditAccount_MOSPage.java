package ibtikar.SDP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditAccount_MOSPage extends PageBase{

	public EditAccount_MOSPage(WebDriver driver) {
		super(driver);
	}
	
	//edit button
	@FindBy()
	WebElement editBtn;
	
	//roles menu
	@FindBy()
	WebElement rolesMenu;
	
	//role
	@FindBy()
	WebElement role;
	
	//save button
	@FindBy()
	WebElement saveBtn;
	
	//role in the table
	@FindBy()
	WebElement roleTable;
	
	public void editAccount_MOSMethod() {
		editBtn.click();
		rolesMenu.click();
		role.click();
		saveBtn.click();
	}
	
	public String roleInTable() {
		return roleTable.getText();
	}
}
