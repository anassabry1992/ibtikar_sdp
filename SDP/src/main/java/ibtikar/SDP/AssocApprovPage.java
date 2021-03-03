package ibtikar.SDP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AssocApprovPage extends PageBase{

	public AssocApprovPage(WebDriver driver) {
		super(driver);
	}
	
	//add button
	@FindBy()
	WebElement addBtn;
	
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
	
	public void assocApprovMethod() {
		addBtn.click();
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
