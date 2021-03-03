package ibtikar.SDP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteAssocApprovPage extends PageBase{

	public DeleteAssocApprovPage(WebDriver driver) {
		super(driver);
	}
	
	//delete button
	@FindBy()
	WebElement delBtn;
	
	//confirm button
	@FindBy()
	WebElement confirmBtn;
	
	//association name in list
	@FindBy()
	WebElement assocApprovList;
	
	//sport name in list
	@FindBy()
	WebElement sportList;
	
	public void deleteAssocApprovMethod() {
		delBtn.click();
		confirmBtn.click();
	}
	
	public String getAssocApprov() {
		return assocApprovList.getText();
	}
	
	public String getSport() {
		return sportList.getText();
	}
}
