package ibtikar.SDP;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class DeleteAssocApprovTest extends TestBase2{
	
	protected String assocApprovTxt = "";
	protected String sportTxt = "";
	
	@Test(priority = 1)
	public void testAgeSettings() {
		new TestBase2().baseStep();
		DeleteAssocApprovPage deleteAssocApprov = new DeleteAssocApprovPage(driver);
		deleteAssocApprov.deleteAssocApprovMethod();
		assertEquals(deleteAssocApprov.getAssocApprov(), assocApprovTxt);
		assertEquals(deleteAssocApprov.getSport(), sportTxt);
	}
}