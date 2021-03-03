package ibtikar.SDP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActDeactAccountPage extends PageBase{

	public ActDeactAccountPage(WebDriver driver) {
		super(driver);
	}
	
	//act/deact button
	@FindBy()
	WebElement actDeactBtn;
	
	//confirm button
	@FindBy()
	WebElement confrimBtn;
	
	//act/deact status
	@FindBy()
	WebElement actDeactStatus;
	
	public void actDeactAccountMethod() {
		
		actDeactBtn.click();
		confrimBtn.click();
	}
	
	public String actDeactStatusCheck() {
		
		String att = "";
		return actDeactStatus.getAttribute(att);
	}
}
