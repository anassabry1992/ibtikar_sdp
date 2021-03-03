package ibtikar.SDP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteAttachNamePage extends PageBase{

	public DeleteAttachNamePage(WebDriver driver) {
		super(driver);
	}
	
	//delete button
	@FindBy()
	WebElement delBtn;
	
	//confirm button
	@FindBy()
	WebElement confirmBtn;
	
	//attach. name field in list
	@FindBy()
	WebElement attachNameList;
	
	public void deleteAttachNameMethod() {
		delBtn.click();
		confirmBtn.click();
	}
	
	public String getAttachName() {
		return attachNameList.getText();
	}
}
