package ibtikar.SDP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Roles_filterByCorp extends PageBase{

	public Roles_filterByCorp(WebDriver driver) {
		super(driver);
	}
	
	//corp menu
	@FindBy()
	WebElement corpMenu;
	
	//selected corp 
	@FindBy()
	WebElement corp;
	
	public void corpSelectMethod() {
		
		corpMenu.click();
		corp.click();
	}
	
}
