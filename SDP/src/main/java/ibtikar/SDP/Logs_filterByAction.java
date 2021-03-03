package ibtikar.SDP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logs_filterByAction extends PageBase{

	public Logs_filterByAction(WebDriver driver) {
		super(driver);
	}
	
	//action menu
	@FindBy()
	WebElement actionMenu;
	
	//selected corp 
	@FindBy()
	WebElement action;
	
	public void actionSelectMethod() {
		
		actionMenu.click();
		action.click();
	}
	
}
