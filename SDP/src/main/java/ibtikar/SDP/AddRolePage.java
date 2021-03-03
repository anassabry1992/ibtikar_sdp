package ibtikar.SDP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddRolePage extends PageBase{

	public AddRolePage(WebDriver driver) {
		super(driver);
	}
	
	//add button
	@FindBy()
	WebElement addBtn;
	
	//corp menu
	@FindBy()
	WebElement corpMenu;
	
	//corp
	@FindBy()
	WebElement corp;
	
	//role
	@FindBy()
	WebElement role;
	
	//permission
	@FindBy()
	WebElement permission;
	
	//save button
	@FindBy()
	WebElement saveBtn;
	
	//role in the table
	@FindBy()
	WebElement roleTable;
	
	public void addRoleMethod(String roleTxt) {
		addBtn.click();
		corpMenu.click();
		corp.click();
		role.sendKeys(roleTxt);
		permission.click();
		saveBtn.click();
	}
	
	public String roleInTable() {
		return roleTable.getText();
	}
}
