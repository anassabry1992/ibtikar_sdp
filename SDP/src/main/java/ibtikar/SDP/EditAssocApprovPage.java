package ibtikar.SDP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditAssocApprovPage extends PageBase{

	public EditAssocApprovPage(WebDriver driver) {
		super(driver);
	}
	
	//edit button
	@FindBy()
	WebElement editBtn;
	
	//associations menu
	@FindBy()
	WebElement assocMenu;
	
	//association
	@FindBy()
	WebElement assoc;
	
	//sports menu
	@FindBy()
	WebElement sportMenu;
	
	//sport
	@FindBy()
	WebElement sport;
	
	//save button
	@FindBy()
	WebElement saveBtn;
	
	//association name in list
	@FindBy()
	WebElement assocApprovList;
	
	//sport name in list
	@FindBy()
	WebElement sportList;
	
	public void editAssocApprovMethod() {
		editBtn.click();
		assocMenu.click();
		assoc.click();
		sportMenu.click();
		sport.click();
		saveBtn.click();
	}
	
	public String getAssocApprov() {
		return assocApprovList.getText();
	}
	
	public String getSport() {
		return sportList.getText();
	}
}
