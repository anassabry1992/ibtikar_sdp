package ibtikar.SDP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteAccountPage extends PageBase{

	public DeleteAccountPage(WebDriver driver) {
		super(driver);
	}
	
	//edit button
	@FindBy()
	WebElement delBtn;
	
	//confirm button
	@FindBy()
	WebElement confrimBtn;
	
	public void delAccountMethod() {
		
		delBtn.click();
		confrimBtn.click();
	}
}
