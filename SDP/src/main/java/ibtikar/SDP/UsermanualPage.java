package ibtikar.SDP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsermanualPage extends PageBase{

	public UsermanualPage(WebDriver driver) {
		super(driver);
	}
	
	//drop down menu
	@FindBy()
	WebElement ddm;
	
	//usermanual button
	@FindBy()
	WebElement usermanualBtn;
	
	//download button
	@FindBy()
	WebElement downloadBtn;
	
	public void usermanualMethod() {
		
		ddm.click();
		usermanualBtn.click();
		downloadBtn.click();
	}	
}
