package ibtikar.SDP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AttachNamePage extends PageBase{

	public AttachNamePage(WebDriver driver) {
		super(driver);
	}
	
	//add button
	@FindBy()
	WebElement addBtn;
	
	//attach. name field
	@FindBy()
	WebElement attachName;
	
	//save button
	@FindBy()
	WebElement saveBtn;
	
	//attach. name field in list
	@FindBy()
	WebElement attachNameList;
	
	//validation message
	@FindBy()
	WebElement msg;
	
	public void attachNameMethod(String attachNameTxt) {
		addBtn.click();
		attachName.sendKeys(attachNameTxt);
		saveBtn.click();
	}
	
	public String getAttachName() {
		return attachNameList.getText();
	}
	
	public String getMessage() {
		return msg.getText();
	}
}
