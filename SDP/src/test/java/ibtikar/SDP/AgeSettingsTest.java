package ibtikar.SDP;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class AgeSettingsTest extends TestBase2{
	
	protected String ageTxt = "";
	protected String msg = "";
	
	@Test(priority = 1)
	public void testAgeSettings() {
		new TestBase2().baseStep();
		AgeSettingsPage ageSettings = new AgeSettingsPage(driver);
		ageSettings.ageSettingsMethod(ageTxt);
		assertEquals(ageSettings.getAge(), ageTxt);
		assertEquals(ageSettings.getMessage(), msg);
	}
}