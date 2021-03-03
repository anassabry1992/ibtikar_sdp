package ibtikar.SDP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteRolePage extends PageBase{

	public DeleteRolePage(WebDriver driver) {
		super(driver);
	}
	
	//edit button
	@FindBy()
	WebElement delBtn;
	
	//confirm button
	@FindBy()
	WebElement confrimBtn;
	
	public void delRoleMethod() {
		
		delBtn.click();
		confrimBtn.click();
	}
}
