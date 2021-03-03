package ibtikar.SDP;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class EditAssocApprovTest extends TestBase2{
	
	protected String assocApprovTxt = "";
	protected String sportTxt = "";
	
	@Test(priority = 1)
	public void testAgeSettings() {
		new TestBase2().baseStep();
		EditAssocApprovPage editAssocApprov = new EditAssocApprovPage(driver);
		editAssocApprov.editAssocApprovMethod();
		assertEquals(editAssocApprov.getAssocApprov(), assocApprovTxt);
		assertEquals(editAssocApprov.getSport(), sportTxt);
	}
}