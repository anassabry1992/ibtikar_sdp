package ibtikar.SDP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logs_filterByKeyword extends PageBase{

	public Logs_filterByKeyword(WebDriver driver) {
		super(driver);
	}
	
	//keyword field
	@FindBy()
	WebElement keyword;
	
	public void keywordMethod(String key_word) {
		
		keyword.sendKeys(key_word);
	}
	
}
