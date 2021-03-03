package ibtikar.SDP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AgeSettingsPage extends PageBase{

	public AgeSettingsPage(WebDriver driver) {
		super(driver);
	}
	
	//age
	@FindBy()
	WebElement age;
	
	//save button
	@FindBy()
	WebElement saveBtn;
	
	//validation message
	@FindBy()
	WebElement msg;
	
	public void ageSettingsMethod(String ageTxt) {
		age.sendKeys(ageTxt);
		saveBtn.click();
	}
	
	public String getAge() {
		return age.getText();
	}
	
	public String getMessage() {
		return msg.getText();
	}
}
