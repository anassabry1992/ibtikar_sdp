package ibtikar.SDP;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class AssocApprovTest extends TestBase2{
	
	protected String assocApprovTxt = "";
	protected String sportTxt = "";
	
	@Test(priority = 1)
	public void testAgeSettings() {
		new TestBase2().baseStep();
		AssocApprovPage assocApprov = new AssocApprovPage(driver);
		assocApprov.assocApprovMethod();
		assertEquals(assocApprov.getAssocApprov(), assocApprovTxt);
		assertEquals(assocApprov.getSport(), sportTxt);
	}
}