package ibtikar.SDP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditRolePage extends PageBase{

	public EditRolePage(WebDriver driver) {
		super(driver);
	}
	
	//edit button
	@FindBy()
	WebElement editBtn;
	
	//corp in the table
	@FindBy()
	WebElement corpTable;
		
	//permission in the table
	@FindBy()
	WebElement permissionTable;
	
	public void editRoleMethod(String roleTxt) {
		
		new AddRolePage(driver).corpMenu.click();
		new AddRolePage(driver).corp.click();
		new AddRolePage(driver).role.sendKeys(roleTxt);
		new AddRolePage(driver).permission.click();
		new AddRolePage(driver).saveBtn.click();
	}
	
	public String corpInTable() {
		return corpTable.getText();
	}
	
	public String roleInTable() {
		return new AddRolePage(driver).roleTable.getText();
	}
	
	public String permissionInTable() {
		return permissionTable.getText();
	}
}
